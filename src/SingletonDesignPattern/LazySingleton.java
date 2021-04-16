package SingletonDesignPattern;

public class LazySingleton {

    private static LazySingleton obj;

    private LazySingleton(){}

    public static LazySingleton getSingleton(){

        if (obj == null){
            obj = new LazySingleton();
        }
        return obj;

    }

    public void printObjectName(){
        System.out.println("LazySingleton");
    }

}
