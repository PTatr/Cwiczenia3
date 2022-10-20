import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        double aNumberTatarkiewicz, bNumberTatarkiewicz, cNumberTatarkiewicz, deltaTatarkiewicz, x1Tatarkiewicz, x2Tatarkiewicz;
        int eventNumberTatarkiewicz = 0;
        System.out.println("Wpisz wartość liczby A:");
        Scanner aTatarkiewicz = new Scanner(System.in);
        aNumberTatarkiewicz = aTatarkiewicz.nextDouble();
        System.out.println("Wpisz wartość liczby B:");
        Scanner bTatarkiewicz = new Scanner(System.in);
        bNumberTatarkiewicz = bTatarkiewicz.nextDouble();
        System.out.println("Wpisz wartość liczby C:");
        Scanner cTatarkiewicz = new Scanner(System.in);
        cNumberTatarkiewicz = cTatarkiewicz.nextDouble();
        if (aNumberTatarkiewicz == 0){
            System.out.println("Nie można obliczyć pierwiastków kiedy wartość A = 0");
        } else {
            deltaTatarkiewicz = bNumberTatarkiewicz * bNumberTatarkiewicz - 4 * aNumberTatarkiewicz * cNumberTatarkiewicz;
            if (deltaTatarkiewicz < 0) eventNumberTatarkiewicz = 0;
            if (deltaTatarkiewicz > 0) eventNumberTatarkiewicz = 1;
            if (deltaTatarkiewicz == 0) eventNumberTatarkiewicz = 2;
            System.out.println("Delta = " + deltaTatarkiewicz);

            switch (eventNumberTatarkiewicz){
                case 0:
                    System.out.println("Delta jest ujemna więc funkcja nie ma miejsc zerowych");
                    break;
                case 1:
                    x1Tatarkiewicz = (-bNumberTatarkiewicz - Math.sqrt(deltaTatarkiewicz)) / (2 * aNumberTatarkiewicz);
                    x2Tatarkiewicz = (-bNumberTatarkiewicz + Math.sqrt(deltaTatarkiewicz)) / (2 * aNumberTatarkiewicz);
                    System.out.println("Dla A = " + aNumberTatarkiewicz + ", B = " + bNumberTatarkiewicz + ", C = " + cNumberTatarkiewicz);
                    System.out.printf("Pierwszy pierwiastek = %.2f, Drugi pierwiastek = %.2f", x1Tatarkiewicz, x2Tatarkiewicz);
                    break;
                case 2:
                    x1Tatarkiewicz = -bNumberTatarkiewicz / (2 * aNumberTatarkiewicz);
                    System.out.println("Dla A = " + aNumberTatarkiewicz + ", B = " + bNumberTatarkiewicz + ", C = " + cNumberTatarkiewicz);
                    System.out.printf("Jest jeden podwójny pierwiastek = %.2f", x1Tatarkiewicz);
                    break;
            }
        }
    }
}
