package BehavioralPatterns;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        // Start with Strategy A
        Context context = new Context(new ConcreteStrategyA());
        context.executeStrategy(); // Output: ConcreteStrategyA executed.

        // Change to Strategy B at runtime
        context.setStrategy(new ConcreteStrategyB());
        context.executeStrategy(); // Output: ConcreteStrategyB executed.
    }
}
