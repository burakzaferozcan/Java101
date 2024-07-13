import java.util.Scanner;

public class KullaniciGirisiProgrami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username, password, newPassword;
        String correctUsername = "burak";
        String correctPassword = "java";

        System.out.print("Kullanıcı Adınız : ");
        username = input.nextLine();
        System.out.print("Şifreniz : ");
        password = input.nextLine();

        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Başarıyla giriş yaptınız.");
        } else {
            System.out.println("Bilgileriniz yanlış.");
            System.out.print("Şifrenizi sıfırlamak ister misiniz? (E/H): ");
            String resetChoice = input.nextLine();

            if (resetChoice.equalsIgnoreCase("E")) {
                System.out.print("Yeni şifrenizi giriniz: ");
                newPassword = input.nextLine();

                if (newPassword.equals(correctPassword)) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    System.out.println("Şifre oluşturuldu.");
                }
            }
        }
    }
}
