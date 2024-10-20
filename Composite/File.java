package Composite;

public class File implements FileSystemComponenet{

    private String name;

    public File(String name){
         this.name = name;
    }



    @Override
    public void displayDetails() {
       System.out.println("File: " + name);
    }
    
}
