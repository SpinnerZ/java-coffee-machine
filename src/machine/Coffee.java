package machine;

public class Coffee {

    private int waterNeeded;
    private int milkNeeded;
    private int coffeeBeansNeeded;
    private int price;

    public Coffee(int waterNeeded, int milkNeeded, int coffeeBeansNeeded, int price) {
        this.waterNeeded = waterNeeded;
        this.milkNeeded = milkNeeded;
        this.coffeeBeansNeeded = coffeeBeansNeeded;
        this.price = price;
    }

    public int getWaterNeeded() {
        return waterNeeded;
    }

    public int getMilkNeeded() {
        return milkNeeded;
    }

    public int getCoffeeBeansNeeded() {
        return coffeeBeansNeeded;
    }

    public int getPrice() {
        return price;
    }
}