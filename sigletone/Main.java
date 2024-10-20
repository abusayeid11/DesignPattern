class Database {
    public static Database databaseInstance;
    private String connectionString;

    private Database(String connectionString){
        this.connectionString = connectionString;
    }

    public static Database getDatabaseInstance(String connectionString){
        if(databaseInstance == null){
            databaseInstance = new Database(connectionString);
        }
        return databaseInstance;
    }

    public String getConnectionString(){
        return connectionString;
    }
}

public class Main {
    public static void main(String[] args) {
        Database session1 = Database.getDatabaseInstance("value-1");
        System.out.println(session1.getConnectionString());

        // trying to create another Database session

         Database session2 = Database.getDatabaseInstance("value-2");
         System.out.println(session2.getConnectionString());
    }
}