import React, { useState, useEffect } from 'react';
import { Table, Space, Button } from 'antd';
import { EditOutlined, DeleteOutlined } from '@ant-design/icons';
// Import Ant Design CSS here

const ManageJobBox = () => {
  const [page, setPage] = useState(1);
  const [pageSize, setPageSize] = useState(15);

  useEffect(() => {
    // Fetch data or perform any other operations
    // For example, setDataSource(data) or any other data processing logic
  }, []); // Add dependencies if needed

  const columns = [
    {
      title: 'Job Position',
      dataIndex: 'jobPosition',
      key: 'position',
    },
    {
      title: 'Company Name',
      dataIndex: 'companyName',
      key: 'companyName',
    },
    {
      title: 'Created By',
      dataIndex: 'createdBy',
      key: 'createdBy',
    },
    {
      title: 'Action',
      dataIndex: 'action',
      key: 'action',
      render: (text, record) => (
        <Space size="middle">
          <Button type="primary" icon={<EditOutlined />} />
          &nbsp;
          <Button type="primary" danger icon={<DeleteOutlined />}  />
        </Space>
      ),
      width: '10%',
    },
  ];

  return (
    <>
      <Table
        columns={columns}
        style={{width:'800px'}}
        pagination={{
          current: page,
          pageSize: pageSize,
          total: 500,
          onChange: (page, pageSize) => {
            setPage(page);
            setPageSize(pageSize);
          },
        }}
      />
    </>
  );
};

export default ManageJobBox;


