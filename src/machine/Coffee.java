package machine;

public class Coffee {

    private int waterNeeded = 0;
    private int milkNeeded = 0;
    private int coffeeBeansNeeded = 0;
    private int price = 0;

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