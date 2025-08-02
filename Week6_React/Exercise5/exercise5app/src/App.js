import React from 'react';
import './App.css';
import CohortCard from './components/CohortCard';

function App() {
  const cohorts = [
    {
      name: "Java Full Stack - FSE1",
      date: "01 July 2025",
      status: "In Progress",
      coach: "Swathi",
      trainer: "John"
    },
    {
      name: "MERN Stack - FSE2",
      date: "10 July 2025",
      status: "Yet to Start",
      coach: "Amit",
      trainer: "Sara"
    },
    {
      name: "Python Stack - FSE3",
      date: "25 June 2025",
      status: "Completed",
      coach: "Meena",
      trainer: "Ravi"
    }
  ];

  return (
    <div className="App">
      <h1>My Blog</h1>
      <div style={{ display: 'flex', flexWrap: 'wrap' }}>
        {cohorts.map((cohort, index) => (
          <CohortCard
            key={index}
            name={cohort.name}
            date={cohort.date}
            status={cohort.status}
            coach={cohort.coach}
            trainer={cohort.trainer}
          />
        ))}
      </div>
    </div>
  );
}

export default App;
