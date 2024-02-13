import React, { useState, useEffect } from 'react';
import Card from '@mui/material/Card';
import CardContent from '@mui/material/CardContent';

import { Box, Button, CardActionArea, CardActions, List, ListItem, ListItemText } from '@mui/material';
import AccountCircleIcon from '@mui/icons-material/AccountCircle';
import EditCalendarOutlinedIcon from '@mui/icons-material/EditCalendarOutlined';
import './styles.css';

const ProfileBox = () => {
  const [data, setData] = useState({});

  useEffect(() => {
    fetch('https://jsonplaceholder.typicode.com/todos/1')
      .then(response => response.json())
      .then(json => setData(json))
      .catch(error => console.error('Error fetching data:', error));
  }, []); // Empty dependency array to run the effect only once when the component mounts

  return (
    <Card className='profile-container'>
    <CardActionArea className='card-area'>
       
        <h1 className='card-heading'>Informations</h1>
      
        <CardContent className='card-content'>
         <Box className='account-box'>
         <AccountCircleIcon className='account-cirlce' style={{height:'120px', width:'120px'}}/>
         </Box>
          <Box className='user-information'>
            <ul>
             <li>Username : <span style={{color:'black', marginLeft:'8px', fontWeight:'bold'}}></span></li>
             <li>Role :    <span style={{color:'black', marginLeft:'8px', fontWeight:'bold'}}></span></li>
             <li>Email : <span style={{color:'black', marginLeft:'8px', fontWeight:'bold'}}></span></li>
             <li>Join : <span style={{color:'black', marginLeft:'8px', fontWeight:'bold'}}></span></li>
             <li>Location : <span style={{color:'black', marginLeft:'8px', fontWeight:'bold'}}></span></li>
            <li>Gender : <span style={{color:'black', marginLeft:'8px', fontWeight:'bold'}}></span></li>
           </ul>
          </Box>
        </CardContent>
      </CardActionArea>
      <CardActions>
        <Button className='profile-btn'>
        <span><EditCalendarOutlinedIcon style={{height:'20px', marginTop:'5px'}}/></span><span style={{marginLeft:'5px', textAlign:'center'}}>EDIT</span>
        </Button>
      </CardActions>
    </Card>
  );
}

export default ProfileBox;


