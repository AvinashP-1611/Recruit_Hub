import React from 'react';
import { List, ListItem, ListItemIcon, ListItemText } from '@mui/material';
import { Link } from 'react-router-dom';
import { PersonOutlineOutlined as Profile, AddchartOutlined as AddJob, ManageAccountsOutlined as ManageJob,  BusinessCenterOutlined as Applications } from '@mui/icons-material';

// Define the navigation items with their respective icons and routes
const navList = [
    { id: 1, name: 'Profile', icon: <Profile />, route: '/dashboard' },
    { id: 2, name: 'Add Job', icon: <AddJob />, route: '/dashboard/add-jobs' },
    { id: 3, name: 'Manage Jobs', icon: <ManageJob />, route: '/dashboard/manage-jobs' },
    { id: 4, name: 'Applications', icon: <Applications/>, route: '/dashboard/my-jobs' },

];

const NavList = () => {
    return (
        // Render the list of navigation items
        <List className='nav-list'>
            {navList.map((item) => (
                <ListItem button key={item.id} className='nav-item'>
                    {/* Use React Router's Link component for navigation */}
                    <Link to={item.route} style={{ textDecoration: 'none', display: 'flex', color:'black'}}>
                        <ListItemIcon style={{ alignItems: 'center'}} className='nav-icon'>
                            {/* Render the corresponding icon for each navigation item */}
                            {item.icon}
                        </ListItemIcon>
                        <ListItemText primary={item.name} style={{fontFamily :'sans-serif', fontSize:'18px', fontWeight:'bolder'}}/>
                    </Link>
                </ListItem>
            ))}
        </List>
    );
};

export default NavList;
