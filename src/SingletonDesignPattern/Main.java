package SingletonDesignPattern;

public class Main {

    public static void main(String[] args) {

        EarlySingleton earlySingleton = EarlySingleton.getSingleton();
        earlySingleton.printObjectName();

        LazySingleton lazySingleton = LazySingleton.getSingleton();
        lazySingleton.printObjectName();

    }

}
