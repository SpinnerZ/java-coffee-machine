package machine;

import java.util.Scanner;

public class CoffeeMachine {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CoffeeMachineController coffeeMachineController = new CoffeeMachineController();
        String action;
        boolean isExit = false;

        do {
            System.out.println("\nWrite action (buy, fill, take, remaining, exit):");
            action = scanner.nextLine();

            switch (action) {
                case "buy":
                    coffeeMachineController.buy();
                    isExit = false;
                    break;
                case "fill":
                    coffeeMachineController.fill();
                    isExit = false;
                    break;
                case "take":
                    coffeeMachineController.take();
                    isExit = false;
                    break;
                case "remaining":
                    coffeeMachineController.printStatus();
                    isExit = false;
                    break;
                case "exit":
                    isExit = true;
                    break;
                default:
                    break;
            }
        } while (isExit);
    }
}
