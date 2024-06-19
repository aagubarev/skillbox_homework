import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Введите число для нахождения факториала: ");
        int value = new Scanner(System.in).nextInt();
        int result = 1;
        String resultStr = "";
        for (int i = 1; i <= value; i++) {
            result *= i;
            resultStr += (i == value) ? (i) : (i) + " x ";
        }
        System.out.printf("%d! = %s = %d ", value, resultStr, result);
    }
}