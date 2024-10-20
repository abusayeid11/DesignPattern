package Decorator;

import Decorator.Component.Pizza;
import Decorator.Component.PlainPizza;
import Decorator.Decorator.ConcreteDecorated.CheeseDecorator;
import Decorator.Decorator.ConcreteDecorated.PepperoniDecorator;

public class Client {
    public static void main(String[] args) {
        Pizza pizza = new PlainPizza();

        System.out.println(pizza.getDescription() + " " + pizza.getCost());

        Pizza cheesePizza = new CheeseDecorator(pizza);

        System.out.println(cheesePizza.getDescription() + " " +cheesePizza.getCost());

        Pizza cheesePepperonPizza = new PepperoniDecorator(cheesePizza);
        System.out.println(cheesePepperonPizza.getDescription() + " " + cheesePepperonPizza.getCost());
    }
}
