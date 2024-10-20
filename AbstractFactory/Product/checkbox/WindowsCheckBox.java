package AbstractFactory.Product.checkbox;

public class WindowsCheckBox implements CheckBox{

    @Override
    public void paint() {
       System.out.println("New WindowsCheckBox created");
    }
    
}
