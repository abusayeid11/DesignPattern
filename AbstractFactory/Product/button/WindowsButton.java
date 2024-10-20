package AbstractFactory.Product.button;

public class WindowsButton implements Button{

    @Override
    public void paint() {
      System.out.println("New WindowsButton created");
    }
    
}
