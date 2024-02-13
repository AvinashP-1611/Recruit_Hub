import React, { useState } from 'react';
import './login.css';
import { useNavigate } from 'react-router-dom';
import logo from '../../../assests/Recruithublogo.png';

const Login = () => {
  const navigate = useNavigate();

  function register() {
    navigate('/register');
  }

  const [formData, setFormData] = useState({
    email: '',
    password: '',
  });

  const handleChange = (e) => {
    const { name, value } = e.target;
    setFormData((prevData) => ({ ...prevData, [name]: value }));
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    // Add your login logic here, for example, send data to the server
    console.log('Login data:', formData);
  };

  return (
   
    <form onSubmit={handleSubmit} className='login-form'>
      <div style={{ height: '100px' , textAlign:'center'}}>
        <img src={logo} alt="logo" style={{ height: '100px'}} />
      </div>
      <h4  style={{textAlign:'center',
       color:'rgb(35 123 247)',
       fontWeight:'600'
       }}>Login</h4>
      <div>
        <label htmlFor="email">Email:</label>
        <input
          type="email"
          id="email"
          name="email"
          placeholder="Example@gmail.com"
          value={formData.email}
          onChange={handleChange}
          required
        />
      </div>
      <div>
        <label htmlFor="password">Password:</label>
        <input
          type="password"
          id="password"
          name="password"
          placeholder="Enter password"
          value={formData.password}
          onChange={handleChange}
          required
        />
      </div>
      <button type="submit">Login</button>
      <div>
        <p style={{padding:'5px', marginTop:'20px', textAlign:'center', fontSize:'13px', fontWeight:'600'}}>
        Don't have an account.
          <span onClick={register} style={{
             cursor: 'pointer',
            color: 'blue',
             paddingLeft: '5px',
            
              }}>
          Create Account
          </span>
        </p>
      </div>
    </form>
  
  );
};

export default Login;
