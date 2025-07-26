import React from "react";

function CourseDetails({ isVisible }) {
  return (
    <>
      {isVisible ? (
        <div className="card">
          <h2>Course Details</h2>
          <b>Angular</b>
          <div>4/5/2021</div>
          <b>React</b>
          <div>6/3/2021</div>
        </div>
      ) : null}
    </>
  );
}

export default CourseDetails;
