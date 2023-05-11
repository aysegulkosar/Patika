import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username, password, choose, newPassword;

        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı Adınız : ");
        username = input.nextLine();

        System.out.print("Şifreniz : ");
        password = input.nextLine();

        if (username.equals("Aysegul") && password.equals("kosar123")) {
            System.out.println("Giriş Yaptınız.");

        } else {
            System.out.println("Kullanıcı adınız veya şifreniz hatalı.");
            System.out.println("Şifrenizi yenilemek ister misiniz? Evet ise Y Hayır ise N'yi tuşlayınız.");
            choose = input.nextLine();

            switch (choose) {
                case "Y" :
                    System.out.print("Yeni şifre oluşturunuz : ");
                    newPassword = input.nextLine();
                    if (newPassword.equals(password)) {
                        System.out.print("Yeni şifreniz bir önceki şifrenizle aynı olamaz.Yeniden oluştur : ");
                    } else {
                        System.out.print("Şifreniz değiştirildi.");;
                    }
                case "N" :
                    System.out.print("Hesabınıza tekrar giriş yapmayı deneyiniz.");

            }
        }
    }
}