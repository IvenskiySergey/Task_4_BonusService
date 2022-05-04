public class Main {

    public static void main(String[] args) {
        BonusService service = new BonusService();
        int bonus = (int) service.calculate(100_000_00,true);
        System.out.println("Сумма бонуса = " + bonus);
    }
}
