package FactoryMethodPattern;

public class PremiumPlan extends Plan {
    @Override
    public int getRate() {
        return 10;
    }
}
