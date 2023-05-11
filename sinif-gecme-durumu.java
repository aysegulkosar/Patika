import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int matematik, geometri, biyoloji, kimya, fizik;

        Scanner input = new Scanner(System.in);
         System.out.print("Matematik Notunuz : ");
         matematik = input.nextInt();

         System.out.print("Geometri Notunuz : ");
         geometri = input.nextInt();

         System.out.print("Biyoloji Notunuz : ");
         biyoloji = input.nextInt();

         System.out.print("Kimya Notunuz : ");
         kimya = input.nextInt();

         System.out.print("Fizik Notunuz : ");
         fizik = input.nextInt();

         double average = (matematik + geometri + biyoloji + fizik + kimya) / 5;

         if(average < 55 && average >= 00) {
             System.out.println("Sınıfta Kaldınız.");
         } else if (average >= 55 && average <= 100) {
             System.out.println("Tebrikler, geçtiniz!");
         } else {
             System.out.println("Lütfen puanlara 0 ile 100 arasında bir değer giriniz.");
         }
         System.out.println("Ortalamanız : " + average);
    }
}