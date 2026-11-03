public class Main {
    public static void main(String[] args) {
        Plant p = new Plant("Поддорожник", 30, "Трава");
        Tree oak = new Tree("Дуб", 500, 40);
        Flower rose = new Flower("Роза", 25, "красный");

        System.out.println(p.water());
        System.out.println(p.water(2));
        System.out.println(p.water("утром"));
        System.out.println(oak.water(10, "весной"));
        System.out.println(rose.water("углем", 1));
    }
}