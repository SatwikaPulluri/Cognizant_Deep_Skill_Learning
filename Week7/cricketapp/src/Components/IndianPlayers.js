import React from 'react';

const IndianPlayers = () => {
  const teamPlayers = ['Dhoni', 'Kohli', 'Raina', 'Dravid', 'Sachin', 'Yuvraj'];

  // Destructuring Odd and Even team players
  const oddTeam = teamPlayers.filter((_, index) => index % 2 === 0);
  const evenTeam = teamPlayers.filter((_, index) => index % 2 !== 0);

  // Merging two arrays
  const T20players = ['Kohli', 'Rohit', 'Hardik'];
  const RanjiPlayers = ['Rahane', 'Pujara', 'Saha'];
  const allMerged = [...T20players, ...RanjiPlayers]; // Using spread operator

  return (
    <div>
      <h2>Odd Team Players</h2>
      <ul>
        {oddTeam.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>

      <h2>Even Team Players</h2>
      <ul>
        {evenTeam.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>

      <h2>Merged T20 & Ranji Trophy Players</h2>
      <ul>
        {allMerged.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>
    </div>
  );
};

export default IndianPlayers;
