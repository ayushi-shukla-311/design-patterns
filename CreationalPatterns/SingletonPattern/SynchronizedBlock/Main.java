package CreationalPatterns.SingletonPattern.SynchronizedBlock;

public class Main {
    public static void main(String[] args) {
        DBConnection dbConnection = DBConnection.getInstance();
        System.out.println(dbConnection.toString());;
    }
}
