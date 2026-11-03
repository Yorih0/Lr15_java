import java.util.ArrayList;
import java.util.List;

public class Team {
    private final List<Athlete> athletes = new ArrayList<>();

    public void add(Athlete athlete) {
        athletes.add(athlete);
    }

    public Athlete findByName(String name) throws AthleteNotFoundException {
        for (Athlete a : athletes) {
            if (a.getName().equalsIgnoreCase(name)) {
                return a;
            }
        }
        throw new AthleteNotFoundException("Спортсмен не найден: " + name, name);
    }

    public void printAll() {
        System.out.println("Сборная (" + athletes.size() + " чел.)");
        athletes.forEach(System.out::println);
    }

    public List<Athlete> getAthletes() {
        return athletes;
    }
}