import java.util.Scanner;

/*
1. Пишем алгоритм поиска нужного числа последовательности Фибоначчи.
2. Считаем, что 1 и 2 значения последовательности равны 1.
3. Искать будем по формуле On
=On-1+On-2 что предполагает использовать
рекурсивного алгоритма.
 */

public class Ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); // количество граней
        scan.close();
        System.out.println(getFibonacciByIndex(n));
    }

    public static int getFibonacciByIndex(int index) {
        if (index == 1 || index == 2) {
            return 1;
        }
        return getFibonacciByIndex(index - 1) + getFibonacciByIndex(index - 2);
    }
}
