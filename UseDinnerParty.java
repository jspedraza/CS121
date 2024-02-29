import java.util.Scanner;

public class UseDinnerParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DinnerParty dinnerParty = new DinnerParty(); // Create a DinnerParty object

        System.out.print("Enter number of guests for the party >> ");
        int numGuests = scanner.nextInt();
        dinnerParty.setGuests(numGuests); // Set the number of guests for the Party object

        System.out.println("The party has " + dinnerParty.getGuests() + " guests");
        dinnerParty.displayInvitation();

        System.out.print("Enter number of guests for the dinner party >> ");
        int dinnerNumGuests = scanner.nextInt();
        dinnerParty.setGuests(dinnerNumGuests); // Set the number of guests for the DinnerParty

        System.out.print("Enter the menu option -- 1 for Chicken or 2 for Vegies >> ");
        int menuChoice = scanner.nextInt();
        dinnerParty.setDinnerChoice(menuChoice); // Set the dinner choice

        System.out.println("The dinner party has " + dinnerParty.getGuests() + " guests");
        System.out.println("Menu option " + dinnerParty.getDinnerChoice() + " will be served");
        dinnerParty.displayInvitation();

        scanner.close();
    }
}

