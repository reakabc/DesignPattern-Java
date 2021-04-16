package AbstractFactoryPattern;

public class BankFactory extends AbstractFactory{

    @Override
    public Loan getLoan(String bankName) {
        return null;
    }

    public Bank getBank(String bankName){

        if (bankName.equalsIgnoreCase("sbi")){
            return new SBI();
        }else if (bankName.equalsIgnoreCase("pnb")){
            return new PNB();
        }else if (bankName.equalsIgnoreCase("hdfc")){
            return new HDFC();
        }else {
            return null;
        }

    }

}
