🏭 Factory Pattern
📖 What is it?
The Factory Pattern is used when you want to create objects without exposing the creation logic to the client, and you want the client to use a common interface.

Think of a Pizza Store:

You order a pizza by saying "Give me a Veg Pizza".

You don’t care how it’s made—you just want the final product.

The Factory (Pizza Store) handles the creation.

✅ Why Use It?
To avoid repeating object creation logic.

To encapsulate the creation process.

To easily add new types of objects in the future.

🧠 Components
Product Interface – Common interface for all products.

Concrete Products – Actual classes to be created.

Factory Class – Contains logic to create the product.
