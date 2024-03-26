import java.util.EnumSet;

public class BloodData {
    public enum BloodType {
        O, A, B, AB;

        public static BloodType fromString(String bloodTypeStr) {
            return EnumSet.allOf(BloodType.class).stream()
                    .filter(bt -> bt.name().equalsIgnoreCase(bloodTypeStr))
                    .findFirst()
                    .orElse(null);
        }
    }

    private BloodType bloodType;
    private char rhFactor;

    public BloodData() {
        this.bloodType = BloodType.O;
        this.rhFactor = '+';
    }

    public BloodData(String bloodType, char rhFactor) {
        this.bloodType = BloodType.fromString(bloodType);
        this.rhFactor = rhFactor;
    }

    public String getBloodType() {
        return bloodType.toString();
    }

    public void setBloodType(String bloodType) {
        this.bloodType = BloodType.fromString(bloodType);
    }

    public char getRhFactor() {
        return rhFactor;
    }

    public void setRhFactor(char rhFactor) {
        this.rhFactor = rhFactor;
    }

    @Override
    public String toString() {
        return "Blood Type: " + bloodType + rhFactor;
    }
}
