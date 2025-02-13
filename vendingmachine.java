import java.util.*;

public class vendingmachine {
    public static int money = 0;
    public static double change = 0;
    public static double amount = 0;
    public static void main(String[] args){

        //Create scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n1. Oreos: $3.50 \n2. Chips: $1.00\n3. Coca-cola: $2.50\n4. Pepsi: $1.00\n5. Water: $2.50");
        System.out.println("\nWelcome to the vending machine please pick a snack to buy: ");
    
        String choice = scanner.nextLine();

        System.out.println("How much money would you like to enter into the machine?");
        int money = scanner.nextInt();

        System.out.println("Type 'yes' to confirm or 'no' to cancel: ");
        String confirmation = scanner.next().toLowerCase();

        switch (choice){
            case "1":
                System.out.println("Oreos: $3.50");
                amount = 3.50;
                change = money - amount;
                break;
            case "2":
                System.out.println("Chips: $1.00");
                amount = 1.00;
                change = money - amount;
                break;
            case "3":
                System.out.println("Coca-cola: $2.50");
                amount = 2.50;
                change = money - amount;
                break;
            case "4":
                System.out.println("Pepsi: $1.00");
                amount = 1.00;
                change = money - amount;
                break;
            case "5":
                System.out.println("Water: $2.50");
                amount = 2.50;
                change = money - amount;
                break;
        }

        if (confirmation.equals("no")) {
            System.out.println("Canceled Transaction");
            System.out.printf("Here is your refund: $" + money);
            return;
        }
        if (confirmation.equals("yes")) {
            if (money < amount) {
                System.out.println("You have not inserted enough money");
                System.out.println("Canceled Transaction");
            }
            else {
                System.out.printf("Here is your change: $%,.2f\n", change);
                System.out.println("Good snack choice");  
            }
        }  

    }
}