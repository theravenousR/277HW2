public class Cookie extends DessertItem {
    private double number = 0;
    private double pricePerDozen = 0;
    Cookie(){}
    Cookie(String na, double nu, double ppD, int c) {
        super(na, c);
        number = nu;
        pricePerDozen = ppD;
    }

    public double getNumber() {
        return number;
    }

    public double getPricePerDozen() {
        return  pricePerDozen;
    }

    public double getCost() {
        return Math.round((((number/12) * pricePerDozen)) * 100.0) / 100.0;
    }
}
