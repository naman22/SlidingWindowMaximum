package singleton;

// Making this class singleton
public class AppConfig {
    private AppConfig(){
    }

    //static object which is created only once
    private static AppConfig obj = null; //we are not initializing it with object creation so that even if it is not used in our app , no error occurs

    //static function to return static object
    public static AppConfig getInstance() {
        if(obj == null){
            obj = new AppConfig();
        }
        return obj;
    }
}
