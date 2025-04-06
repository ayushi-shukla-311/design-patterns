package CreationalPatterns.singletonPattern.lazyInitialisation;

public class DBConnection {
    private static DBConnection conObject;
    private DBConnection() { // so that no other class can create object of this

    }

    public static DBConnection getInstance(){
        if(conObject==null){  // but this also not ensure single object creation when we are dealing with threads
            return new DBConnection();
        }
        return conObject;
    }
}
