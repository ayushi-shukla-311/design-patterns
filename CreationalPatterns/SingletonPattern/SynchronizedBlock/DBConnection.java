package CreationalPatterns.singletonPattern.SynchronizedBlock;

public class DBConnection {
    private static volatile DBConnection conObject; //it is a bit slow because volatile makes the object to be updated in memory directly rather than cache
    private DBConnection(){

    }

    synchronized public static DBConnection getInstance(){ 
        if(conObject==null){
            synchronized(DBConnection.class){
                if(conObject==null){
                    return new DBConnection();
                }
            } 
        }
        return conObject;
    }
}
