import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        float weightTatarkiewicz, heightTatarkiewicz;
        System.out.println("Podaj swoją wage w kg: ");
        Scanner firstTatarkiewicz = new Scanner(System.in);
        weightTatarkiewicz = firstTatarkiewicz.nextFloat();
        System.out.println("Podaj swój wzrost w cm: ");
        Scanner secondTatarkiewicz = new Scanner(System.in);
        heightTatarkiewicz = secondTatarkiewicz.nextFloat();
        float heightTatarkiewicz2 = heightTatarkiewicz / 100;
        double bmiTatarkiewicz = weightTatarkiewicz / (Math.pow(heightTatarkiewicz2, 2));
        float bmiTatarkiewicz2 = (float)bmiTatarkiewicz;
        System.out.printf("Twój wskaźnik BMI = $%.2f\n", bmiTatarkiewicz2);
        if (bmiTatarkiewicz < 16.00)
            System.out.println("Wygłodzenie");
        else if (bmiTatarkiewicz < 16.99) {
            System.out.println("Wychudzenie");
        } else if (bmiTatarkiewicz < 18.49) {
            System.out.println("Niedowaga");
        } else if (bmiTatarkiewicz < 22.99) {
            System.out.println("Norma niski przedział");
        } else if (bmiTatarkiewicz < 24.99) {
            System.out.println("Norma wysoki przedział");
        } else if (bmiTatarkiewicz < 27.99) {
            System.out.println("Nadwaga niski przedział");
        } else if (bmiTatarkiewicz < 29.99) {
            System.out.println("Nadwaga wysoki przedział");
        } else if (bmiTatarkiewicz < 134.99) {
            System.out.println("Otyłość I stopnia");
        } else if (bmiTatarkiewicz < 39.99) {
            System.out.println("Otyłość II stopnia");
        } else if (bmiTatarkiewicz >= 40.00) {
            System.out.println("Otyłość III stopnia");
        }
    }
}
