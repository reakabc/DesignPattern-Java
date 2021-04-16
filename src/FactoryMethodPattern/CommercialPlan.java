package FactoryMethodPattern;

public class CommercialPlan extends Plan {
    @Override
    public int getRate() {
        return 15;
    }
}
