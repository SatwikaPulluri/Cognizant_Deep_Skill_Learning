import React from 'react';
import CohortDetails from './CohortDetails';

function App() {
  const cohortData = [
    {
      title: 'INTADMDF10 - .NET FSD',
      date: '22-Feb-2022',
      status: 'Scheduled',
      coach: 'Aarthma',
      trainer: 'Jojo Jose'
    },
    {
      title: 'ADM21JF014 - Java FSD',
      date: '10-Sep-2021',
      status: 'Ongoing',
      coach: 'Apoorv',
      trainer: 'Elisa Smith'
    },
    {
      title: 'CDBJF21025 - Java FSD',
      date: '24-Dec-2021',
      status: 'Ongoing',
      coach: 'Aarthma',
      trainer: 'John Doe'
    }
  ];

  return (
    <div className="App">
      <CohortDetails cohorts={cohortData} />
    </div>
  );
}

export default App;
