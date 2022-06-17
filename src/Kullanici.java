import java.util.Scanner;

public class Kullanici {
    public static void main(String[] args) {
        String username,password;
        Scanner inp = new Scanner(System.in);

        System.out.println("Kullanıcı Adınız :");
        username = inp.nextLine();
        System.out.println("Şifreniz :");
        password = inp.nextLine();

        if (username.equals("adpjaw") && password.equals("kargalar") ){
            System.out.println("Giriş Yaptınız!");
        }
        else {
            System.out.println("Hatalı Giriş Yaptınız!");

        }




    }
}