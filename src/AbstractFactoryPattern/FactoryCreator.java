package AbstractFactoryPattern;

public class FactoryCreator {

    public static AbstractFactory getFactory(String type){

        if (type.equalsIgnoreCase("bank")){
            return new BankFactory();
        }else if (type.equalsIgnoreCase("loan")){
            return new LoanFactory();
        }else {
            return null;
        }
    }

}
