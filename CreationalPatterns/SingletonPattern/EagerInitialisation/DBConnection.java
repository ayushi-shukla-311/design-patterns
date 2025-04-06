package CreationalPatterns.SingletonPattern.EagerInitialisation;

public class DBConnection {
    private static DBConnection conObject = new DBConnection(); // As soon as we start the application these static var will be pre loaded in memory
    private DBConnection() { // so that no other class can create object of this

    }

    public static DBConnection getInstance(){
        return conObject;
    }
}