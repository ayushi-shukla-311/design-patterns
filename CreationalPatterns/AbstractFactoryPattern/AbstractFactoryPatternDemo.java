package CreationalPatterns.AbstractFactoryPattern;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        FurnitureFactory factory = new ModernFurnitureFactory();
        Chair chair = factory.createChair();
        Sofa sofa = factory.createSofa();

        chair.sitOn();
        sofa.lieOn();

        factory = new VictorianFurnitureFactory();
        chair = factory.createChair();
        sofa = factory.createSofa();
        chair.sitOn();
        sofa.lieOn();
    }
    
}
