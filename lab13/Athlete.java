public class Athlete {
    private String name;
    private String sport;
    private int age;
    private int medals;
    private double rating;

    public Athlete(String name, String sport, int age, int medals, double rating) throws InvalidAthleteDataException {
        setName(name);
        setSport(sport);
        setAge(age);
        setMedals(medals);
        setRating(rating);
    }

    public void addMedal() throws MedalUpdateException {
        if (medals >= 100) {
            throw new MedalUpdateException("Невозможно добавить медаль: достигнут максимум (100)", medals);
        }
        medals++;
    }

    public void updateRating(double newRating) throws InvalidAthleteDataException {
        setRating(newRating);
    }

    public void setName(String name) throws InvalidAthleteDataException {
        if (name == null || name.isBlank()) {
            throw new InvalidAthleteDataException("Имя спортсмена не может быть пустым");
        }
        this.name = name;
    }

    public void setSport(String sport) throws InvalidAthleteDataException {
        if (sport == null || sport.isBlank()) {
            throw new InvalidAthleteDataException("Вид спорта не может быть пустым");
        }
        this.sport = sport;
    }

    public void setAge(int age) throws InvalidAthleteDataException {
        if (age < 5 || age > 80) {
            throw new InvalidAthleteDataException("Возраст должен быть от 5 до 80 лет, получено: " + age);
        }
        this.age = age;
    }

    public void setMedals(int medals) throws InvalidAthleteDataException {
        if (medals < 0) {
            throw new InvalidAthleteDataException("Количество медалей не может быть отрицательным: " + medals);
        }
        this.medals = medals;
    }

    public void setRating(double rating) throws InvalidAthleteDataException {
        if (rating < 0 || rating > 10) {
            throw new InvalidAthleteDataException("Рейтинг должен быть в диапазоне 0..10, получено: " + rating);
        }
        this.rating = rating;
    }

    public String getName() { return name; }
    public String getSport() { return sport; }
    public int getAge() { return age; }
    public int getMedals() { return medals; }
    public double getRating() { return rating; }

    @Override
    public String toString() {
        return String.format("Athlete{name='%s', sport='%s', age=%d, medals=%d, rating=%.2f}",name, sport, age, medals, rating);
    }
}