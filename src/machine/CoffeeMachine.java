package machine;

import java.util.Scanner;

public class CoffeeMachine {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CoffeeMachineController coffeeMachineController = new CoffeeMachineController();
        String action = "";

        System.out.println("\nWrite action (buy, fill, take):");
        action = scanner.nextLine();

        switch (action) {
            case "buy":
                coffeeMachineController.buy();
                break;
            case "fill":
                coffeeMachineController.fill();
                break;
            case "take":
                coffeeMachineController.take();
                break;
            default:
                break;
        }

        coffeeMachineController.printStatus();
    }
}
