package Decorator.Decorator.ConcreteDecorated;

import Decorator.Component.Pizza;
import Decorator.Decorator.PizzaDecorator;

public class CheeseDecorator extends PizzaDecorator{

    public CheeseDecorator(Pizza decoratedPizza) {
        super(decoratedPizza);
        
    }
    
    public String getDescription(){
        return super.getDescription() + " cheese";
    }

    public Double getCost(){
        return super.getCost() + 2.00;
    }
}
