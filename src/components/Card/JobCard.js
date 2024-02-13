import React from 'react';
import { Card, Button } from 'react-bootstrap';

const JobCard = ({ job }) => {
  return (
    <Card style={{ width: '18rem', margin: '1rem' }}>
      <Card.Body>
        <Card.Title>{job.position}</Card.Title>
        <Card.Subtitle className="mb-2 text-muted">{job.companyName}</Card.Subtitle>
        <Card.Text>{job.jobLocation}</Card.Text>
        <Card.Text>
          <strong>Job Type:</strong> {job.jobType}
        </Card.Text>
        <Card.Text>
          <strong>Job Status:</strong> {job.jobStatus}
        </Card.Text>
        <Button variant="primary" style={{ marginRight: '0.5rem' }}>
          Details
        </Button>
        <Button variant="success">Edit</Button>
      </Card.Body>
    </Card>
  );
};

export default JobCard;
