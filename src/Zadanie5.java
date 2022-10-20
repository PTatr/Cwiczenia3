import java.util.Random;

public class Zadanie5 {
    public static void main(String[] args) {
        Random random = new Random();
        int newNumberTatarkiewicz;
        int maxTatarkiewicz = random.nextInt(1,100);;
        int minTatarkiewicz = random.nextInt(1,100);;
        int i = 1;
        while (i < 10){
            newNumberTatarkiewicz = random.nextInt(1,100);
            if (newNumberTatarkiewicz > maxTatarkiewicz){
                maxTatarkiewicz = newNumberTatarkiewicz;
            }
            if (newNumberTatarkiewicz < minTatarkiewicz){
                minTatarkiewicz = newNumberTatarkiewicz;
            }
            i++;
            System.out.println("Kolejne numery = " + newNumberTatarkiewicz);
        }
        System.out.println("Największa liczba = " + maxTatarkiewicz);
        System.out.println("Najmniejsza liczba = " + minTatarkiewicz);
    }
}
