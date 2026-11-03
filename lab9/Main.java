public class Main {
    public static void main(String[] args) {
        Planet earth = new Planet("Земля", 5.972e24, 12742, 1);
        Planet mars = new Planet("Марс", 6.39e23, 6779, 2);
        Planet jupiter = new Planet("Юпитер", 1.898e27, 139820, 79);

        earth.displayInfo();
        mars.displayInfo();
        jupiter.displayInfo();
        
        Star sun = new Star("Солнце", 1.989e30, 1391000, 5778);
        Star sirius = new Star("Сириус", 4.018e30, 2384000, 9940);
        
        sun.displayInfo();
        sirius.displayInfo();
    }
}