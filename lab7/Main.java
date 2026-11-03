class Main {
    public static void main(String[] args) {
        
        University uni1 = new University("БГУ", 25000, 18);
        University uni2 = new University("БНТУ", 18000, 12);
        University uni3 = new University("БГУИР", 15000, 9);

        System.out.println(uni1);
        System.out.println(uni2);
        System.out.println(uni3);

        System.out.println(University.getAverageStudents());

        University.print(uni1);
    }
}
