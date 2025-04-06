package CreationalPatterns.FactoryPattern;

//Product Interface
interface Pizza {
    void prepare();
}

//Concrete Product 1
class VegPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing Veg Pizza");
    }
}

//Concrete Product 2
class CheesePizza implements Pizza {
    @Override
    public void prepare(){
        System.out.println("Preparing Cheese Pizza");
    }
}


//Factory Class
class PizzaFactory {
    public static Pizza getPizza(String type){
        if(type.equalsIgnoreCase("veg")) {
            return new VegPizza();
        }
        else if (type.equalsIgnoreCase("cheese")){
            return new CheesePizza();
        }
        return null;
    }
}
