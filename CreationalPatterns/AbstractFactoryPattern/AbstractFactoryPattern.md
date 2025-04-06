🏭 Abstract Factory Pattern
📖 What is it?
The Abstract Factory Pattern is like a factory of factories.
It provides a way to create families of related objects without specifying their concrete classes.

Imagine a Furniture Factory:

There are two styles: Modern and Victorian.

Each style has a Chair, Sofa, and Table.

You don’t want to mix styles (no Victorian Chair with a Modern Sofa).

So you use an Abstract Factory to create the right family of furniture.

✅ Why Use It?
When you need to create related objects that must be used together.

To make your code easily switch between families of products.

🧠 Components
Abstract Product Interfaces – e.g., Chair, Sofa.

Concrete Products – e.g., ModernChair, VictorianSofa.

Abstract Factory Interface – e.g., FurnitureFactory.

Concrete Factories – e.g., ModernFactory, VictorianFactory.
