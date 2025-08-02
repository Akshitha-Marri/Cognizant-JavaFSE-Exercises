import React, { Component } from 'react';

class CurrencyConvertor extends Component {
  constructor() {
    super();
    this.state = {
      rupees: '',
      euros: ''
    };
  }

  handleChange = (e) => {
    this.setState({ rupees: e.target.value });
  };

  handleSubmit = (e) => {
    e.preventDefault();
    const euroRate = 0.011; // ₹1 = €0.011
    const euros = (this.state.rupees * euroRate).toFixed(2);
    this.setState({ euros });
  };

  render() {
    return (
      <div style={{ marginTop: '40px' }}>
        <h2>Currency Convertor</h2>
        <form onSubmit={this.handleSubmit}>
          <input
            type="number"
            value={this.state.rupees}
            onChange={this.handleChange}
            placeholder="Enter amount in INR"
          />
          <button type="submit">Convert</button>
        </form>
        <p>Equivalent in Euros: €{this.state.euros}</p>
      </div>
    );
  }
}

export default CurrencyConvertor;
