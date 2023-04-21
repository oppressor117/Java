package Homework_1;
import java.util.Scanner;

public class Homework_Task_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите число: ");
        int n = scan.nextInt();

        int triangularNumber = n*(n+1)/2;
        System.out.printf("Треугольное число 1 + 2 + ... + %d = %d%n", n, triangularNumber);

        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.printf("%d! = %d%n", n, factorial);
        scan.close();
    }
}