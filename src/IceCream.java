public class IceCream extends DessertItem {
    private double cost = 0;
    IceCream(){}
    IceCream(String na, double co, int ca) {
        super(na, ca);
        cost = co;
    }

    public double getCost() {
        return cost;
    }
}
