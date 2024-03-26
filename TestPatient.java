import java.util.Scanner;

public class TestPatient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Patient patientWithDefaults = new Patient();
        System.out.println("Patient with default values: " + patientWithDefaults);

        System.out.print("Enter Patient ID: ");
        int id = scanner.nextInt();
        System.out.print("Enter Patient age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Enter blood type (O, A, B, AB): ");
        String bloodType = scanner.nextLine();
        System.out.print("Enter Rh factor (+ or -): ");
        char rhFactor = scanner.next().charAt(0);

        Patient patientWithUserValues = new Patient(id, age, bloodType, rhFactor);
        System.out.println("Patient with user values: " + patientWithUserValues);

        Patient patientWithUserAndDefaultBloodData = new Patient(id, age, "O", '+');
        System.out.println("Patient with user data but default BloodData: " + patientWithUserAndDefaultBloodData);

        scanner.close();
    }
}
