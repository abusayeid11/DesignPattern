package AbstractFactory.Client;

import AbstractFactory.AbstractFactory.GUIFactory;
import AbstractFactory.ConcreteFactory.MacOSFactory;
import AbstractFactory.ConcreteFactory.WindowsFactory;

public class Demo {
    public static Application ConfigureApplication(){
        Application app;
        GUIFactory factory;

        // String OsName = System.getProperty("os.name").toLowerCase();
        String OsName = "mac";

        if(OsName.contains("mac")){
            factory = new MacOSFactory();
        }
        else{
            factory = new WindowsFactory();
        }

        app = new Application(factory);

        return app;
    }

    public static void main(String[] args) {
        Application app = ConfigureApplication();
        app.paint();
    }
}
