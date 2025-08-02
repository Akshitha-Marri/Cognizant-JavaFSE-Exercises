import React from 'react';

const IndianPlayers = () => {
  // Declare two arrays
  const T20players = ['Virat', 'Rohit', 'Pant', 'Hardik'];
  const RanjiTrophy = ['Pujara', 'Saha', 'Iyer'];

  // ✅ Merge arrays using ES6 spread operator
  const mergedPlayers = [...T20players, ...RanjiTrophy];

  // ✅ Use destructuring logic to split players into odd and even teams
  const oddPlayers = mergedPlayers.filter((_, index) => index % 2 !== 0);
  const evenPlayers = mergedPlayers.filter((_, index) => index % 2 === 0);

  return (
    <div>
      <h2>Merged Indian Players</h2>
      {mergedPlayers.map((player, index) => (
        <p key={index}>{player}</p>
      ))}

      <h3>Odd Team Players</h3>
      {oddPlayers.map((player, i) => <p key={i}>{player}</p>)}

      <h3>Even Team Players</h3>
      {evenPlayers.map((player, i) => <p key={i}>{player}</p>)}
    </div>
  );
};

export default IndianPlayers;
