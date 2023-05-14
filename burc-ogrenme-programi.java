import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int secenek;
        System.out.println("1 : 21 Mart - 20 Nisan");
        System.out.println("2 : 21 Nisan - 21 Mayıs");
        System.out.println("3 : 22 Mayıs - 22 Haziran");
        System.out.println("4 : 23 Haziran - 22 Temmuz");
        System.out.println("5 : 23 Temmuz - 22 Ağustos");
        System.out.println("6 : 23 Ağustos - 22 Eylül");
        System.out.println("7 : 23 Eylül - 22 Ekim");
        System.out.println("8 : 23 Ekim - 22 Kasım");
        System.out.println("9 : 23 Kasım - 21 Aralık");
        System.out.println("10 : 22 Aralık - 21 Ocak");
        System.out.println("11 : 22 Ocak - 19 Şubat");
        System.out.println("12 : 20 Şubat - 20 Mart");
        System.out.print("Doğduğunuz aralığı seçiniz: ");
        secenek =input.nextInt();

        System.out.print("Burcunuz: ");
        if (secenek==1) {
            System.out.print("Koç");
        }else if (secenek==2) {
            System.out.print("Boğa");
        }else if (secenek==3) {
            System.out.print("İkizler");
        }else if (secenek==4) {
            System.out.print("Yengeç");
        }else if (secenek==5) {
            System.out.print("Aslan");
        }else if (secenek==6) {
            System.out.print("Başak");
        }else if (secenek==7) {
            System.out.print("Terazi");
        }else if (secenek==8) {
            System.out.print("Akrep");
        } else if (secenek==9) {
            System.out.print("Yay");
        }else if (secenek==10) {
            System.out.print("Oğlak");
        }else if (secenek==11) {
            System.out.print("Kova");
        }else if (secenek==12) {
            System.out.print("Balık");
        }
    }
}