import React from 'react';

function UserPage() {
  return (
    <div>
      <h2>Welcome User!</h2>
      <h3>Book Your Flight</h3>
      <ul>
        <li>
          Indigo 6E123 — Hyderabad to Delhi — 10:00 AM
          <button>Book Now</button>
        </li>
        <li>
          Air India AI404 — Mumbai to Chennai — 2:00 PM
          <button>Book Now</button>
        </li>
        <li>
          SpiceJet SG101 — Bengaluru to Kolkata — 6:30 PM
          <button>Book Now</button>
        </li>
      </ul>
    </div>
  );
}

export default UserPage;
