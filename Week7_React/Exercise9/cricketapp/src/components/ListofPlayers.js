import React from 'react';

const ListofPlayers = () => {
  const players = [
    { name: 'Virat', score: 95 },
    { name: 'Rohit', score: 88 },
    { name: 'Dhoni', score: 60 },
    { name: 'Ashwin', score: 45 },
    { name: 'Bumrah', score: 75 },
    { name: 'Pant', score: 50 },
    { name: 'Gill', score: 72 },
    { name: 'Shami', score: 65 },
    { name: 'Hardik', score: 85 },
    { name: 'Surya', score: 90 },
    { name: 'KL Rahul', score: 68 }
  ];

  // Filter players with score less than 70 using ES6 arrow function
  const below70 = players.filter(p => p.score < 70);

  return (
    <div>
      <h2>All Players</h2>
      {players.map((p, i) => (
        <p key={i}>{p.name} - {p.score}</p>
      ))}

      <h3>Players with Score Below 70</h3>
      {below70.map((p, i) => (
        <p key={i}>{p.name} - {p.score}</p>
      ))}
    </div>
  );
};

export default ListofPlayers;
