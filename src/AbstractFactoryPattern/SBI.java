package AbstractFactoryPattern;

public class SBI extends Bank {

    private String bankName;

    public SBI(){
        bankName = "SBI";
    }

    @Override
    public String getBankName() {
        return bankName;
    }
}
