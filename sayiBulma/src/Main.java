public class Main {

    public static void main(String[] args) {

        int[] sayilar = {1,2,5,7,9,0};
        int aranacakSAyi = 5;

        for (int ara : sayilar) {
            if (aranacakSAyi == ara) {
                System.out.println("Aranan Sayı Bulundu " + aranacakSAyi);
                break;
            }
        }
    }
}
