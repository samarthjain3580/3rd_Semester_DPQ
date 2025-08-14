async function fetchPost() {
    try {
      let response = await fetch("https://jsonplaceholder.typicode.com/posts/1");
      if (!response.ok) throw new Error("Failed to fetch data");
  
      let data = await response.json();
      console.log("Post:", data);
    } catch (error) {
      console.error("Error:", error);
    }
}

fetchPost();