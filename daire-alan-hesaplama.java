import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double pi = 3.14, a, r, alan;

        Scanner input = new Scanner(System.in);
        System.out.print("Yarıçapı giriniz : ");
        r = input.nextDouble();

        System.out.print("Merkez açı ölçüsünüz giriniz : ");
        a = input.nextDouble();

        alan = ( pi * (r * r) * a ) / 360;
        System.out.println("Alan :" + alan);


    }
}