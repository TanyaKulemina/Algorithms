import java.util.Scanner;

/*
 * Необходимо написать алгоритм, считающий сумму всех чисел от 1 до N. Согласно свойствам линейной сложности,
 * количество итераций цикла будет линейно изменяться относительно изменения размера N.
 */

public class Ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число:");
        int n = scan.nextInt();
        scan.close();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
