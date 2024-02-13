import React, { useState } from 'react';
import './register.css'
import { useNavigate } from 'react-router-dom';
import logo from '../../../assests/Recruithublogo.png';

const Register = () => {

    const navigate = useNavigate('');

    function login(){
        navigate('/login');
    }

  const [formData, setFormData] = useState({
    username: '',
    email: '',
    password: '',
    confirmPassword: '',
  });

  const handleChange = (e) => {
    const { name, value } = e.target;
    setFormData((prevData) => ({ ...prevData, [name]: value }));
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    // Add your registration logic here, for example, send data to the server
    console.log('Registration data:', formData);
  };

  return (
    <form onSubmit={handleSubmit} className='register-form'>
         <div style={{ height: '100px' , textAlign:'center'}}>
            <img src={logo} alt='logo' style={{height:'100px'}}/>
         </div>
         <h4 style={{textAlign:'center',
       color:'rgb(35 123 247)',
       fontWeight:'600'
       }}>Create Account</h4>
      <div>
        <label htmlFor="username">Username:</label>
        <input
          type="text"
          id="username"
          name="username"
          placeholder='Enter your name here'
          value={formData.username}
          onChange={handleChange}
          required
        />
      </div>
      <div>
        <label htmlFor="email">Email:</label>
        <input
          type="email"
          id="email"
          name="email"
          placeholder='Example@email.com'
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
          placeholder='Enter your password'
          value={formData.password}
          onChange={handleChange}
          required
        />
      </div>
      <div>
        <label htmlFor="confirmPassword">Confirm Password:</label>
        <input
          type="password"
          id="confirmPassword"
          name="confirmPassword"
          placeholder='Re-enter your password'
          value={formData.confirmPassword}
          onChange={handleChange}
          required
        />
      </div>
      <button type="submit">Register</button>
     <div>
      <p style={{padding:'5px', marginTop:'20px', textAlign:'center', fontSize:'13px', fontWeight:'600'}}>
      Already have an account.
        <span onClick={login} 
       style={{cursor:'pointer', color:'blue', paddingLeft:'5px' }}>Login Now</span>
      </p>
     </div>
    </form>
  );
};

export default Register;
