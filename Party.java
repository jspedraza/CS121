public class Party {
    private int guests; // Number of guests expected at the party

    public void setGuests(int numGuests) {
        guests = numGuests;
    }

    public int getGuests() {
        return guests;
    }

    public void displayInvitation() {
        System.out.println("Please come to my party!");
    }
}

