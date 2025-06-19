<h1>👹 Monster Shop - Backend</h1>

<h3>
Welcome to Monster Shop!

This is the backend repository of an awesomely cool online store. 😎

Here you can manage products and reviews through a REST API built with Java + Spring Boot.
</h3>

<hr>

<h3>🚀 Technologies Used</h3>
<ul>
  <li>Java 21</li>
  <li>Spring Boot</li>
  <li>MySQL</li>
  <li>JPA / Hibernate</li>
  <li>Maven</li>
  <li>Manual CORS configuration</li>
  <li>Postman (for testing before connecting the frontend)</li>
  <li>Compatible with React + Vite frontend</li>
</ul>



<h3>🎯 Goal</h3>
<p>Develop a functional backend that:</p>
<ul>
  <li>Allows listing, creating, editing, and deleting products 🛒</li>
  <li>Allows viewing and creating reviews 📝</li>
  <li>Connects with the existing frontend (once it works on Postman)</li>
</ul>



<h3>🧪 Available Endpoints</h3>

<h4>📦 Products</h4>
<ul>
  <li>GET <code>/api/products</code>: List all products</li>
  <li>GET <code>/api/products/{id}</code>: Get product details</li>
  <li>POST <code>/api/products</code>: Create a product</li>
  <li>PUT <code>/api/products/{id}</code>: Edit an existing product</li>
  <li>DELETE <code>/api/products/{id}</code>: Delete a product</li>
</ul>

<h4>✍️ Reviews</h4>
<ul>
  <li>GET <code>/api/reviews/{productId}</code>: Get reviews for a product</li>
  <li>POST <code>/api/reviews</code>: Create a new review</li>
</ul>



<h3>🛠️ How to Run the Backend</h3>
<ul>
  <li>Prerequisites: Java 21 installed</li>
  <li>Configure the database connection in <code>application.properties</code></li>
  <li>Start the server</li>
</ul>

<h3>🌐 Connecting to the Frontend</h3>
<p>Once everything works in Postman, you can connect the frontend by cloning this repo:</p>
<p>👉 <a href="https://github.com/P1-FemCoders-VLC/monster-ecommerce" target="_blank">https://github.com/P1-FemCoders-VLC/monster-ecommerce</a></p>


<p>Steps:</p>
<pre>
bash pnpm install
bash pnpm run dev
</pre>
<p>The frontend will run at: <a href="http://localhost:5173" target="_blank">http://localhost:5173</a></p>


<h3>✅ Best Practices</h3>
<ul>
  <li>✔️ Use of SOLID principles</li>
  <li>✔️ Layered architecture (controllers, services, repositories)</li>
</ul>

<h3>👹 Thanks for being part of this monstrous adventure! This project is just the beginning. Keep exploring, improving, creating, and sharing. We’d love to hear from you! Until next time, monster friend.</h3>

<br>
<hr>

<h3>🧝‍✨ Author</h3>
Developed by: <b>Bruna Sonda</b></h4> @ 
<a href="https://github.com/brunasonda" target="_blank">https://github.com/brunasonda</a>
