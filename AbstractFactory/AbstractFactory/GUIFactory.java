package AbstractFactory.AbstractFactory;

import AbstractFactory.Product.button.Button;
import AbstractFactory.Product.checkbox.CheckBox;

public interface GUIFactory {

    Button createButton();
    CheckBox createCheckBox();
} 
