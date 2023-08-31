import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Написать алгоритм поиска простых чисел (делятся только на себя и на 1) в диапазоне от 1 до N. 
В алгоритме будет использоваться вложенный for, что явно говорит о квадратичной сложности */

public class Ex2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = scan.nextInt();
        scan.close();

        List<Integer> res = new ArrayList<Integer>();

        simpleNumbers(number, res);
        System.out.println(res);

    }

    private static void simpleNumbers(int number, List<Integer> res) {
        for (int i = 1; i <= number; i++) {
            if (isTrue(i)) {
                res.add(i);
            }
        }
    }

    private static boolean isTrue(int i) {
        for (int j = 2; j < i; j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }
}
