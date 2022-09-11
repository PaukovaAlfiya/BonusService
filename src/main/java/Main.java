public class Main {
    public static void main (String[] args) {
        BonusService service = new BonusService();
        long bonus = service.calculate (16667, true);
        System.out.println(bonus);
    }
}
