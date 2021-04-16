package FactoryMethodPattern;

public class Main {

    public static void main(String[] args) {

        Plan myPlan = new GetPlanFactory().getPlan("PremiumPlan");
        System.out.println(myPlan.getRate());
        myPlan.calculateBill(10);

    }

}
