import java.util.ArrayList;

public class Checkout {
    private double cashRegister = 0;
    private int items = 0;
    private double taxRate = 0.0775;
    private String header = "        Candy Inc.\n       ------------\n";
    ArrayList<DessertItem> dItems= new ArrayList<>();
    Checkout(){}
    Checkout(DessertItem DI) {
        dItems.add(DI);
        cashRegister += DI.getCost();
        items += 1;
    }

    public void enterItem(DessertItem d) {
        dItems.add(d);
        cashRegister += d.getCost();
        items += 1;
    }

    public void setTaxRate(double tR) {
        taxRate = tR;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void clear() {
        dItems.clear();
        cashRegister = 0;
        items = 0;
        header = "        Candy Inc.\n       ------------\n";
    }

    public int numberofItems() {
        return items;
    }

    public double totalCost() {
        return Math.round(((cashRegister + this.totalTax()) * 100.0)) / 100.0;
    }

    public double totalTax() {
        return Math.round(((cashRegister * taxRate) * 100.0)) / 100.0;
    }

    public String toString() {

        for (DessertItem x: dItems) {
            if (x instanceof IceCream && !(x instanceof Sundae)) {
                header  += "(Ice Cream)";
            }

            else if (x instanceof Cookie)  {
                header += ((Cookie) x).getNumber() + " @ " + ((Cookie) x).getPricePerDozen() + " /dz.\n" + "(Cookie)";
            }
            else if (x instanceof Candy) {
                header += ((Candy) x).getWeight() + " lbs. @ " + ((Candy) x).getPricePerPound() + " /lb.\n" + "(Candy)";
            }
            else {
                header += "(Sundae)" + ((Sundae) x).getIceCreamName() + "\n";
                header += ((Sundae) x).getName() +  "(Topping)            ";
            }
            if (!(x instanceof Sundae)) {
                header += x.getName() + "            ";
            }

            header += x.getCost() + "\n" + "Calories: " + x.getCalories() + "\n";


        }
        header += "\nTax                           " + this.totalTax();
        header += "\nTotal Cost                    " + this.totalCost();
        return header;
    }

}
