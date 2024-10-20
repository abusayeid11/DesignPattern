package AbstractFactory.Product.button;

public class  MacOSButton implements Button{

    @Override
    public void paint() {
       System.out.println("New MacOSButton created");
    }
    
}
