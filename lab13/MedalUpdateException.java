public class MedalUpdateException extends Exception {
    private final int currentMedals;

    public MedalUpdateException(String message, int currentMedals) {
        super(message);
        this.currentMedals = currentMedals;
    }

    public int getCurrentMedals() {
        return currentMedals;
    }
}