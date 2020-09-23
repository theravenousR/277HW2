public class Sundae extends IceCream {
    private double toppingCost;
    private double iceCreamCost = 0;
    private String iCName;
    private int calorie;
    Sundae(){}
    Sundae(String na, double t, IceCream ic, int ca){
        name = na;
        calorie = ca + ic.getCalories();
        toppingCost = t;
        iceCreamCost = ic.getCost();
        iCName = ic.getName();
    }

    public double getTopping() {
        return toppingCost;
    }

    public  double  getIceCreamCost() {
        return iceCreamCost;
    }

    public String getIceCreamName()  {
        return iCName;
    }

    public int getCalories() {
        return calorie;
    }

    public double getCost() {
        return toppingCost + iceCreamCost;
    }
}
