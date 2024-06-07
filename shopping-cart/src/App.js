import React from 'react';
import { Provider } from 'react-redux';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import store from './redux/store';
import ProductList from './components/ProductList';
import Cart from './components/Cart';
import './App.css';
import Navbar from './components/Navbar';

const products = [
  { id: 1, name: 'Product 1', price: 100, description: 'Description of Product 1' },
  { id: 2, name: 'Product 2', price: 200, description: 'Description of Product 2' },
  { id: 3, name: 'Product 3', price: 300, description: 'Description of Product 3' },
];

const App = () => {
  return (
    <Provider store={store}>
      <Router>
        <Navbar/>
        <div className="App">
          <h1>Shopping Cart</h1>
          <Routes>
            <Route path="/" element={<ProductList products={products}/>} />
            <Route path="/cart" element={<Cart />} />
          </Routes>
        </div>
      </Router>
    </Provider>
  );
};

export default App;
