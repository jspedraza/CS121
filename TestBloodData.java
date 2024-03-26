import java.util.Scanner;

public class TestBloodData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BloodData defaultBloodData = new BloodData();
        System.out.println("Default BloodData object created: " + defaultBloodData);

        System.out.print("Enter blood type (O, A, B, AB): ");
        String bloodType = scanner.next();
        System.out.print("Enter Rh factor (+ or -): ");
        char rhFactor = scanner.next().charAt(0);

        BloodData userBloodData = new BloodData(bloodType, rhFactor);
        System.out.println("User BloodData object created: " + userBloodData);

        defaultBloodData.setBloodType(bloodType);
        defaultBloodData.setRhFactor(rhFactor);
        System.out.println("Default BloodData object after updates: " + defaultBloodData);

        scanner.close();
    }
}
