package AbstractFactory.ConcreteFactory;

import AbstractFactory.AbstractFactory.GUIFactory;
import AbstractFactory.Product.button.Button;
import AbstractFactory.Product.button.MacOSButton;
import AbstractFactory.Product.checkbox.CheckBox;
import AbstractFactory.Product.checkbox.MacOSCheckBox;

public class MacOSFactory implements GUIFactory{

    @Override
    public Button createButton() {
        // TODO Auto-generated method stub
      return new MacOSButton();
    }

    @Override
    public CheckBox createCheckBox() {
        // TODO Auto-generated method stub
       return new MacOSCheckBox();
    }

   
    
}
