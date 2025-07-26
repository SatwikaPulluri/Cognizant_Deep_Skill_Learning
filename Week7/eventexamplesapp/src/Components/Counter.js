import React, { useState } from 'react';

function Counter() {
  const [count, setCount] = useState(1);

  const sayHello = () => {
    alert("Hello! This is a static message.");
  };

  const handleIncrement = () => {
    setCount(count + 1);
    sayHello();
  };

  const handleDecrement = () => {
    setCount(count - 1);
  };

  const sayWelcome = (msg) => {
    alert(msg);
  };

  const handleClick = () => {
    alert("I was clicked");
  };

  return (
    <div>
      <p>{count}</p>
      <button onClick={handleIncrement}>Increment</button>
      <button onClick={handleDecrement}>Decrement</button>
      <br /><br />
      <button onClick={() => sayWelcome("Welcome!")}>Say welcome</button>
      <br /><br />
      <button onClick={handleClick}>Click on me</button>
    </div>
  );
}

export default Counter;
