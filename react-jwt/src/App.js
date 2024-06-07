import React from 'react'
import ProtectedComponent from './Components/Protected';

const App = () => (
  <Router>
    <Route path="/login" component={Login}/>
    <Route path="/protected" render={() => (
      localStorage.getItem('token') ? <ProtectedComponent /> : <Redirect to="/login/>
    )} />
  </Router>
);


export default App