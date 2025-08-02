import React from 'react';
import './CohortCard.css';

const CohortCard = ({ name, date, status, coach, trainer }) => {
  const isJava = name.includes('Java');
  const titleColor = isJava ? 'green' : 'blue';

  return (
    <div className="card">
      <h3 style={{ color: titleColor }}>{name}</h3>
      <p><strong>Started On</strong><br />{date}</p>
      <p><strong>Current Status</strong><br />{status}</p>
      <p><strong>Coach</strong><br />{coach}</p>
      <p><strong>Trainer</strong><br />{trainer}</p>
    </div>
  );
};

export default CohortCard;
