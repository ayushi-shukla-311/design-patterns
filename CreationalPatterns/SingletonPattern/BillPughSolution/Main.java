package CreationalPatterns.SingletonPattern.BillPughSolution;

public class Main {
    public static void main(String args[]){
        DBConnection conObject = DBConnection.getInstance();
        System.out.println(conObject.toString());
    }
}
