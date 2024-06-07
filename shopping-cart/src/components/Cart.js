import React from 'react';
import { useSelector, useDispatch } from 'react-redux';
import { removeFromCart, clearCart } from '../redux/actions/cartActions';
import { Link } from 'react-router-dom';

const Cart = () => {
  const items = useSelector((state) => state.cart.items);
  const dispatch = useDispatch();

  const handleRemoveFromCart = (productId) => {
    dispatch(removeFromCart(productId));
  };

  const handleClearCart = () => {
    dispatch(clearCart());
  };

  return (
    <div>
      <h2>Cart</h2>
      {items.length === 0 ? (
        <p>Cart is empty</p>
      ) : (
        <ul>
          {items.map((item) => (
            <li key={item.id}>
              <h3>{item.name}</h3>
              <p>{item.description}</p>
              <p>${item.price} x {item.quantity}</p>
              <button onClick={() => handleRemoveFromCart(item.id)}>Remove</button>
            </li>
          ))}
        </ul>
      )}
      {items.length > 0 && (
        <>
          <button onClick={handleClearCart}>Clear Cart</button>
          <Link to="/">Continue Shopping</Link>
        </>
      )}
    </div>
  );
};

export default Cart;
