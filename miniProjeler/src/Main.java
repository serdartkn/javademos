public class Main {

    public static void main(String[] args) {
        int sayi = 1;
        boolean sayiasal = true;
        if (sayi == 1) {
            sayiasal = false;
            System.out.println("Sayı asal değildir.");
            return;
        }
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                sayiasal = false;
            }
        }

        if (sayiasal) {
            System.out.println("Sayı asaldır.");
        }else {
            System.out.println("Sayı asal değildir.");
        }
    }
}
