public class Couple {
    private Person bride;
    private Person groom;

    // Constructor
    public Couple(Person bride, Person groom) {
        this.bride = bride;
        this.groom = groom;
    }

    // Get methods
    public Person getBride() {
        return bride;
    }

    public Person getGroom() {
        return groom;
    }
}

