import React from 'react'


import Landing from './pages/Landing'
import DataProvider from './context/DataProvider';
import Home from './components/Home';

const App = () => {
  return (
   <DataProvider>
    
      <Home/>
   </DataProvider>
   
  )
}

export default App;


