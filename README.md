# Design Patterns
For having all design patterns at one place


# Design Patterns Overview

Design patterns are proven solutions to common problems in software design. They provide a shared language for developers and help in building flexible, maintainable, and scalable software. The patterns are typically categorized as follows:

---

## 1. Creational Patterns

These patterns deal with object creation mechanisms, trying to create objects in a manner suitable to the situation.

- **Singleton:**  
  Ensures a class has only one instance and provides a global point of access to it.

- **Factory Method:**  
  Defines an interface for creating an object, but lets subclasses decide which class to instantiate.

- **Abstract Factory:**  
  Provides an interface for creating families of related or dependent objects without specifying their concrete classes.

- **Builder:**  
  Separates the construction of a complex object from its representation, allowing the same construction process to create different representations.

- **Prototype:**  
  Creates new objects by cloning an existing object, known as the prototype.

---

## 2. Structural Patterns

These patterns are concerned with how classes and objects are composed to form larger structures.

- **Adapter:**  
  Converts the interface of a class into another interface the client expects, allowing incompatible interfaces to work together.

- **Bridge:**  
  Decouples an abstraction from its implementation so that the two can vary independently.

- **Composite:**  
  Composes objects into tree structures to represent part-whole hierarchies, letting clients treat individual objects and compositions uniformly.

- **Decorator:**  
  Attaches additional responsibilities to an object dynamically, providing a flexible alternative to subclassing for extending functionality.

- **Facade:**  
  Provides a simplified interface to a complex subsystem, making it easier to use.

- **Flyweight:**  
  Reduces the cost of creating and manipulating a large number of similar objects by sharing common data.

- **Proxy:**  
  Provides a surrogate or placeholder for another object to control access to it.

---

## 3. Behavioral Patterns

These patterns are all about class’s objects communication. They help in assigning responsibilities between objects.

- **Chain of Responsibility:**  
  Passes a request along a chain of handlers, giving more than one object a chance to handle the request.

- **Command:**  
  Encapsulates a request as an object, thereby allowing for parameterization of clients with different requests.

- **Interpreter:**  
  Implements a specialized language and uses that to interpret sentences in the language.

- **Iterator:**  
  Provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation.

- **Mediator:**  
  Defines an object that encapsulates how a set of objects interact, promoting loose coupling by preventing objects from referring to each other explicitly.

- **Memento:**  
  Captures and externalizes an object’s internal state so that the object can be restored to this state later, without violating encapsulation.

- **Observer:**  
  Defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.

- **State:**  
  Allows an object to alter its behavior when its internal state changes. The object will appear to change its class.

- **Strategy:**  
  Defines a family of algorithms, encapsulates each one, and makes them interchangeable so that the algorithm can vary independently from the clients that use it.

- **Template Method:**  
  Defines the skeleton of an algorithm in an operation, deferring some steps to subclasses.

- **Visitor:**  
  Represents an operation to be performed on the elements of an object structure, allowing you to define a new operation without changing the classes of the elements on which it operates.

---

## 4. Additional and Architectural Patterns

These patterns address broader software architecture and organization concerns.

- **Model-View-Controller (MVC):**  
  Separates an application into three main components: Model (data), View (UI), and Controller (logic), to separate internal representations from user interaction.

- **Model-View-ViewModel (MVVM):**  
  Similar to MVC, but includes a ViewModel to manage the state and behavior of the View, particularly useful for data binding.

- **Repository:**  
  Provides a centralized abstraction for data access, hiding the details of how data is persisted or retrieved.

- **Dependency Injection (DI):**  
  Facilitates the creation and management of dependent objects, promoting loose coupling by injecting dependencies rather than creating them within the class.

- **Event-Driven Architecture:**  
  Organizes code around the production, detection, and reaction to events, which decouples the sender of an event from its receivers.

---

> **Note:**  
> This list covers many of the widely recognized design patterns, but it is not exhaustive. There are also domain-specific patterns, concurrent patterns, and variations of these patterns that address different challenges in software development.

