package AbstractFactoryPattern;

public class HDFC extends Bank {

    private String bankName;

    public HDFC() {
        bankName = "HDFC";
    }

    @Override
    public String getBankName() {
        return bankName;
    }
}
