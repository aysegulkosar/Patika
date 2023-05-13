import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklık Giriniz : ");
        heat = input.nextInt();

        if (heat < 5) {
            System.out.print("Kayak Yapabilirsiniz.");
        } else if (heat >= 5 && heat<= 25) {
            if (heat <= 15) {
                System.out.println("Sinemaya Gidebilirsiniz.");
            }
            if (heat >= 15) {
                System.out.println("Pikniğe Gidebilirsiniz.");
            }
        } else if (heat > 25) {
                System.out.println("Yüzmeye gidebilirsiniz.");
          }
    }
}