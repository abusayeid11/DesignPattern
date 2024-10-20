package AbstractFactory.Product.checkbox;

public class MacOSCheckBox implements CheckBox{

    @Override
    public void paint() {
       System.out.println("New MacOsCheckBox created");
    }
    
}
