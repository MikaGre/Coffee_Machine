package machine;

import java.util.Scanner;

public class CoffeeMachine {
   static Scanner scanner = new Scanner(System.in);

    public static int water = 400;
    public static int milk = 540;
    public static int coffeeBeans = 120;
    public static int disposableCups = 9;
    public static int money = 550;
    public static String userAction;

    public static void main(String[] args) {

        do {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            userAction = scanner.next().toLowerCase();

            switch (userAction){
                case "buy":
                    buy();
                    break;
                case "fill":
                    fill();
                    break;
                case "take":
                    take();
                    break;
                case "remaining":
                    remaining();
                    break;
                case "exit":
                    System.exit(0);
                    break;

            }
        } while (true);

    }

    static void buy() {

        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String coffeeType = scanner.next().toLowerCase();

        switch (coffeeType) {
            case "1":
                if (water <= 250 || coffeeBeans <= 16 || disposableCups <= 1) {
                    System.out.println("Sorry, not enough water!");
                } else {
                    System.out.println("I have enough resources, making you a coffee!");
                    water -= 250;
                    coffeeBeans -= 16;
                    money += 4;
                    disposableCups -= 1;
                }
                break;
            case "2":
                if (water <= 350 || milk <= 75 || coffeeBeans <= 75 || disposableCups <= 1) {
                    System.out.println("Sorry, not enough water!");
                } else {
                    System.out.println("I have enough resources, making you a coffee!");
                    water -= 350;
                    milk -= 75;
                    coffeeBeans -= 20;
                    money += 7;
                    disposableCups -= 1;
                }
                break;
            case "3":
                if (water <= 200 || milk <= 100 || coffeeBeans <= 12 || disposableCups <= 1) {
                    System.out.println("Sorry, I need more resources");
                } else {
                    System.out.println("I have enough resources, making you a coffee!");
                    water -= 200;
                    milk -= 100;
                    coffeeBeans -= 12;
                    money += 6;
                    disposableCups -= 1;
                }
                break;
            case "back":
                break;
            case "exit":
                System.exit(0);
           default:
               break;
        }
    }


        static void fill(){
            System.out.println("Write how many ml of water do you want to add:");
            int howMuchWater = scanner.nextInt();
            System.out.println("Write how many ml of milk do you want to add:");
            int howMuchMilk = scanner.nextInt();
            System.out.println("Write how many grams of coffee beans do you want to add:");
            int howMuchCoffeeBeans = scanner.nextInt();
            System.out.println("Write how many disposable cups of coffee do you want to add:");
            int numOfCups = scanner.nextInt();

            water+=howMuchWater;
            milk+=howMuchMilk;
            coffeeBeans+=howMuchCoffeeBeans;
            disposableCups+=numOfCups;

        }

        static void take(){
            if (money > 0) {
                System.out.println("I gave you $" + money);
                money-=money;
            } else {
                System.out.println("I have no money");
            }

        }

        static void remaining(){
            System.out.println("The coffee machine has: ");
            System.out.println(water + " of water");
            System.out.println(milk + " of milk");
            System.out.println(coffeeBeans + " of coffee beans");
            System.out.println(disposableCups +" of disposable cups");
            System.out.println("$"+ money + " of money");

        }


}


