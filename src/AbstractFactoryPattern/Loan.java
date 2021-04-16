package AbstractFactoryPattern;

public abstract class Loan {

    protected int rate;

    public abstract void getInterestRate(int rate);

    public void calculateLoanPayment(double loanAmount, int years){

        double EMI;

        EMI=(rate*loanAmount*12)/(100*12);

        System.out.println("your monthly EMI is "+ EMI +" for the amount "+loanAmount+" you have borrowed");

    }

}
