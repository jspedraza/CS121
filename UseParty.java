import java.util.Scanner;

public class UseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Party party = new Party(); // Create a Party object

        System.out.print("Enter number of guests for the party >> ");
        int numGuests = scanner.nextInt();
        party.setGuests(numGuests); // Set the number of guests

        System.out.println("The party has " + party.getGuests() + " guests");
        party.displayInvitation(); // Display the invitation

        scanner.close();
    }
}

