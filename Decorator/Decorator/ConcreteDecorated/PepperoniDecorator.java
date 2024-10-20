package Decorator.Decorator.ConcreteDecorated;

import Decorator.Component.Pizza;
import Decorator.Decorator.PizzaDecorator;

public class PepperoniDecorator extends PizzaDecorator{

    public PepperoniDecorator(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    public String getDescription(){
        return super.getDescription() + " pepperoni";
    }

    public Double getCost(){
        return super.getCost() + 3.00;
    }
    
}
