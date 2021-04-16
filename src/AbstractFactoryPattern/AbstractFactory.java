package AbstractFactoryPattern;

public abstract class AbstractFactory {

    public abstract Loan getLoan(String bankName);
    public abstract Bank getBank(String loanType);

}
