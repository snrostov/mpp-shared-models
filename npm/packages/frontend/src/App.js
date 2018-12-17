import React, {Component} from 'react';
import './App.css';

import {account} from 'shared'
import Table from "@material-ui/core/es/Table/Table";
import TableHead from "@material-ui/core/es/TableHead/TableHead";
import TableRow from "@material-ui/core/es/TableRow/TableRow";
import TableCell from "@material-ui/core/es/TableCell/TableCell";
import Paper from "@material-ui/core/es/Paper/Paper";
import Toolbar from "@material-ui/core/es/Toolbar/Toolbar";
import IconButton from "@material-ui/core/es/IconButton/IconButton";
import DeleteIcon from '@material-ui/icons/Delete';
import AddIcon from '@material-ui/icons/Add';
import PublishIcon from '@material-ui/icons/Publish';
import TrendingUpIcon from '@material-ui/icons/TrendingUp';
import Checkbox from "@material-ui/core/es/Checkbox/Checkbox";
import TableBody from "@material-ui/core/es/TableBody/TableBody";
import TextField from "@material-ui/core/es/TextField/TextField";

class App extends Component {
    render() {
        return <div style={{padding: 40}}>
            <Transfers></Transfers>
        </div>
    }
}

class Transfers extends Component {
    constructor(props, context) {
        super(props, context);

        this.state = {
            list: [
                new account.Transfer(account.LocalDateTime_61zpoe$("2018-12-20T09:42"), "employer", "salary", 10000),
                new account.Transfer(account.LocalDateTime_61zpoe$("2018-12-21T09:42"), "shop", "food", -700)
            ],
            selected: 0
        }
    }

    get kotlinList() {
        return account.transfers(this.state.list)
    }

    render() {
        return [
            <Paper key="list">
                <Table style={{position: "relative"}}>
                    <TableHead>
                        <TableRow>
                            <TableCell style={{width: "1px"}} padding="checkbox"/>
                            <TableCell padding="none">Date</TableCell>
                            <TableCell>Partner</TableCell>
                            <TableCell>Description</TableCell>
                            <TableCell>Amount</TableCell>
                        </TableRow>
                    </TableHead>
                    <TableBody>
                        {this.state.list.map((item, i) =>
                            <TableRow key={i} onClick={this.select.bind(this, i)}>
                                <TableCell padding="checkbox"><Checkbox checked={i == this.state.selected}/></TableCell>
                                <TableCell padding="none">{item.time.toString()}</TableCell>
                                <TableCell>{item.partner}</TableCell>
                                <TableCell>{item.description}</TableCell>
                                <TableCell>{item.amount}</TableCell>
                            </TableRow>)}
                    </TableBody>
                </Table>
            </Paper>,
            <Paper key="selected" style={{marginTop: 20, padding: 20}}>
                <Toolbar>
                    <TransferEditor
                        item={this.state.list[this.state.selected]}
                        edit={this.update.bind(this, this.state.selected)}
                    />
                    <IconButton onClick={this.duplicate.bind(this, this.state.selected)}><AddIcon/></IconButton>
                    <IconButton onClick={this.delete.bind(this, this.state.selected)}><DeleteIcon/></IconButton>
                    <IconButton onClick={this.post.bind(this)}><PublishIcon/></IconButton>
                    <IconButton onClick={this.overallStats.bind(this)}><TrendingUpIcon/></IconButton>
                </Toolbar>
            </Paper>,
            <Paper key="summary" style={{marginTop: 20, padding: 20}}>
                <div>
                    Balance: {account.balance(this.kotlinList)}
                </div>
                <h2>Partners</h2>

                {this.byAccount(this.kotlinList)}

                <h2>Months</h2>

                <Table>
                    <TableBody>
                        {account.mapEntries(account.byMonth(this.kotlinList)).map(i =>
                            <TableRow key={i}>
                                <TableCell>{i.key.toString()}</TableCell>
                                <TableCell>{this.byAccount(i.value)}</TableCell>
                            </TableRow>
                        )}
                    </TableBody>
                </Table>
            </Paper>
        ]
    }

    select(i) {
        this.setState(state => {
            state.selected = i;
            return state
        })
    }

    duplicate(i) {
        this.setState(state => {
            let selected = state.list[i]
            state.list.push(
                new account.Transfer(
                    selected.time,
                    selected.partner,
                    selected.description,
                    selected.amount
                )
            );
            state.selected = state.list.length - 1;
            return state
        })
    }

    delete(i) {
        this.setState(state => {
            state.list = state.list.splice(i);
            return state
        })
    }

    update(i, value) {
        this.setState(state => {
            state.list[i] = value;
            console.log(value);
            return state
        })
    }

    post() {
        fetch('http://127.0.0.1:8080', {
            method: 'POST',
            body: account.transfersToJson(this.kotlinList)
        });
    }

    overallStats() {
        fetch('http://127.0.0.1:8080')
            .then(it => it.text())
            .then(json => {
                alert(json)
            })
    }

    byAccount(items) {
        return <Table style={{width: 400}}>
            <TableBody>
                {account.mapEntries(account.balanceByAccount(items)).map(i =>
                    <TableRow key={i}>
                        <TableCell>{i.key}</TableCell>
                        <TableCell>{i.value}</TableCell>
                    </TableRow>
                )}
            </TableBody>
        </Table>
    }
}

class TransferEditor extends Component {
    get item() {
        return this.props.item
    }

    render() {
        return [
            this.field("Date", "time", {type: "datetime-local"},
                value => account.LocalDateTime_61zpoe$(value)),
            this.field("Partner", "partner"),
            this.field("Description", "description"),
            this.field("Amount", "amount", {type: "number"},
                value => Number.parseInt(value))
        ]
    }

    field(title, name, props, valueProvider) {
        return React.createElement(TextField, {
            key: name,
            label: title,
            InputLabelProps: {shrink: true},
            value: this.item[name].toString(),
            onChange: this.update.bind(this, name, valueProvider || (value => value)),
            ...props
        });
    }

    update(field, value, event) {
        this.item[field] = value(event.target.value);
        this.props.edit(this.item)
    }
}

export default App;
