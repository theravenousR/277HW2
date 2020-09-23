public abstract class DessertItem implements Comparable<DessertItem> {
    protected String name;
    protected int calories = 0;
    /**
     * Null constructor for DessertItem class
     */
    public DessertItem() {
        name = "";
    }
    /**
     * Initializes DessertItem data
     */
    public DessertItem(String name, int c) {
        this.name = name;
        calories = c;
    }
    /**
     * Returns name of DessertItem
     * @return name of DessertItem
     */
    public final String getName() {
        return name;
    }

    public void setCalories(int c) {
        calories = c;
    }

    public int getCalories() {
        return calories;
    }

    public int compareTo(DessertItem i) {
        if (this.getCalories()<i.getCalories())  {
            return-1;
        }
        else if (this.getCalories()>i.getCalories()) {
            return 1;
        }
        else {
            return 0;
        }
    }

    public static DessertItem max(DessertItem i, DessertItem j) {
        if (i.compareTo(j) < 0) {
            return j;
        }
        else if (i.compareTo(j) > 0){
            return i;
        }
        else {
            return null;
        }
    }

    /**
     * Returns cost of DessertItem
     * @return cost of DessertItem
     */
    public abstract double getCost();
}