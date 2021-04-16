package AbstractFactoryPattern;

public class BusinessLoan extends Loan{
    @Override
    public void getInterestRate(int r) {
        rate = r;
    }
}
