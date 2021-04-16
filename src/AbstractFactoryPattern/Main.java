package AbstractFactoryPattern;

public class Main {

    public static void main(String[] args) {

        AbstractFactory bankFactory = FactoryCreator.getFactory("bank");
        Bank bank =  bankFactory.getBank("sbi");

        AbstractFactory loanFactory = FactoryCreator.getFactory("loan");
        Loan loan = loanFactory.getLoan("education");
        loan.getInterestRate(10);
        loan.calculateLoanPayment(2000.0, 1);

    }

}
