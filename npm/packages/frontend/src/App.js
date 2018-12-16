import React, {Component} from 'react';
import logo from './logo.svg';
import './App.css';

import {LocalDate, ZoneId} from 'js-joda'
import {account} from 'shared'

class App extends Component {
    render() {
        return (
            <div className="App" onClick={this.test}>
                <header className="App-header">
                    <img src={logo} className="App-logo" alt="logo"/>
                    <p>
                        Edit <code>src/App.js</code> and save to reload 123.
                    </p>
                    <a
                        className="App-link"
                        href="https://reactjs.org"
                        target="_blank"
                        rel="noopener noreferrer"
                    >
                        Learn React
                    </a>
                </header>
            </div>
        );
    }


    test() {
        let date = LocalDate.parse("2017-12-20").atStartOfDay(ZoneId.of("GMT+4")).toInstant();

        alert(new account.MoneyTransfer('employee', "salary", 1000.0, date))
    }
}

export default App;
