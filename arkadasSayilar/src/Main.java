public class Main {

    public static void main(String[] args) {

        int number = 220;
        int number2= 284;

        int arkSayi = 0;
        int arkSayi2 = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                arkSayi += i;
            }
        }

        for (int i = 1; i < number2; i++) {
            if (number2 % i == 0) {
                arkSayi2 += i;
            }
        }

        if (arkSayi == number2 && arkSayi2 == number) {
            System.out.println("Bu iki sayi arkadaştır.");
        } else {
            System.out.println("Bu iki sayi arkadaş değildir.");
        }

    }
}
