import React from "react";

function BookDetails() {
  const showBooks = true;

  const books = [
    { name: "Master React", price: 670 },
    { name: "Deep Dive into Angular 11", price: 800 },
    { name: "Mongo Essentials", price: 450 },
  ];

  return (
    <div className="card">
      <h2>Book Details</h2>
      {showBooks && books.map((book, index) => (
        <div key={index}>
          <b>{book.name}</b>
          <div>{book.price}</div>
        </div>
      ))}
    </div>
  );
}

export default BookDetails;
