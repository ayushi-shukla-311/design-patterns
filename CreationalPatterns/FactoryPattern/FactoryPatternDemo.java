package CreationalPatterns.FactoryPattern;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        Pizza pizza1 = PizzaFactory.getPizza("veg");
        pizza1.prepare();

        Pizza pizza2 = PizzaFactory.getPizza("cheese");
        pizza2.prepare();
    }
    
}
