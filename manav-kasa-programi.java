import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        double a = 2.14, e = 3.7, d = 1.11, m = 0.95, p = 5.0;
        double armut, elma, domates, muz, patlican, toplamArmut, toplamElma, toplamMuz, toplamPatlican, toplamDomates, toplamKg;

        Scanner input = new Scanner (System.in);
        System.out.print("Armut Kaç Kilo? ");
        armut = input.nextDouble();

        System.out.print("Elma Kaç Kilo? ");
        elma = input.nextDouble();

        System.out.print("Domates Kaç Kilo? ");
        domates = input.nextDouble();

        System.out.print("Muz Kaç Kilo? ");
        muz = input.nextDouble();

        System.out.print("Patlican Kaç Kilo? ");
        patlican = input.nextDouble();


        toplamArmut = a * armut;
        toplamElma = e * elma;
        toplamDomates = d * domates;
        toplamMuz = m * muz;
        toplamPatlican = p * patlican;
        toplamKg = toplamArmut + toplamDomates + toplamElma + toplamMuz + toplamPatlican;

        System.out.print("Toplam Tutar : " + toplamKg);











    }
}