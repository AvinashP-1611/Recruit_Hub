import React, { useState } from 'react';
import Nav from '../components/Landing/Nav/Nav';
import { Button, Col, Form, FormControl, InputGroup, Row } from 'react-bootstrap';
import JobCard from '../components/Card/JobCard';

const Jobs = () => {
  const [jobs, setJobs] = useState([
    // Example job data
    {
      id: 1,
      position: 'Software Developer',
      companyName: 'ABC Inc.',
      jobLocation: 'City ABC',
      jobType: 'Full-Time',
      jobStatus: 'Pending',
      // ... other job properties
    },
    {
      id: 2,
      position: 'FrontEnd Developer',
      companyName: 'XYZ Inc.',
      jobLocation: 'City ABC',
      jobType: 'Full-Time',
      jobStatus: 'Pending',
      // ... other job properties
    },

    {
      id: 3,
      position: 'Backend Developer',
      companyName: 'ABC Inc.',
      jobLocation: 'City ABC',
      jobType: 'Full-Time',
      jobStatus: 'Pending',
      // ... other job properties
    },

    {
      id: 4,
      position: 'Graphic Design',
      companyName: 'ABC Inc.',
      jobLocation: 'City ABC',
      jobType: 'Full-Time',
      jobStatus: 'Pending',
      // ... other job properties
    },
    {
      id: 5,
      position: 'React Developer',
      companyName: 'ABC Inc.',
      jobLocation: 'City ABC',
      jobType: 'Full-Time',
      jobStatus: 'Pending',
      // ... other job properties
    },
    {
      id: 6,
      position: 'Content Creator',
      companyName: 'ABC Inc.',
      jobLocation: 'City ABC',
      jobType: 'Full-Time',
      jobStatus: 'Pending',
      // ... other job properties
    },
    {
      id: 7,
      position: 'Business Development Executive',
      companyName: 'ABC Inc.',
      jobLocation: 'City ABC',
      jobType: 'Full-Time',
      jobStatus: 'Pending',
      // ... other job properties
    },
    {
      id: 8,
      position: 'Full Stack Developer',
      companyName: 'ABC Inc.',
      jobLocation: 'City ABC',
      jobType: 'Full-Time',
      jobStatus: 'Pending',
      // ... other job properties
    },
    // Add more job objects as needed
  ]);

  const [filterType, setFilterType] = useState('');
  const [filterStatus, setFilterStatus] = useState('');

  const handleFilterType = (type) => {
    setFilterType(type);
    // Implement filtering logic based on job type
    // Update the job list accordingly
  };

  const handleFilterStatus = (status) => {
    setFilterStatus(status);
    // Implement filtering logic based on job status
    // Update the job list accordingly
  };

  const handleSearch = (query) => {
    // Implement search logic based on job title
    // Update the job list accordingly
  };

  // Apply filters to the job list
  const filteredJobs = jobs.filter((job) => {
    const typeFilterMatch = filterType === '' || job.jobType === filterType;
    const statusFilterMatch = filterStatus === '' || job.jobStatus === filterStatus;
    return typeFilterMatch && statusFilterMatch;
  });

  return (
    <div>
      <Nav />
        {/* Filter and Search Form */}
        {/* <Form>
          <InputGroup className="mb-3">
            <FormControl
              placeholder="Search by Job Title"
              aria-label="Search by Job Title"
              onChange={(e) => handleSearch(e.target.value)}
            />
            <Button variant="primary">Search</Button>
          </InputGroup>
          <Form.Group controlId="filterType">
            <Form.Label>Filter by Job Type:</Form.Label>
            <Form.Select onChange={(e) => handleFilterType(e.target.value)}>
              <option value="">All</option>
              <option value="Full-Time">Full-Time</option>
              <option value="Part-Time">Part-Time</option>
              <option value="Internship">Internship</option>
            </Form.Select>
          </Form.Group>
          <Form.Group controlId="filterStatus">
            <Form.Label>Filter by Job Status:</Form.Label>
            <Form.Select onChange={(e) => handleFilterStatus(e.target.value)}>
              <option value="">All</option>
              <option value="Pending">Pending</option>
              <option value="Interview">Interview</option>
              <option value="Declined">Declined</option>
            </Form.Select>
          </Form.Group>
        </Form> */}

        <div style={{ marginTop: '30rem' }}>
        {/* Filter, Sort, and Search Container */}
        <div className="d-flex justify-content-between align-items-center mb-3">
          {/* Filter Form - Job Type */}
          <Form.Group controlId="filterType" className="mb-2">
            <Form.Select onChange={(e) => handleFilterType(e.target.value)}>
              <option value="">Filter by Job Type</option>
              <option value="Full-Time">Full-Time</option>
              <option value="Part-Time">Part-Time</option>
              <option value="Internship">Internship</option>
            </Form.Select>
          </Form.Group>

          {/* Filter Form - Job Status */}
          <Form.Group controlId="filterStatus" className="mb-2">
            <Form.Select onChange={(e) => handleFilterStatus(e.target.value)}>
              <option value="">Filter by Job Status</option>
              <option value="Pending">Pending</option>
              <option value="Interview">Interview</option>
              <option value="Declined">Declined</option>
            </Form.Select>
          </Form.Group>

          {/* Search Form */}
          <InputGroup className="mb-2">
            <FormControl
              placeholder="Search by Job Title"
              aria-label="Search by Job Title"
              onChange={(e) => handleSearch(e.target.value)}
              
            />
            <Button variant="primary">Search</Button>
          </InputGroup>

          {/* Sort options (if needed) */}
          {/* Add sort options as needed */}
        </div>

        {/* Render Job Cards */}
        <Row>
          {filteredJobs.map((job) => (
            <Col key={job.id} xs={12} md={6} lg={4}>
              <JobCard job={job} />
            </Col>
          ))}
        </Row>
      </div>
    </div>
  );
};

export default Jobs;
