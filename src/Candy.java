import java.lang.Math;

public class Candy extends DessertItem {
    private double weight = 0;
    private double pricePerPound = 0;
    Candy(){}
    Candy(String na, double w, double ppP, int c){
        super(na, c);
        weight = w;
        pricePerPound = ppP;
    }

    public double getWeight() {
        return weight;
    }

    public double getPricePerPound() {
        return pricePerPound;
    }

    public double getCost() {
        return Math.round(((weight * pricePerPound) * 100.0)) / 100.0;
    }
}
