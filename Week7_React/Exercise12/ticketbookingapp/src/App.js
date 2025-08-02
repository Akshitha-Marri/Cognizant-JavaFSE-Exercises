import React, { Component } from 'react';

class App extends Component {
  constructor() {
    super();
    this.state = {
      isLoggedIn: false
    };
  }

  handleLogin = () => {
    this.setState({ isLoggedIn: true });
  };

  handleLogout = () => {
    this.setState({ isLoggedIn: false });
  };

  render() {
    let content;

    if (this.state.isLoggedIn) {
      content = (
        <div>
          <h2>Welcome, User!</h2>
          <p>You can now book your tickets.</p>
          <button onClick={this.handleLogout}>Logout</button>
        </div>
      );
    } else {
      content = (
        <div>
          <h2>Welcome, Guest!</h2>
          <p>Here are today's flight listings:</p>
          <ul>
            <li>✈️ Mumbai → Delhi — ₹4000</li>
            <li>✈️ Bangalore → Hyderabad — ₹2500</li>
            <li>✈️ Chennai → Pune — ₹3000</li>
          </ul>
          <button onClick={this.handleLogin}>Login</button>
        </div>
      );
    }

    return (
      <div className="App" style={{ padding: '20px', fontFamily: 'Arial' }}>
        <h1>✈️ Ticket Booking App</h1>
        {content}
      </div>
    );
  }
}

export default App;
