package StructuralPatterns.StrategyPattern;

//Component Interface
interface Coffee{
    String getDescription();
    double cost();
}

//Concrete Component
class SimpleCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Simple Coffee";
    }

    @Override
    public double cost() {
        return 5.0;
    }
}

//Decorator Class (Abstract Decorator)

abstract class CoffeeDecorator implements Coffee {
    private Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee coffee) {
        this.decoratedCoffee = coffee;
    }

    public String getDescription(){
        return decoratedCoffee.getDescription();
    }


    public double cost(){
        return decoratedCoffee.cost();
    }
}


// Concrete Decorators (Add-ons)

class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee){
        super(coffee);
    }

    public String getDescription(){
        return super.getDescription() + ", Milk";
    }

    public double cost(){
        return super.cost() + 1.5; // Add cost of milk
    }
}


class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee){
        super(coffee);
    }

    public String getDescription(){
        return super.getDescription() + ", Sugar";
    }

    public double cost(){
        return super.cost() + 0.5; // Add cost of milk
    }
}
