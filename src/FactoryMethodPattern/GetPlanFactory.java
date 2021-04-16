package FactoryMethodPattern;

public class GetPlanFactory {

    public Plan getPlan(String planType){

        if (planType.equalsIgnoreCase("FreePlan")){
            return new FreePlan();
        }else if (planType.equalsIgnoreCase("PremiumPlan")){
            return new PremiumPlan();
        }else if (planType.equalsIgnoreCase("CommercialPlan")){
            return new CommercialPlan();
        }else{
            return null;
        }

    }

}
