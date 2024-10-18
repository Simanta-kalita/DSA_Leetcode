
import React, {useState} from 'react'

export function App() {

  const [count, setCount] = useState(() => 0);

  const changeCount = (diff: number) => {
    setCount((num) => (num + diff) );
  }


  return (
    <div>
      <button onClick={() => changeCount(-1)} data-testid="decrement-button">-</button>
      <button onClick={() => changeCount(1)} data-testid="increment-button">+</button>
      <p>clicked: {count}</p>
    </div>
  )
}

// run your code by clicking the run button on the right




