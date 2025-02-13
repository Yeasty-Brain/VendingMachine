import java.util.*;

public class vendingmachine {
    public static int money = 0;
    public static double change = 0;
    public static void main(String[] args){

        //Create scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n1. Oreos: $3.50 \n2. Chips: $1.00\n3. Coca-cola: $2.50\n4. Pepsi: $1.00\n5. Water: $2.50");
        System.out.println("\nWelcome to the vending machine please pick a snack to buy: ");
    
        String choice = scanner.nextLine();

        System.out.println("How much money would you like to enter into the machine?");
        int money = scanner.nextInt();

        switch (choice){
            case "1":
                System.out.println("Oreos: $3.50");
                change = money - 3.50;
                break;
            case "2":
                System.out.println("Chips: $1.00");
                change = money - 1.00;
                break;
            case "3":
                System.out.println("Coca-cola: $2.50");
                change = money - 2.50;
                break;
            case "4":
                System.out.println("Pepsi: $1.00");
                change = money - 1.00;
                break;
            case "5":
                System.out.println("Water: $2.50");
                change = money - 2.50;
                break;
        }
        System.out.printf("Here is your change: $%,.2f", change);

    }
}