import React from 'react'
import ManageJobBox from '../managejobbox/ManageJobBox'
import AddBoxOutlinedIcon from '@mui/icons-material/AddBoxOutlined';

const ManageJobs = () => {
  return (
    <div>
    <h2 style={{textAlign:'left'}}>Manage Job<span><AddBoxOutlinedIcon/></span></h2>

      <ManageJobBox/>
    </div>
  )
}

export default ManageJobs
