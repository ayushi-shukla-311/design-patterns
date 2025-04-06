# SOLID Principles

SOLID is an acronym representing five design principles that help create more maintainable, scalable, and robust software. These principles guide developers to write code that is easy to understand, extend, and refactor.

---

## 1. Single Responsibility Principle (SRP)

**Definition:**  
A class should have only one reason to change, meaning it should only have one job or responsibility.

**Key Points:**
- **Modularity:** Each class handles a specific part of the functionality.
- **Maintainability:** Changes in one part of the system affect only the relevant class.
- **Clarity:** Reduces complexity by keeping each class focused on a single task.

**Example:**

Definition:
Software entities should be open for extension but closed for modification. This means that you should be able to add new functionality without altering existing code.

Key Points:

Extensibility: New behaviors can be added with minimal changes to existing code.

Stability: Existing functionality remains intact, reducing the risk of bugs.

Example:

java
Copy
// Without OCP: Modifying existing code to add new functionality
public class Shape {
    public static final int CIRCLE = 1;
    public static final int SQUARE = 2;
    
    public int type;
    
    public Shape(int type) {
        this.type = type;
    }
    
    public double area() {
        if (type == CIRCLE) {
            // Compute area for circle
        } else if (type == SQUARE) {
            // Compute area for square
        }
        return 0;
    }
}
java
Copy
// With OCP: New shapes can be added by extending the base class
public abstract class Shape {
    public abstract double area();
}

public class Circle extends Shape {
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

public class Square extends Shape {
    private double side;
    
    public Square(double side) {
        this.side = side;
    }
    
    @Override
    public double area() {
        return side * side;
    }
}
3. Liskov Substitution Principle (LSP)
Definition:
Subtypes must be substitutable for their base types. Objects of a superclass should be replaceable with objects of a subclass without affecting the correctness of the program.

Key Points:

Interchangeability: Derived classes should extend the base class without changing its expected behavior.

Robustness: Ensures that a subclass can stand in for its parent class without breaking the system.

Example:

java
Copy
public class Bird {
    public void fly() {
        // Implementation for flying
    }
}

public class Sparrow extends Bird {
    @Override
    public void fly() {
        // Sparrow-specific flying behavior
    }
}

// Violates LSP if a subclass cannot perform the parent's behavior:
public class Ostrich extends Bird {
    @Override
    public void fly() {
        // Ostriches cannot fly, which violates the expectation from Bird
    }
}
Correct Approach:
Redesign the hierarchy by separating flying and non-flying birds into different classes or interfaces.

4. Interface Segregation Principle (ISP)
Definition:
Clients should not be forced to depend on interfaces they do not use. It’s better to have many small, specific interfaces than one large, general-purpose interface.

Key Points:

Decoupling: Reduces the impact of changes by isolating functionality.

Cohesion: Interfaces are designed around specific behaviors, making them more focused and easier to implement.

Example:

java
Copy
// Bad Example: A large interface that forces unnecessary implementations
public interface Worker {
    void work();
    void eat();
}

public class Robot implements Worker {
    @Override
    public void work() {
        // Robot works
    }
    
    @Override
    public void eat() {
        // Robots don't eat, but must implement this method
    }
}
java
Copy
// Good Example: Segregated interfaces
public interface Workable {
    void work();
}

public interface Eatable {
    void eat();
}

public class HumanWorker implements Workable, Eatable {
    @Override
    public void work() {
        // Human works
    }
    
    @Override
    public void eat() {
        // Human eats
    }
}

public class Robot implements Workable {
    @Override
    public void work() {
        // Robot works
    }
}
5. Dependency Inversion Principle (DIP)
Definition:
High-level modules should not depend on low-level modules. Both should depend on abstractions (e.g., interfaces). Abstractions should not depend on details; details should depend on abstractions.

Key Points:

Decoupling: Reduces coupling between high-level and low-level components.

Flexibility: Makes it easier to swap out implementations without changing the high-level code.

Example:

java
Copy
// Without DIP: High-level module depends directly on a low-level module
public class LightBulb {
    public void turnOn() {
        // Turn on the light bulb
    }
}

public class Switch {
    private LightBulb bulb = new LightBulb();
    
    public void operate() {
        bulb.turnOn();
    }
}
java
Copy
// With DIP: High-level module depends on an abstraction
public interface Switchable {
    void turnOn();
}

public class LightBulb implements Switchable {
    @Override
    public void turnOn() {
        // Turn on the light bulb
    }
}

public class Switch {
    private Switchable device;
    
    public Switch(Switchable device) {
        this.device = device;
    }
    
    public void operate() {
        device.turnOn();
    }
}
Summary
SRP: Each class has only one responsibility.

OCP: Code should be extendable without modifying existing code.

LSP: Subclasses should be replaceable with their base classes.

ISP: Use small, specific interfaces rather than large, general ones.

DIP: Depend on abstractions, not concrete implementations.

By adhering to these SOLID principles, you create code that is easier to maintain, test, and extend.

