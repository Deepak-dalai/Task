import React from 'react';
import { useDispatch } from 'react-redux';
import { addToCart } from '../redux/actions/cartActions';



const ProductList = ({products}) => {
  const dispatch = useDispatch();

  const handleAddToCart = (product) => {
    dispatch(addToCart(product));
  };

  return (
    <div>
      <h2>Products</h2>
      <ul>
        {products.map((product) => (
          <li key={product.id}>
            <h3>{product.name}</h3>
            <p>{product.description}</p>
            <p>${product.price}</p>
            <button onClick={() => handleAddToCart(product)}>Add to Cart</button>
          </li>
        ))}
      </ul>
      
    </div>
  );
};

export default ProductList;
