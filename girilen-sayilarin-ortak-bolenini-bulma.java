import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        a = input.nextInt();
        int sayi = 0;
        int toplam = 0;

        for (int i = 0; i <= a; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                toplam += i;
                sayi++;
            }
        }
        System.out.println("Ortalama : " + (toplam/sayi));
    }
}