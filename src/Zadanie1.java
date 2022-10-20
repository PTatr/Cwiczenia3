import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        float firstNumberTatarkiewicz, secondNumberTatarkiewicz;
        System.out.println("Enter the first number (and press Enter):");
        Scanner firstTatarkiewicz = new Scanner(System.in);
        firstNumberTatarkiewicz = firstTatarkiewicz.nextFloat();
        System.out.println("Enter the second number (and press Enter):");
        Scanner secondTatarkiewicz = new Scanner(System.in);
        secondNumberTatarkiewicz = secondTatarkiewicz.nextFloat();
        System.out.println("You entered two numbers, the fisrt is: " + firstNumberTatarkiewicz +
                " and the second is: " + secondNumberTatarkiewicz);
        float sumTatarkiewicz = firstNumberTatarkiewicz + secondNumberTatarkiewicz;
        float diffTatarkiewicz = firstNumberTatarkiewicz - secondNumberTatarkiewicz;
        float prodTatarkiewicz = firstNumberTatarkiewicz * secondNumberTatarkiewicz;
        float quotTatarkiewicz = firstNumberTatarkiewicz / secondNumberTatarkiewicz;
        System.out.printf("Sum = $%.2f\n", sumTatarkiewicz);
        System.out.printf("Difference = $%.2f\n", diffTatarkiewicz);
        System.out.printf("Product = $%.2f\n", prodTatarkiewicz);
        System.out.printf("Quotient = $%.2f\n", quotTatarkiewicz);

    }
}
