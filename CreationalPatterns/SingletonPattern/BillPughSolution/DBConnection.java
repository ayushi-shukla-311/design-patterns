package CreationalPatterns.singletonPattern.BillPughSolution;
// This is a thread safe singleton class


//this is inspired form eager initialisation only, it's just that in eager the object gets initialised as soon as the application starts but here it's not
public class DBConnection {
    private DBConnection(){

    } 

    private static class DBConnectionHelper{
        private static final DBConnection obj = new DBConnection();     
    }

    public static DBConnection getInstance(){
        return DBConnectionHelper.obj;
    }
}
