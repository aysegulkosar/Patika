 import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
    int matematik, fizik, kimya, biyoloji, geometri;

    Scanner inp = new Scanner(System.in);

    System.out.print( "Matematik Notunuz : ");
    matematik = inp.nextInt();

    System.out.print( "Fizik Notunuz : ");
    fizik = inp.nextInt();

    System.out.print( " Kimya Notunuz : ");
    kimya = inp.nextInt();

    System.out.print( "Biyoloji Notunuz : ");
    biyoloji = inp.nextInt();

    System.out.print( "Geometri Notunuz : ");
    geometri = inp.nextInt();

    int toplam = (matematik + fizik + kimya + biyoloji + geometri);
    double sonuc = toplam / 5.0 ;

    System.out.println(sonuc);

    String str = sonuc < 60 ? "Kaldı" : "Geçti";

    System.out.println(str);








    }
}