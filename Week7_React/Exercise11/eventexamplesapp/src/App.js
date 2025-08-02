import React, { Component } from 'react';
import CurrencyConvertor from './CurrencyConvertor';

class App extends Component {
  constructor() {
    super();
    this.state = {
      count: 0,
      message: ''
    };
  }

  increment = () => {
    this.setState({ count: this.state.count + 1 });
    this.sayHello();
    this.staticMessage();
  };

  decrement = () => {
    this.setState({ count: this.state.count - 1 });
  };

  sayHello = () => {
    console.log("Hello!");
  };

  staticMessage = () => {
    this.setState({ message: "You clicked increment!" });
  };

  sayWelcome = (msg) => {
    alert(`Message: ${msg}`);
  };

  handleSyntheticEvent = (e) => {
    e.preventDefault();
    alert("I was clicked");
  };

  render() {
    return (
      <div style={{ padding: '20px' }}>
        <h1>React Event Examples</h1>

        <h2>Counter: {this.state.count}</h2>
        <button onClick={this.increment}>Increment</button>
        <button onClick={this.decrement}>Decrement</button>
        <p>{this.state.message}</p>

        <br /><br />
        <button onClick={() => this.sayWelcome("welcome")}>Say Welcome</button>

        <br /><br />
        <button onClick={this.handleSyntheticEvent}>Synthetic Event</button>

        <br /><br />
        <CurrencyConvertor />
      </div>
    );
  }
}

export default App;
