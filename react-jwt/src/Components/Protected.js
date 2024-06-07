import React, { useEffect } from 'react';
import axios from 'axios';

const ProtectedComponent = () => {
  useEffect(() => {
    const fetchData = async () => {
      const token = localStorage.getItem('token');
      try {
        const response = await axios.get('http://localhost:3000/protected', {
          headers: {
            'Authorization': token 
          }
        });
        console.log(response.data);
      } catch (error) {
        if (error.response.status === 403) {
          localStorage.removeItem('token');
          window.location.href = '/login';
        }
      }
    };
    fetchData();
  }, []);

  return <div>Protected Content</div>;
};

export default ProtectedComponent;


