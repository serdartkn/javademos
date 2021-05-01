public class Main {

    public static void main(String[] args) {

        int number = 30;

        int mükSayi = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                mükSayi += i;
            }
        }
        if (mükSayi == number) {
            System.out.println("Sayı Mükemmeldir.");
        } else {
            System.out.println("Sayı Mükemmel Değildir.");
        }

    }
}
