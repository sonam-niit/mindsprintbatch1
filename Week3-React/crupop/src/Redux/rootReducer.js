import { combineReducers } from "redux";
import CounterReducer from "./counterReducer";
import CartReducer from "./cartReducer";

const rootReducer= combineReducers({
    counter: CounterReducer,
    cart:CartReducer
    //include others reducers
})

export default rootReducer;