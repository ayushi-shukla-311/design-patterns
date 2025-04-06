package BehavioralPatterns;

interface Strategy {
    void execute();
}

class ConcreteStrategyA implements Strategy {
    public void execute() {
        System.out.println("ConcreteStrategyA executed.");
    }
}

// Second strategy implementation
class ConcreteStrategyB implements Strategy {
    public void execute() {
        System.out.println("ConcreteStrategyB executed.");
    }
}

// 3. Context class that uses a Strategy
class Context {
    private Strategy strategy; // holds a reference to the current strategy

    // Constructor to set initial strategy
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    // Method to change the strategy at runtime
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    // Delegate the task to the strategy
    public void executeStrategy() {
        strategy.execute();
    }
}

// 4. Demo showing how strategies can be changed at runtime

