import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Totp totp = new Totp();
        Scanner sc = new Scanner(System.in);
        String yourEmail = sc.nextLine();
        String secret = totp.generateSecret(yourEmail);
    
        System.out.println("your secret code : " + secret);
        System.out.println("your QR url : " + totp.getDataUrl());

        System.out.println("Input Generated Code : ");
        String verifyCode = sc.nextLine();
        System.out.println("result : " + totp.verifyQR(verifyCode));
    }
    
}
