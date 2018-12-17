package sample

import account.Transfer
import account.balance
import account.byMonth
import io.ktor.application.call
import io.ktor.application.install
import io.ktor.features.CORS
import io.ktor.request.receiveText
import io.ktor.response.respond
import io.ktor.routing.get
import io.ktor.routing.post
import io.ktor.routing.routing
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty
import kotlinx.serialization.ImplicitReflectionSerializer
import kotlinx.serialization.json.JSON
import kotlinx.serialization.list
import kotlinx.serialization.stringify
import java.io.File
import java.text.SimpleDateFormat
import java.util.*

@ImplicitReflectionSerializer
fun main() {
    val storage = TransfersStorage(File("local"))

    embeddedServer(Netty, port = 8080, host = "127.0.0.1") {
        install(CORS) {
            anyHost()
        }

        routing {
            get {
                call.respond(
                    JSON.stringify(
                        storage.getAll()
                            .byMonth()
                            .map { it.key.toString() to it.value.balance() }
                            .toMap()
                    )
                )
            }
            post {
                storage.append(JSON.parse(Transfer.serializer().list, call.receiveText()))
                call.respond("")
            }
        }
    }.start(wait = true)
}

class TransfersStorage(val dir: File) {
    val df = SimpleDateFormat("yyyy-MM-dd_hh-mm-ss")

    fun append(transfers: List<Transfer>) {
        dir.resolve(df.format(Date()) + ".json").writer().use { writer ->
            transfers.forEach {
                writer.write(JSON.stringify(Transfer.serializer(), it) + "\n")
            }
        }
    }

    fun getAllFrom(file: File) = file.readLines().map { JSON.parse(Transfer.serializer(), it) }

    fun getAll() = dir.listFiles().flatMap { getAllFrom(it) }
}