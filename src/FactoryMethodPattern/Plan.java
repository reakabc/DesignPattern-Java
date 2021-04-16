package FactoryMethodPattern;

public abstract class Plan {

    private int rate;
    public abstract int getRate();
    public void calculateBill(int unit){
        System.out.println(rate*unit);
    }

}
