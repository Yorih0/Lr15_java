public class AthleteNotFoundException extends Exception {
    private final String athleteName;

    public AthleteNotFoundException(String message, String athleteName) {
        super(message);
        this.athleteName = athleteName;
    }

    public String getAthleteName() {
        return athleteName;
    }
}