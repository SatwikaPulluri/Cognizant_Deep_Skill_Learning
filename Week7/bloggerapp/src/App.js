import React from "react";
import "./Components/styles.css";
import BookDetails from "./Components/BookDetails";
import BlogDetails from "./Components/BlogDetails";
import CourseDetails from "./Components/CourseDetails";

function App() {
  const showBlog = true;
  const showCourse = true;

  return (
    <div className="container">
      <CourseDetails isVisible={showCourse} />
      <BookDetails />
      <BlogDetails show={showBlog} />
    </div>
  );
}

export default App;
