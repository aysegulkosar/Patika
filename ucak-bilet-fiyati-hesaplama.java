import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int age, type;
        double price, km;

        Scanner input = new Scanner(System.in);
        System.out.print("Km bilgisi giriniz: ");
        km = input.nextDouble();

        System.out.print("Yaşınızı giriniz: ");
        age = input.nextInt();

        System.out.print("Yolculuk türünü giriniz. 1-Tek Yön 2-Gidiş/Dönüş : ");
        type = input.nextInt();

        if (km > 0 && age > 0 && (type == 1 || type == 2)) {
            price = 0.10 * km;
            if (age < 12) {
                price = price * 0.5;
            } else if (age < 25) {
                price = price * 0.9;
            } else if (age > 65) {
                price = price * 0.7;
            }
            if (type == 2) {
                price = price * 0.8;
                price = price * 2;
            }
            System.out.println("Toplam ücret : " + price + "TL");
        }  else {
            System.out.println("Hatalı veri girdiniz!");
            }

    }
}