import React from 'react';

function App() {
  const officeList = [
    {
      name: 'Prestige Tech Park',
      rent: 55000,
      address: 'Whitefield, Bangalore',
      image: 'https://images.unsplash.com/photo-1573164574572-cb89e39749b4?auto=format&fit=crop&w=800&q=80' // ✅ working
    },
    {
      name: 'WeWork',
      rent: 65000,
      address: 'Koramangala, Bangalore',
      image: 'https://images.unsplash.com/photo-1600585154340-be6161a56a0c?auto=format&fit=crop&w=800&q=80' // ✅ WORKING
    },
    {
      name: 'Regus Business Center',
      rent: 48000,
      address: 'MG Road, Bangalore',
      image: 'https://images.unsplash.com/photo-1559526324-593bc073d938?auto=format&fit=crop&w=800&q=80'
    }
  ];

  return (
    <div className="App" style={{ padding: '20px', fontFamily: 'Arial' }}>
      <h1>Office Space Rental Listings</h1>

      {officeList.map((office, index) => (
        <div
          key={index}
          style={{
            border: '1px solid #ccc',
            padding: '15px',
            marginBottom: '20px',
            maxWidth: '700px'
          }}
        >
          <img
            src={office.image}
            alt={office.name}
            width="100%"
            style={{ marginBottom: '10px', borderRadius: '8px' }}
          />
          <h2>{office.name}</h2>
          <p><strong>Address:</strong> {office.address}</p>
          <p>
            <strong>Rent:</strong>{' '}
            <span style={{ color: office.rent < 60000 ? 'red' : 'green' }}>
              ₹{office.rent}
            </span>
          </p>
        </div>
      ))}
    </div>
  );
}

export default App;
