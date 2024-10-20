package Composite;
import java.util.List;
import java.util.ArrayList;;
public class Directory implements FileSystemComponenet{
    private String name;
    private List<FileSystemComponenet> child;

    public Directory(String name){
           this.name = name;
           child = new ArrayList<>();
    }

    public void addComponent(FileSystemComponenet componenet){
       child.add(componenet);
    }

    public void removeComponent(FileSystemComponenet componenet){
        child.remove(componenet);
    }


    @Override
    public void displayDetails() {
       System.out.println("Directory: " + name);
       System.out.println("Content: ");

       for(FileSystemComponenet componenet: child){
        componenet.displayDetails();
       }
    }

   
}
