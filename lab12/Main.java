import java.util.LinkedHashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        // main1();
        main2();
    }

    public static void main1() {
        Map<Integer, Athlete> athletes = new LinkedHashMap<>();

        athletes.put(1, new Footballer("Лионель", 1, 5, 30));
        athletes.put(2, new Footballer("Криштиану", 2, 6, 28));
        athletes.put(3, new Footballer("Килиан", 3, 2, 22));

        athletes.put(4, new Basketballer("Леброн", 4, 4, 40));
        athletes.put(5, new Basketballer("Стефен", 5, 3, 35));
        athletes.put(6, new Basketballer("Кевин", 6, 2, 31));

        athletes.put(7, new Swimmer("Майкл", 7, 8, 7));
        athletes.put(8, new Swimmer("Кэти", 8, 4, 5));

        System.out.println("Map");
        for (Map.Entry<Integer, Athlete> entry : athletes.entrySet()) {
            System.out.println("Ключ: " + entry.getKey() + "значение" + entry.getValue());
        }

        System.out.println("");
        for(Integer key : athletes.keySet()){
            Athlete t = athletes.get(key);
            System.out.println("Ключ = { "+key+" }");
            System.out.println("Значение = { " + t + " }");
        }
    }

    public static void main2() {
        List<Car> cars = new ArrayList<>(List.of(
            new Car(1, "Toyota", "Camry",   4.5, List.of(5, 4, 5)),
            new Car(2, "BMW",    "X5",      4.0, List.of(4, 4, 4)),
            new Car(3, "Audi",   "A4",      3.5, List.of(3, 4, 3)),
            new Car(4, "Ford",   "Focus 2 st",   2.5, List.of(2, 3, 2)),
            new Car(5, "Audi",   "Q7",      4.8, List.of(5, 5, 4)),
            new Car(6, "BMW",    "M3",      5.0, List.of(5, 5, 5)),
            new Car(7, "Lada",   "Vesta",   1.5, List.of(1, 2, 1)),  
            new Car(8, "Honda",  "Civic",   3.8, List.of(4, 3, 4)),
            new Car(9, "Audi",   "A6",      4.0, List.of(5, 4, 4)),
            new Car(10, "Toyota","Corolla", 3.0, List.of(3, 3, 3))
        ));
        printCars(cars , 0);

        cars.removeIf(t -> t.getAverageReview() < 3);
        printCars(cars , 0);

        for(Car t : cars){
            if(t.getAverageReview() >= 4){
                t.expertReviews.add(5);
            }
        }
        printCars(cars , 0);

        cars=sortCar(cars);
        printCars(cars,0);

        System.out.println("52");
        PrintIterator(cars);
    }

    public static void printCars(List<Car> cars, int rank){
        System.out.println("Рейтинг");
        for(Car t : cars){
            if(t.getAverageReview() >= rank){
                System.out.println(t);
            }
        }
    }
    public static List<Car> sortCar(List<Car> cars) {
        System.out.println("Сортировка");
        cars.sort((x, y) -> {
            int cmp = Double.compare(y.getAverageReview(), x.getAverageReview());
            if (cmp != 0) {
                return cmp;
            }
            return x.brand.compareToIgnoreCase(y.brand);
        });
        return cars;
    }
    public static void PrintIterator(List<Car>cars){
        Iterator<Car> it = cars.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}