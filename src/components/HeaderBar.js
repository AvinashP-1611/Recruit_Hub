import { AppBar, Toolbar, Typography, IconButton } from '@mui/material';
import { Menu } from '@mui/icons-material';
import { styled } from '@mui/material/styles';
import logo from '../assests/Recruithublogo.png';
import LogoutIcon from '@mui/icons-material/Logout';
import { useNavigate } from 'react-router-dom';
// Styled component for the header
const Header = styled(AppBar)`
  z-index: 1201;
  background: #fff;
  height: 70px;
  box-shadow: inset 0 -1px 0 0 #dadce0;
`;

// Styled component for the heading
const Heading = styled(Typography)`
  color: #5F6368;
  font-size: 24px;
  margin-left: 25px;
`;

// HeaderBar component with props for open state and drawer handling
const HeaderBar = ({ open, handleDrawer }) => {

  const navigate = useNavigate();
     
  function navigateLanding(){
    navigate('/');
  }
  
  return (
   
    <Header open={open} style={{background:'#fff'}} className='header-container'>
      {/* Toolbar for organizing header content */}
      <Toolbar className='toolbar' style={{display:'flex', justifyContent:'space-between'}}>
        {/* IconButton for opening/closing the drawer */}
        <IconButton
          onClick={() => handleDrawer()}
          sx={{ marginRight: '20px'}}
          edge="start"
          className='drawer-btn'
        >
          {/* Menu icon */}
          <Menu />
        </IconButton>
        
        {/* Logo container with the new class */}
        <div className="logo-container">
          {/* Logo image with the new class */}
          <img src={logo} alt="logo" className="logo" style={{height:'90px', marginTop:'11px'}}/>
          {/* Heading text */}
          {/* <Heading>Recruit Hub</Heading> */}
        </div>

        {/* Logout button with the new class */}

<button
  className="logout-button"
  title="Logout"
  style={{
    border: 'none',
    fontWeight: 'bold',
    backgroundColor: 'red',
    color: 'white',
    padding: '5px 10px',
    borderRadius: '5px',
    cursor: 'pointer', // Add a pointer cursor on hover
    display: 'flex',
    alignItems: 'center',
    justifyContent: 'center',
    transition: 'background-color 0.3s ease', // Add a smooth transition
  }}
  onClick={navigateLanding}
>
  <span style={{ marginRight: '5px' }}><LogoutIcon /></span>
  LOGOUT
</button>

      </Toolbar>
    </Header>
  );
}

export default HeaderBar;
