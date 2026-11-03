public class Main {
    public static void main(String[] args) {
        Team team = new Team();

        System.out.println(" 1. Создание спортсменов ");
        createAndAdd(team, "Иван", "Плавание", 22, 100, 8.5);
        createAndAdd(team, "Мария", "Гимнастика", 19, 7, 9.2);
        createAndAdd(team, "Пётр", "Бег", 27, 3, 7.1);

        createAndAdd(team, "Ошибка1", "Бег", 5, 0, 5.0);
        createAndAdd(team, "Ошибка2", "Бег", 30, -1, 5.0);
        createAndAdd(team, "", "Бег", 30, 1, 5.0);

        System.out.println();
        team.printAll();

        System.out.println("\n 2. Операции обновления ");
        try {
            Athlete ivan = team.findByName("Иван");
            ivan.addMedal();
            System.out.println("Иван получил медаль -> " + ivan.getMedals());
            ivan.addMedal();

            ivan.updateRating(9.5);
            System.out.println("Рейтинг Ивана обновлён -> " + ivan.getRating());

            ivan.updateRating(15);
        } catch (AthleteNotFoundException e) {
            System.out.println("Ошибка поиска: " + e.getMessage());
        } catch (MedalUpdateException e) {
            System.err.println("Ошибка медали: " + e.getMessage() + " (текущее кол-во: " + e.getCurrentMedals() + ")");
        } catch (InvalidAthleteDataException e) {
            System.out.println("Ошибка данных: " + e.getMessage());
        }

        System.out.println("\n 3. Поиск несуществующего спортсмена ");
        try {
            team.findByName("Неизвестный");
        } catch (AthleteNotFoundException e) {
            System.out.println("Ошибка: " + e.getMessage() + " (искали: " + e.getAthleteName() + ")");
        }

        System.out.println("\n 4. finally ");
        try {
            Athlete a = team.findByName("Мария");
            a.updateRating(-1);
        } catch (AthleteNotFoundException | InvalidAthleteDataException e) {
            System.out.println("Перехвачено: " + e.getMessage());
        } finally {
            System.out.println("Блок finally выполнен всегда");
        }

        System.out.println("\n Итоговое состояние сборной ");
        team.printAll();
    }

    private static void createAndAdd(Team team, String name, String sport,int age, int medals, double rating) {
        try {
            Athlete a = new Athlete(name, sport, age, medals, rating);
            team.add(a);
            System.out.println("Добавлен: " + a);
        } catch (InvalidAthleteDataException e) {
            System.out.println("Не удалось создать (" + name + "): " + e.getMessage());
        }
    }
}