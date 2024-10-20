package Composite;

public class Client {
    public static void main(String[] args) {
        File file1 = new File("document.txt");
        File file2 = new File("spreadsheet.xml");
        File file3 = new File("image.Jpg");

        Directory directory1 = new Directory("Documents");
        directory1.addComponent(file1);
        directory1.addComponent(file3);

        Directory directory2 = new Directory("Images");
        directory2.addComponent(file2);

        Directory root = new Directory("rootDirectory");

        root.addComponent(directory1);
        root.addComponent(directory2);

        root.displayDetails();

    }
}
