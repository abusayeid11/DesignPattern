package AbstractFactory.Client;

import AbstractFactory.AbstractFactory.GUIFactory;
import AbstractFactory.Product.button.Button;
import AbstractFactory.Product.checkbox.CheckBox;

public class Application {
    private Button button;
    private CheckBox checkBox;

    public Application(GUIFactory factory){
        button = factory.createButton();
        checkBox = factory.createCheckBox();
    }

    public void paint(){
        button.paint();
        checkBox.paint();
    }
}
