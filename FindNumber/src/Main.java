
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int total = 0;

        while (true) {
            int number = random.nextInt(500);
            if (number > 49 && number < 101) {
                total++;
                System.out.print(number + " sayısı " + total + ". seferde bulundu.");
                break;
            }
            total++;
        }
    }
}