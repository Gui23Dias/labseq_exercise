import React, { Component } from 'react';

class InputComponent extends Component {
    constructor(props) {
        super(props);
        this.state = {
            inputValue: ''
        };
    }

    handleInputChange = (event) => {
        this.setState({ inputValue: event.target.value });
    };

    handleCalculateClick = () => {
        const { inputValue } = this.state;
        this.props.calculateLabseqValue(inputValue);
    };

    render() {
        return (
            <div>
                <input type="number" value={this.state.inputValue} onChange={this.handleInputChange} />
                <button onClick={this.handleCalculateClick}>Calculate</button>
            </div>
        );
    }
}

export default InputComponent;
