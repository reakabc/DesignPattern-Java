package SingletonDesignPattern;

public class EarlySingleton {

    private static EarlySingleton obj = new EarlySingleton();

    private EarlySingleton(){} //private constructor to prevent initialization from outside of class

    public static EarlySingleton getSingleton(){
        return obj;
    }

    //we can add methods and other logic here
    public void printObjectName(){
        System.out.println("EarlySingleton");
    }
}
