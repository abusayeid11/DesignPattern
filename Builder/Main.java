
public class Main {

    public static void main(String[] args) {
        Computer c = new Computer.ComputerBuilder("8GB", "8GB")
        .setGraphicsCardEnabled(true)
        .setBluetoothEnabled(true)
                .build();

              System.out.println(c.isGraphicCardEnabled());
    }
}