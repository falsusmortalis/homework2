public class Main {
    public static void main(String[] args) {

        int ticket = 205; // стоимость билета
        int mile = 20; // мили по условию

        if (ticket >= 20) {
            int bonus = ticket / mile;
            System.out.println("Вам начислены мили за покупку билета: " + bonus);

        } else {
            System.out.println("Вам начислены мили за покупку билета: 0");
        }
    }
}
