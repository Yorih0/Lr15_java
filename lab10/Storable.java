public interface Storable {
    void store();
    String getExpirationDate();
    
    static void printStorageTip() {
        System.out.println("Холодильник !??!");
    }
}