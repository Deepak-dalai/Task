import { combineReducers, createStore } from 'redux';
import cartReducers from './reducers/cartReducers';



const rootReducer = combineReducers({
    cart: cartReducers,
  });
  
  const store = createStore(
    rootReducer,
    window._REDUX_DEVTOOLS_EXTENSION_ && window._REDUX_DEVTOOLS_EXTENSION__()
  );
export default store;
