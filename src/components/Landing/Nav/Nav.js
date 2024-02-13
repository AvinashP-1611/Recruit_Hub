import { AppBar, Toolbar, Typography, IconButton } from '@mui/material';
import { styled } from '@mui/material/styles';
import logo from '../../../assests/Recruithublogo.png';
import { Link, useNavigate } from 'react-router-dom';
// Styled component for the header
const Header = styled(AppBar)`
  z-index: 1201;
  background: #fff;
  height: 70px;
  box-shadow: inset 0 -1px 0 0 #dadce0;
  box-shadow: inset 0 -1px 0 0 #dadce0, 0 6px 8px rgba(0, 0, 0, 0.1); /* Added bottom shadow */

`;

// Styled component for the heading
const Heading = styled(Typography)`
  color: #5F6368;
  font-size: 24px;
  margin-left: 25px;
`;

// HeaderBar component with props for open state and drawer handling
const Nav = () => {

  const navigate = useNavigate();
     
  function navigateLanding(){
    navigate('/login');
  }
  
  return (
   
    <Header style={{background:'#fff'}} className='header-container'>
      {/* Toolbar for organizing header content */}
      <Toolbar className='toolbar' style={{display:'flex', justifyContent:'space-between'}}>
         {/* Logo container with the new class */}
        <div className="logo-container">
          {/* Logo image with the new class */}
        <Link to='/'>
        <img src={logo} alt="logo" className="logo" style={{height:'90px', marginTop:'11px'}}/>

        </Link>          
        </div>
       
    <div style={{display:'flex', justifyContent:'space-between'}}>

    <div  title="Jobs" style={{ textAlign: 'center' }}>
  <Link
    to="/jobs"
    style={{
      color: 'black',
      fontWeight: 'bold',
      listStyleType: 'none',
      textDecoration: 'none', // Remove underline
      display: 'inline-block', // Make it look like a button
      padding: '10px 20px', // Add padding for better appearance
      borderRadius: '5px', // Add border radius for rounded corners
      transition: 'background-color 0.3s ease', // Add a smooth transition
    }}
  >
    Jobs
  </Link>
</div>   

  <div title="Dashboard" style={{ marginRight: '20px', textAlign: 'center' }}>
  <Link
    to="/dashboard"
    style={{
      color: 'black',
      fontWeight: 'bold',
      listStyleType: 'none',
      textDecoration: 'none', // Remove underline
      display: 'inline-block', // Make it look like a button
      padding: '10px 20px', // Add padding for better appearance
      borderRadius: '5px', // Add border radius for rounded corners
      transition: 'background-color 0.3s ease', // Add a smooth transition
    }}
  >
    Dashboard
  </Link>
</div>

<button
  title="LogIn"
  style={{
    border: 'none',
    fontWeight: 'bold',
    background: 'rgb(36 123 247)',
    textAlign: 'center',
    padding: '5px 10px',
    width: '100px',
    borderRadius: '5px',
    cursor: 'pointer', // Add a pointer cursor on hover
    transition: 'background-color 0.3s ease', // Add a smooth transition
  }}
  onClick={navigateLanding}
>
  <span style={{ color: 'white', border: 'none' }}>Login</span>
</button>
</div>
        
   
      </Toolbar>
    </Header>
  );
}

export default Nav;

