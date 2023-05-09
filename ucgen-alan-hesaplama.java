import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // Değişkenleri tanımladım.
        int a, b, c;
        int cevre, alan, u;


        Scanner input = new Scanner(System.in);
        System.out.print("1.kenarı giriniz : ");
        a = input.nextInt();

        System.out.print("2.Kenarı Giriniz : ");
        b = input.nextInt();

       System.out.print("3.kenarı Giriniz : ");
        c = input.nextInt();

        u = (a + b + c) / 2;
        cevre = 2 * u;
        alan = u * (u - a) * (u - b) * (u - c);


        System.out.println("Çevre : " + cevre);
        System.out.println("Alan : " + alan);
        System.out.println("U Değeri : " + u);













    }
}