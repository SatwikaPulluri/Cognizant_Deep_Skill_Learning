import React, { Component } from 'react';
import Post from './Post';

class Posts extends Component {
  constructor(props) {
    super(props);
    this.state = {
      posts: [],
      hasError: false
    };
  }

  // Step 6: Load posts from API
  loadPosts = async () => {
    try {
      const response = await fetch("https://jsonplaceholder.typicode.com/posts");
      const data = await response.json();
      const postList = data.map(
        (p) => new Post(p.userId, p.id, p.title, p.body)
      );
      this.setState({ posts: postList });
    } catch (error) {
      this.setState({ hasError: true });
      alert("Error fetching posts: " + error.message);
    }
  };

  // Step 7: Use componentDidMount to call loadPosts
  componentDidMount() {
    this.loadPosts();
  }

  // Step 8: Display posts
  render() {
    return (
      <div>
        <h1>Blog Posts</h1>
        {this.state.posts.map((post) => (
          <div key={post.id} style={{ marginBottom: '20px' }}>
            <h2>{post.title}</h2>
            <p>{post.body}</p>
          </div>
        ))}
      </div>
    );
  }

  // Step 9: Error handling
  componentDidCatch(error, info) {
    alert("An error occurred in the Posts component.");
    console.error("Error:", error);
    console.error("Info:", info);
  }
}

export default Posts;
