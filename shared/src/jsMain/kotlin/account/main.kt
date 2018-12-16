package account

@JsName("transfers")
fun transfers(array: Array<Transfer>) = array.toList()

@JsName("mapEntries")
fun mapEntries(map: Map<Any, Any>): Array<Any> = map.entries.toTypedArray()