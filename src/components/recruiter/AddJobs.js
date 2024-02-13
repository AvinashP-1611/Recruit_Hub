import React from 'react'
import AddJobBox from '../addjobbox/AddJobBox'
import AddBoxOutlinedIcon from '@mui/icons-material/AddBoxOutlined';
const AddJobs = () => {
  return (
    <div className='job-form-div'>
     <h2 style={{textAlign:'left'}}>Create Job<span><AddBoxOutlinedIcon/></span></h2>
      <AddJobBox/>
    </div>
  )
}

export default AddJobs
