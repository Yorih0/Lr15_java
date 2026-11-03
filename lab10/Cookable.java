public interface Cookable {
    void cook();
    int getCookingTime();
    
    static void printCookingTip() {
        System.out.println("Cледите за временем");
    }
}