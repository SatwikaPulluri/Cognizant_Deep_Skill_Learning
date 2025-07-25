import React from 'react';
import styles from './CohortDetails.module.css';

const CohortDetails = ({ cohorts }) => {
  return (
    <div className={styles.container}>
      <h2>Cohorts Details</h2>
      {cohorts.map((cohort, index) => (
        <div key={index} className={styles.box}>
          <a className={styles.title}>
            <span className={cohort.status === 'Ongoing' ? styles.ongoing : styles.others}>
              {cohort.title}
            </span>
          </a>
          <dl>
            <dt>Started On</dt>
            <dd>{cohort.date}</dd>
            <dt>Current Status</dt>
            <dd>{cohort.status}</dd>
            <dt>Coach</dt>
            <dd>{cohort.coach}</dd>
            <dt>Trainer</dt>
            <dd>{cohort.trainer}</dd>
          </dl>
        </div>
      ))}
    </div>
  );
};

export default CohortDetails;
