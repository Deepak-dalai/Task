
import React from 'react';
import './Navbar.css'; 
import { useSelector } from 'react-redux';
import { Link } from 'react-router-dom';

const Navbar = () => {
    const cartItems = useSelector(state => state.cart.items);
  const itemCount = cartItems.length;
  return (
    <nav className="navbar">
      <div className="navbar-logo">
        <a href="/">MyShop</a>
      </div>
      <ul className="navbar-links">
        <li>
          <a href="/">Home</a>
        </li>
        <li>
          <Link to="/cart">Cart<span>({itemCount })</span></Link>
        </li>
      </ul>
    </nav>
  );
};

export default Navbar;
