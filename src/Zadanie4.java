public class Zadanie4 {
    public static void main(String[] args) {
        int sumaTatarkiewicz = 0;
        for (int i = 0; i <= 100; i = i + 2){
            sumaTatarkiewicz = sumaTatarkiewicz + i;
        }
        System.out.println("Suma liczb parzystych w przedziale od 1 do 100 = " + sumaTatarkiewicz);
    }
}
