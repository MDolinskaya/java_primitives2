public class Main {
    public static void main(String[] args) {
        int startBalance = 250;
        int refill = 1370;

        int total;
        if (refill > 1000) {
            int bonus = refill / 100;
            total = startBalance + refill + bonus;
        } else {
            total = startBalance + refill;
        }
        System.out.println(total);

    }
}