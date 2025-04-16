import java.util.*;

public class vendingmachine {
    public static double money = 0;
    public static double change = 0;
    public static double amount = 0;
    public static void main(String[] args){

        //list of items
        ArrayList<String> phrases = phrases();

        Scanner scanner = new Scanner(System.in);

        //Prints items
        for (int i = 0; i < phrases.size(); i++){
            System.out.println((i + 1) + ". " + phrases.get(i));
        }

        System.out.println("\nWelcome to the vending machine please pick a snack to buy (enter a number 1-15): ");
    
        int choice = scanner.nextInt();

        System.out.println("How much money would you like to enter into the machine?");
        double money = scanner.nextDouble();

        System.out.println("Type 'yes' to confirm or 'no' to cancel: ");
        String confirmation = scanner.next().toLowerCase();
        System.out.println(phrases.get(choice - 1)); //prints choice

        switch (choice){
            case 1:
                amount = 3.50;
                break;
            case 2:
                amount = 1.00;
                break;
            case 3:
                amount = 2.50;
                break;
            case 4:
                amount = 1.00;
                break;
            case 5:
                amount = 2.50;
                break;
            case 6:
                amount = 3.00;
                break;
            case 7:
                amount = 2.50;
                break;
            case 8:
                amount = 1.50;
                break;
            case 9:
                amount = 1.50;
                break;
            case 10:
                amount = 2.00;
                break;
            case 11:
                amount = 0.50;
                break;
            case 12:
                amount = 3.50;
                break;
            case 13:
                amount = 2.00;
                break;
            case 14:
                amount = 2.00;
                break;
            case 15:
                amount = 1.50;
                break;
        }

        change = money - amount;//calculates money after decision is made

        if (confirmation.equals("no")) {
            System.out.println("Cancelled Transaction");
            System.out.printf("Here is your refund: $%.2f", money);
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

    public static ArrayList<String> phrases(){
        ArrayList<String> phrases = new ArrayList<>();

        phrases.add("Oreos: $3.50");
        phrases.add("Chips: $1.00");
        phrases.add("Coca-cola: $2.50");
        phrases.add("Pepsi: $1.00");
        phrases.add("Water: $2.50");
        phrases.add("Pop Tarts: $3.00");
        phrases.add("Skittles: $2.50");
        phrases.add("Snickers: $1.50");
        phrases.add("Milkway: $1.50");
        phrases.add("M&M's: $2.00");
        phrases.add("Nerds: $0.50");
        phrases.add("Gatorade: $3.50");
        phrases.add("Chips Ahoy: $2.00");
        phrases.add("Mountain Dew: $2.00");
        phrases.add("Doritos: $1.50");
        return phrases;
    }

}

