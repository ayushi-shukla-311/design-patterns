package CreationalPatterns.AbstractFactoryPattern;

// Product Interfaces
interface Chair {
    void sitOn();
}

interface Sofa {
    void lieOn();
}

// Concrete Products
class ModernChair implements Chair {
    public void sitOn() {
        System.out.println("Sitting on a Modern Chair");
    }
}

class VictorianChair implements Chair {
    public void sitOn() {
        System.out.println("Sitting on a Victorian Chair");
    }
}

class ModernSofa implements Sofa {
    public void lieOn() {
        System.out.println("Lying on a Modern Sofa");
    }
}

class VictorianSofa implements Sofa {
    public void lieOn() {
        System.out.println("Lying on a Victorian Sofa");
    }
}

// Abstract Factory Interface
interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
}

class ModernFurnitureFactory implements FurnitureFactory {
    public Chair createChair() {
        return new ModernChair();
    }

    public Sofa createSofa() {
        return new ModernSofa();
    }
}

class VictorianFurnitureFactory implements FurnitureFactory {
    public Chair createChair() {
        return new VictorianChair();
    }

    public Sofa createSofa() {
        return new VictorianSofa();
    }
}

