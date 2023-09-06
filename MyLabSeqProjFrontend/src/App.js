import logo from './logo.svg';
import './App.css';
import React, { Component } from 'react';
import InputComponent from './components/InputComponent';
import DisplayComponent from './components/DisplayComponent';
import ApiService from './ApiService';


class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
      labseqValue: null
    };
  }

  calculateLabseqValue = (index) => {
    ApiService.calculateLabseqValue(index)
        .then(value => {
          this.setState({ labseqValue: value });
        })
        .catch(error => {
          console.error('Error calculating Labseq value:', error);
        });
  };

  render() {
    return (
        <div>
          <h1>Labseq Calculator</h1>
          <InputComponent calculateLabseqValue={this.calculateLabseqValue} />
          <DisplayComponent labseqValue={this.state.labseqValue} />
        </div>
    );
  }
}

export default App;

