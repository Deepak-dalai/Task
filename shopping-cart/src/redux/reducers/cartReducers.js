import { ADD_TO_CART, REMOVE_FROM_CART, CLEAR_CART } from '../actions/cartActions';

const initialState = {
  items: [],
};

const cartReducers = (state = initialState, action) => {
  switch (action.type) {
    case ADD_TO_CART:
      const item = action.payload;
      const existingItem = state.items.find((items) => items.id === item.id);
      if (existingItem) {
        return {
          ...state,
          items: state.items.map((items) =>
            item.id === item.id ? { ...items, quantity: item.quantity + 1 } : item
          ),
        };
      }
      return {
        ...state,
        items: [...state.items, { ...item, quantity: 1 }],
      };

    case REMOVE_FROM_CART:
      return {
        ...state,
        items: state.items.filter((item) => item.id !== action.payload),
      };

    case CLEAR_CART:
      return {
        ...state,
        items: [],
      };

    default:
      return state;
  }
};

export default cartReducers;
