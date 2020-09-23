import java.util.ArrayList;
import java.util.Collections;

public class tester {

    public static void main(String[] args) {
        ArrayList<DessertItem> Desserts= new ArrayList<>();

        Checkout first = new Checkout(new Candy("Corn", 1.5, 7.25, 457));

        first.enterItem(new Cookie("ChocChip", 17, 4.99, 250));
        first.enterItem(new IceCream("Vanilla", 10.05, 500));
        IceCream choc = new IceCream("Chocolate", 5.55, 500);
        first.enterItem(new Sundae("Sprinkles", 2.22, choc, 27));
        System.out.println(first.toString());
        Candy Snickers = new Candy("Snickers", 0.6, 20.00, 696);
        Candy KitKat = new Candy("KitKat", 0.6, 21.00, 696);
        System.out.print("\n");

        System.out.print("Between " + Snickers.getName() + " with " + Snickers.getCalories() + " and " +
                KitKat.getName() + " with " + KitKat.getCalories() + " the most is: ");
        if (DessertItem.max(Snickers, KitKat) == null) {
            System.out.println("They're equal");
        }
        else {System.out.println(DessertItem.max(Snickers, KitKat).getName() + "\n");}


        IceCream straw = new IceCream("Strawberry", 12.10, 700);
        System.out.print("Between " + straw.getName() + " with " + straw.getCalories() + " and " +
                KitKat.getName() + " with " + KitKat.getCalories() + " the most is: ");
        if (DessertItem.max(straw, KitKat) == null) {
            System.out.println("They're equal");
        }
        else {System.out.println(DessertItem.max(straw, KitKat).getName());}
        Cookie giantCook = new Cookie("ChocCook", 21, 1.00, 250);
        Sundae screaminSugar = new Sundae("screaminSugar", 2.22, choc, 27);
        System.out.print("Between " + giantCook.getName() + " with " + giantCook.getCalories() + " and " +
                screaminSugar.getName() + " with " + screaminSugar.getCalories() + " the most is: ");
        if (DessertItem.max(giantCook, screaminSugar) == null) {
            System.out.println("They're equal");
        }
        else {System.out.println(DessertItem.max(giantCook, screaminSugar).getName());}
        Candy Mounds = new Candy("Mounds", 0.9, 15.12, 396);
        IceCream mint = new IceCream("Mint", 9.99, 395);
        System.out.print("Between " + Mounds.getName() + " with " + Mounds.getCalories() + " and " +
                mint.getName() + " with " + mint.getCalories() + " the most is: ");
        if (DessertItem.max(Mounds, mint) == null) {
            System.out.println("They're equal");
        }
        else {System.out.println(DessertItem.max(Mounds, mint).getName());}
        Sundae banana = new Sundae("banana", 2.22, choc, 60);
        IceCream caramel = new IceCream("caramel", 4.22, 542);
        System.out.print("Between " + caramel.getName() + " with " + caramel.getCalories() + " and " +
                banana.getName() + " with " + banana.getCalories() + " the most is: ");
        if (DessertItem.max(caramel, banana) == null) {
            System.out.println("They're equal");
        }
        else {System.out.println(DessertItem.max(caramel, banana).getName());}
        Cookie nutter = new Cookie("nutter", 21, 1.00, 500);
        System.out.print("Between " + banana.getName() + " with " + banana.getCalories() + " and " +
                nutter.getName() + " with " + nutter.getCalories() + " the most is: ");
        if (DessertItem.max(banana, nutter) == null) {
            System.out.println("They're equal");
        }
        else {System.out.println(DessertItem.max(banana, nutter).getName() + "\n");}



        System.out.print("\n");

        Desserts.add(choc);
        Desserts.add(Snickers);
        Desserts.add(KitKat);
        Desserts.add(straw);
        Desserts.add(giantCook);
        Desserts.add(screaminSugar);

        for (DessertItem x: Desserts) {
            System.out.print("Name: " + x.getName() + " Calories: ");
            System.out.print(x.getCalories() + "\n");
        }

        System.out.print("\n");

        Collections.sort(Desserts);

        for (DessertItem x: Desserts) {
            System.out.print("Name: " + x.getName() + " Calories: ");
            System.out.print(x.getCalories() + "\n");
        }

    }
}
