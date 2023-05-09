import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double m, kg, sonuc;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu metre cinsinden giriniz : ");
        m = input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        kg = input.nextDouble();

        sonuc = (kg / ( m * m ) );
        System.out.print("Vücut Kitle Endeksiniz :" + sonuc);
    }
}