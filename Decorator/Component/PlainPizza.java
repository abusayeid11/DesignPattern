package Decorator.Component;

public class PlainPizza implements Pizza{

    @Override
    public String getDescription() {
      return "plain pizza";
    }

    @Override
    public Double getCost() {
       return 4.00;
    }
    
}
