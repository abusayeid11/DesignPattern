package AbstractFactory.ConcreteFactory;

import AbstractFactory.AbstractFactory.GUIFactory;
import AbstractFactory.Product.button.Button;
import AbstractFactory.Product.button.WindowsButton;
import AbstractFactory.Product.checkbox.CheckBox;
import AbstractFactory.Product.checkbox.WindowsCheckBox;

public class WindowsFactory implements GUIFactory{

    @Override
    public Button createButton() {
        // TODO Auto-generated method stub
      return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox() {
       return new WindowsCheckBox();
    }
    
}
