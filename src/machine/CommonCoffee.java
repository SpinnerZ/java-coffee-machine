package machine;

public class CommonCoffee {

    public static int WATER_NEEDED = 200;
    public static int MILK_NEEDED = 50;
    public static int COFFEE_BEANS_NEEDED = 15;

    public int calculateCups(int water, int milk, int coffeeBeans) {
        int cups = 0;
        boolean cupFilled = false;

        do {
            if (water < WATER_NEEDED || milk < MILK_NEEDED || coffeeBeans < COFFEE_BEANS_NEEDED) {
                cupFilled = false;
                break;
            }

            water -= WATER_NEEDED;
            milk -= MILK_NEEDED;
            coffeeBeans -= COFFEE_BEANS_NEEDED;
            cups++;
            cupFilled = true;
        } while (cupFilled);

        return cups;
    }
}
