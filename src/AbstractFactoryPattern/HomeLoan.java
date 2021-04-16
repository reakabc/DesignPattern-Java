package AbstractFactoryPattern;

public class HomeLoan extends Loan{
    @Override
    public void getInterestRate(int r) {
        rate = r;
    }
}
