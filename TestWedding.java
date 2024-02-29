import java.time.LocalDate;
import java.util.Scanner;

public class TestWedding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for bride's details
        System.out.println("Enter bride's first name:");
        String brideFirstName = scanner.nextLine();
        System.out.println("Enter bride's last name:");
        String brideLastName = scanner.nextLine();
        Person bride = new Person(brideFirstName, brideLastName);

        // Prompt for groom's details
        System.out.println("Enter groom's first name:");
        String groomFirstName = scanner.nextLine();
        System.out.println("Enter groom's last name:");
        String groomLastName = scanner.nextLine();
        Person groom = new Person(groomFirstName, groomLastName);

        // Creating Couple object
        Couple couple = new Couple(bride, groom);

        // Wedding details
        System.out.println("Enter wedding date (YYYY-MM-DD):");
        String dateString = scanner.nextLine();
        LocalDate date = LocalDate.parse(dateString);

        System.out.println("Enter wedding location:");
        String location = scanner.nextLine();

        // Creating Wedding object
        Wedding wedding = new Wedding(couple, date, location);

        // Displaying details
        System.out.println("Wedding Details:");
        System.out.println("Bride: " + wedding.getCouple().getBride().getFirstName() + " " + wedding.getCouple().getBride().getLastName());
        System.out.println("Groom: " + wedding.getCouple().getGroom().getFirstName() + " " + wedding.getCouple().getGroom().getLastName());
        System.out.println("Date: " + wedding.getWeddingDate());
        System.out.println("Location: " + wedding.getLocation());

        scanner.close();
    }
}
