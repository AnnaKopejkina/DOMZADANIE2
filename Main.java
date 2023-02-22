public class Main {

    // задание полей
    static int Teleskope = 14000;
    static int account = 1000;
    static int stip = 2500;
    static int month = 0;
    static double percent = 5;
    static double procentMonth = 5.0 / 12.0;

    public static void main(String[] args) {

        while (Teleskope > account) {
            month = month + 1;
            account = (int) (account + (account * procentMonth) / 100 + stip);
        }
        System.out.println("нужно " + month + " месяцев" );
        System.out.println("Осталось " + (account - Teleskope) + " монет ");
    }

}
