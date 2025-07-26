import React from 'react';
import './OfficeList.css'; // You can use App.css if not using a separate one

const OfficeList = () => {
  const offices = [
    {
      name: 'TechPark Workspace',
      rent: 55000,
      address: 'Whitefield, Bangalore',
      image: 'https://via.placeholder.com/350x200?text=TechPark+Office'
    },
    {
      name: 'Downtown Office',
      rent: 62000,
      address: 'MG Road, Mumbai',
      image: 'https://via.placeholder.com/350x200?text=Downtown+Office'
    },
    {
      name: 'Startup Space',
      rent: 40000,
      address: 'Gachibowli, Hyderabad',
      image: 'https://via.placeholder.com/350x200?text=Startup+Space'
    },
    {
      name: 'Corporate Tower',
      rent: 75000,
      address: 'Connaught Place, Delhi',
      image: 'https://via.placeholder.com/350x200?text=Corporate+Tower'
    }
  ];

  return (
    <div>
      <h1>🏢 Office Space Rental App</h1>
      <div style={{ display: 'flex', flexWrap: 'wrap' }}>
        {offices.map((office, index) => (
          <div className="office-card" key={index}>
            <img src={office.image} alt={office.name} className="office-image" />
            <p className="office-name">{office.name}</p>
            <p className="office-address">{office.address}</p>
            <p
              className="office-rent"
              style={{ color: office.rent < 60000 ? 'red' : 'green' }}
            >
              Rent: ₹{office.rent}
            </p>
          </div>
        ))}
      </div>
    </div>
  );
};

export default OfficeList;
