package StructuralPatterns.StrategyPattern;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Coffee myOrder = new SimpleCoffee();
        myOrder = new MilkDecorator(myOrder);
        myOrder = new SugarDecorator(myOrder);

        System.out.println("Order: " + myOrder.getDescription());
        System.out.println("Total Cost: $" + myOrder.cost());
    }
    
}
