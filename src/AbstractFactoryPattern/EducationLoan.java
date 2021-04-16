package AbstractFactoryPattern;

public class EducationLoan extends Loan{
    @Override
    public void getInterestRate(int r) {
        rate = r;
    }
}
