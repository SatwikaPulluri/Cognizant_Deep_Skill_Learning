import React from 'react';

const ListofPlayers = () => {
  const players = [
    { name: 'Rohit', score: 92 },
    { name: 'Virat', score: 65 },
    { name: 'Gill', score: 85 },
    { name: 'Ishan', score: 68 },
    { name: 'Hardik', score: 76 },
    { name: 'Jadeja', score: 45 },
    { name: 'Ashwin', score: 90 },
    { name: 'Bumrah', score: 34 },
    { name: 'Shami', score: 88 },
    { name: 'Rahul', score: 51 },
    { name: 'Surya', score: 79 },
  ];

  // Map all players
  const allPlayers = players.map((player, index) => (
    <li key={index}>{player.name} - Score: {player.score}</li>
  ));

  // Filter players with score < 70
  const lowScorers = players
    .filter(player => player.score < 70)
    .map((player, index) => (
      <li key={index}>{player.name} - Score: {player.score}</li>
    ));

  return (
    <div>
      <h2>All Players</h2>
      <ul>{allPlayers}</ul>
      <h2>Players with Score below 70</h2>
      <ul>{lowScorers}</ul>
    </div>
  );
};

export default ListofPlayers;
