import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Введите число для нахождения пар чисел: ");
        int value = new Scanner(System.in).nextInt();
        for (int i = 1; i <= value; i++) {
            for (int j = 1; j <= value; j++) {
                if (i * j == value) System.out.println(i + "*" + j);
            }
        }
    }
}