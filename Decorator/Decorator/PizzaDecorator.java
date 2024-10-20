package Decorator.Decorator;

import Decorator.Component.Pizza;

public class PizzaDecorator implements Pizza{

    protected Pizza decoratedPizza;

    public PizzaDecorator(Pizza decoratedPizza){
        this.decoratedPizza = decoratedPizza;
    }

    @Override
    public String getDescription() {
       return decoratedPizza.getDescription();
    }

    @Override
    public Double getCost() {
       return decoratedPizza.getCost();
    }
    
}
