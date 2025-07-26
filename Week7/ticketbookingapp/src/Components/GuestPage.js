import React from 'react';

function GuestPage() {
  return (
    <div>
      <h2>Welcome Guest!</h2>
      <p>Please login to book tickets.</p>
      <h3>Available Flights:</h3>
      <ul>
        <li>Flight: Indigo 6E123 | From: Hyderabad → To: Delhi | Time: 10:00 AM</li>
        <li>Flight: Air India AI404 | From: Mumbai → To: Chennai | Time: 2:00 PM</li>
        <li>Flight: SpiceJet SG101 | From: Bengaluru → To: Kolkata | Time: 6:30 PM</li>
      </ul>
    </div>
  );
}

export default GuestPage;
