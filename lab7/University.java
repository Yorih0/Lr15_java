public class University {

    private String name;
    private int studentsCount;
    private int faculties;

    private static int totalUniversities = 0;
    private static int totalStudents = 0;

    public University(String n, int sc, int f) {
        name = n;
        studentsCount = sc;
        faculties = f;

        totalUniversities++;
        totalStudents += studentsCount;
    }

    public static double getAverageStudents() {
        if (totalUniversities == 0) {
            return 0;
        }
        return (double) totalStudents / totalUniversities;
    }

    @Override
    public String toString() {
        return "Университет: " + name + " | Студентов: " + studentsCount + " | Факультетов: " + faculties;
    }

    public static void print(University a){
        System.out.println(totalUniversities);
        System.out.println(a.name);
    }
}