import React, { useState } from 'react';
import './CurrencyConvertor.css';

function CurrencyConvertor() {
  const [amount, setAmount] = useState('');
  const [currency, setCurrency] = useState('');

  const handleSubmit = (e) => {
    e.preventDefault();
    if (currency === 'Euro') {
      alert(`Converting to Euro Amount is ${amount * 80}`);
    } else {
      alert('Please select Euro');
    }
  };

  return (
    <div>
      <h2 className="heading">Currency Convertor!!!</h2>
      <form onSubmit={handleSubmit}>
        <label>Amount:</label>
        <input type="text" value={amount} onChange={(e) => setAmount(e.target.value)} />
        <br /><br />
        <label>Currency:</label>
        <select value={currency} onChange={(e) => setCurrency(e.target.value)}>
          <option value="">Select</option>
          <option value="Euro">Euro</option>
        </select>
        <br /><br />
        <button type="submit">Submit</button>
      </form>
    </div>
  );
}

export default CurrencyConvertor;
