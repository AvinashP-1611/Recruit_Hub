

import React, {useContext, useEffect, useState } from 'react';
import { Button, Col, Form, Row } from 'react-bootstrap';
import 'bootstrap/dist/css/bootstrap.min.css';
import DatePicker from 'react-datepicker';
import 'react-datepicker/dist/react-datepicker.css';
import Select from 'react-select';
import PostAddIcon from '@mui/icons-material/PostAdd';

import './addjob.css'

const AddJobBox = () => {
  
  const [selectedDate, setSelectedDate] = useState(null);
  
  

  

  const handleDateChange = (date) => {
    setSelectedDate(date);
  };
  
  const handleFormSubmit = (e) => {
    e.preventDefault();
    
  };


  return (
    <Form onSubmit={handleFormSubmit} style={{marginTop:'2rem'}}>
    <h4 style={{textAlign:'left',
     fontWeight:'600',
     
     }}><span style={{textAlign:'left', 
      fontWeight:'600', textDecoration:'underline', 
      textDecorationColor:'blue'}}>Create</span>
       <span style={{textAlign:'left', fontWeight:'600', color:'blue', marginLeft:'8px'}}>Job</span>
       <span><PostAddIcon/></span>
       </h4>
      <Row className="mb-3">
      <Form.Group as={Col} controlId="jobPosition">
          <Form.Label>Position</Form.Label>
          <Form.Control
            type="text"
            placeholder="Job Position"
            style={{ width: '300px' }}
            // value={value}
            // onChange={(e) => setValue(e.target.value)}
          />
        </Form.Group>

        <Form.Group as={Col} controlId="companyName">
          <Form.Label>Company Name</Form.Label>
          <Form.Control type="text" placeholder="Company Name"  style={{ width: '300px' }}/>
        </Form.Group>

        <Form.Group as={Col} controlId="jobLocation">
          <Form.Label>Job Location</Form.Label>
          <Form.Control type="text" placeholder="Job Location"  style={{ width: '300px' }}/>
        </Form.Group>
      </Row>

      <Row className="mb-3">
        <Form.Group as={Col} controlId="jobStatus">
          <Form.Label>Job Status</Form.Label>
          <Form.Select defaultValue="Select A Job Status">
            <option>Select A Job Status</option>
            <option>Pending</option>
            <option>Interview</option>
            <option>Declined</option>
          </Form.Select>
        </Form.Group>

        <Form.Group as={Col} controlId="jobType">
          <Form.Label>Job Type</Form.Label>
          <Form.Select defaultValue="Select A Job Type">
            <option>Select A Job Type</option>
            <option>Full-Time</option>
            <option>Part-Time</option>
            <option>Internship</option>
          </Form.Select>
        </Form.Group>

        <Form.Group as={Col} controlId="vacancy">
          <Form.Label>Vacancy</Form.Label>
          <Form.Control type="text" placeholder="Job Vacancy"  style={{ width: '300px' }}/>
        </Form.Group>
      </Row>

      <Row className="mb-3">
        <Form.Group as={Col} controlId="salary">
          <Form.Label>Salary</Form.Label>
          <Form.Control type="text" placeholder="Job Salary"  style={{ width: '300px' }}/>
        </Form.Group>

        <Form.Group as={Col} controlId="skillsRequired">
          <Form.Label>Skills Required</Form.Label>
          <Select
            isMulti
            options={[
              { value: 'JavaScript', label: 'JavaScript' },
              { value: 'React', label: 'React' },
              { value: 'Node.js', label: 'Node.js' },
              { value: 'Bootstrap', label: 'Bootstrap' },
              { value: 'Java', label: 'Java' },
              { value: 'Spring Boot', label: 'Spring Boot' },
              { value: 'HTML', label: 'HTML' },
              { value: 'CSS', label: 'CSS' },
              { value: 'DSA', label: 'DSA' },
            ]}
          />
        </Form.Group>

        <Form.Group as={Col} controlId="email">
          <Form.Label>Email</Form.Label>
          <Form.Control type="email" placeholder="Enter email"  style={{ width: '300px' }}/>
        </Form.Group>
      </Row>

      <Form.Group className="mb-3" controlId="jobDeadline">
        <Form.Label>Job Deadline</Form.Label>
        <DatePicker
          selected={selectedDate}
          onChange={handleDateChange}
          className="form-control"
          placeholderText="Select deadline"
          style={{ width: '300px' }}
        />
      </Form.Group>

      <Form.Group as={Col} controlId="jobDescription">
        <Form.Label>Job Description</Form.Label>
        <Form.Control as="textarea" rows={3} placeholder="Job Description"  />
      </Form.Group>

      <Button variant="primary" type="submit" className="job-box-btn">
        Submit
      </Button>
    </Form>
  );
};

export default AddJobBox;

