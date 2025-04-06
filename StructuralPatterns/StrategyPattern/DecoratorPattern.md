🎁 What is the Decorator Pattern?
Think of wrapping gifts.

You start with a plain gift (the actual item).

You wrap it in paper, then maybe add a ribbon, a tag, etc.

You're adding extra features (decorations), but you're not changing the actual gift inside.

The Decorator Pattern works the same way:

You start with a basic object.

Then dynamically add extra behavior to it by “wrapping” it in decorator objects.

You don’t need to change the original class or use inheritance.

✅ Why Use It?
To add features/behavior to objects at runtime, without modifying their code.

More flexible than inheritance.

Helps you follow the Open/Closed Principle (open for extension, closed for modification).

🧠 Key Components
Component – the common interface.

ConcreteComponent – the original/basic object.

Decorator – an abstract class that implements the component and wraps another component.

ConcreteDecorators – classes that add new behavior to the component.

☕ Real-Life Example – Coffee Order
Imagine you're at a coffee shop:

You order a simple coffee.

Then you can add milk, add sugar, or both.

Each add-on wraps the original coffee and adds its cost and description.