package machine;

import java.util.Scanner;

public class CoffeeMachineController {

    private int water;
    private int milk;
    private int coffeeBeans;
    private int disposableCups;
    private int money;

    private Scanner scanner;

    public CoffeeMachineController() {
        water = 400;
        milk = 540;
        coffeeBeans = 120;
        disposableCups = 9;
        money = 550;
        scanner = new Scanner(System.in);
        printStatus();
    }

    public void printStatus() {
        System.out.printf("%nThe coffee machine has:%n" +
                "%d of water%n" +
                "%d of milk%n" +
                "%d of coffee beans%n" +
                "%d of disposable cups%n" +
                "%d of money%n", water, milk, coffeeBeans, disposableCups, money);
    }

    public void buy() {
        Coffee coffee = coffeeType();

        if (coffee == null) {
            return;
        }

        water -= coffee.getWaterNeeded();
        milk -= coffee.getMilkNeeded();
        coffeeBeans -= coffee.getCoffeeBeansNeeded();
        money += coffee.getPrice();
        disposableCups--;
    }

    public Coffee coffeeType() {
        int coffeeType = 0;

        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
        coffeeType = scanner.nextInt();

        switch (coffeeType) {
            case 1:
                return new Coffee(250, 0, 16, 4);
            case 2:
                return new Coffee(350, 75, 20, 7);
            case 3:
                return new Coffee(200, 100, 12, 6);
            default:
                return null;
        }
    }

    public void fill() {
        System.out.println("Write how many ml of water do you want to add: ");
        water += scanner.nextInt();

        System.out.println("Write how many ml of milk do you want to add:");
        milk += scanner.nextInt();

        System.out.println("Write how many grams of coffee beans do you want to add:");
        coffeeBeans += scanner.nextInt();

        System.out.println("Write how many disposable cups of coffee do you want to add:");
        disposableCups += scanner.nextInt();
    }

    public void take() {
        System.out.println("I gave you $" + money);
        money = 0;
    }
}
