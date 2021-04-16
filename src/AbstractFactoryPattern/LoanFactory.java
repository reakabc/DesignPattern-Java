package AbstractFactoryPattern;

public class LoanFactory extends AbstractFactory{

    public Loan getLoan(String loanType){
        if (loanType.equalsIgnoreCase("education")){
            return new EducationLoan();
        }else if (loanType.equalsIgnoreCase("home")){
            return new HomeLoan();
        }else if (loanType.equalsIgnoreCase("business")){
            return new BusinessLoan();
        }else {
            return null;
        }
    }

    @Override
    public Bank getBank(String loanType) {
        return null;
    }

}
