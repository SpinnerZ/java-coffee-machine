package machine;

import java.util.Scanner;

public class CoffeeMachine {

    public static void main(String[] args) {
        CommonCoffee commonCoffee = new CommonCoffee();
        Scanner scanner = new Scanner(System.in);
        int cups;
        int water;
        int milk;
        int coffeeBeans;
        int cupsNeeded;

        System.out.println("Write how many ml of water the coffee machine has:");
        water = scanner.nextInt();

        System.out.println("Write how many ml of milk the coffee machine has:");
        milk = scanner.nextInt();

        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        coffeeBeans = scanner.nextInt();

        cups = commonCoffee.calculateCups(water, milk, coffeeBeans);

        System.out.println("Write how many cups of coffee you will need:");
        cupsNeeded = scanner.nextInt();

        if (cups == cupsNeeded) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (cups > cupsNeeded) {
            cups -= cupsNeeded;
            System.out.printf("Yes, I can make that amount of coffee (and even %d more than that)%n", cups);
        } else {
            System.out.printf("No, I can make only %d cup(s) of coffee", cups);
        }
    }
}
