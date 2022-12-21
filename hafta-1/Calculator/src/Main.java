import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int wallet = 5000, operation, amount;

        while(true) {

            System.out.println("1. Bakiye öğrenmek için tuşlayınız" + '\n' + "2. Para yatırmak için tuşlayınız" + '\n' +
                "3. Para çekmek için tuşlayınız" + '\n' + "4. Hesaptan çıkmak için tuşlayınız");

            System.out.print("Yapmak istediğiniz işlemin numarasını giriniz: ");
            operation = s.nextInt();

            switch (operation) {
                case 1:
                    System.out.println("Bakiye " + wallet + " TL");
                    break;

                case 2:
                    System.out.print("Yatırmak istediğiniz miktarı giriniz: ");
                    amount = s.nextInt();
                    wallet += amount;

                    System.out.println("Bakiye " + wallet + " TL");
                    break;

                case 3:
                    System.out.print("Çekmek istediğiniz miktarı giriniz: ");
                    amount = s.nextInt();
                    if (amount > wallet) {
                        System.out.println("Yeterli bakiyeniz yoktur.");
                    } else {
                        wallet -= amount;
                        System.out.println("Bakiye " + wallet + " TL");
                    }
                    break;

                case 4:
                    System.out.println("Hesaptan çıkış yapıldı. İyi günler.");
                    System.exit(0);

                default:
                    System.out.println("Geçersiz işlem!");
            }
        }
    }
}
