import java.util.ArrayList;
import java.util.Collections;

public class tester {

    public static void main(String[] args) {
        ArrayList<DessertItem> Desserts= new ArrayList<>();

        Checkout first = new Checkout(new Candy("Corn", 1.5, 7.25, 457));

        first.enterItem(new Cookie("ChocChip", 17, 4.99, 250));
        first.enterItem(new IceCream("Vanilla", 10.05, 500));
        IceCream choc = new IceCream("Chocolate", 5.55, 700);
        first.enterItem(new Sundae("Sprinkles", 2.22, choc, 27));
        System.out.println(first.toString());
        Candy Snickers = new Candy("Snickers", 0.6, 20.00, 921);
        Candy KitKat = new Candy("KitKat", 0.6, 21.00, 696);
        System.out.print("\n");

        System.out.println(DessertItem.max(Snickers, KitKat).getName());
        IceCream straw = new IceCream("Strawberry", 12.10, 700);
        System.out.println(DessertItem.max(straw, KitKat).getName());
        Cookie giantCook = new Cookie("ChocCook", 21, 1.00, 250);
        Sundae screaminSugar = new Sundae("screaminSugar", 2.22, choc, 27);
        System.out.println(DessertItem.max(giantCook, screaminSugar).getName());
        System.out.print("\n");

        Desserts.add(choc);
        Desserts.add(Snickers);
        Desserts.add(KitKat);
        Desserts.add(straw);
        Desserts.add(giantCook);
        Desserts.add(screaminSugar);

        for (DessertItem x: Desserts) {
            System.out.print(x.getName());
            System.out.print(x.getCalories() + "\n");
        }

        System.out.print("\n");

        Collections.sort(Desserts);

        for (DessertItem x: Desserts) {
            System.out.print(x.getName());
            System.out.print(x.getCalories() + "\n");
        }

    }
}
