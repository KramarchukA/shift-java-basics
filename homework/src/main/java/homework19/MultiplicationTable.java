package homework19;

import java.util.Scanner;

public class MultiplicationTable {
    static Scanner scanner = new Scanner(System.in);

    private static int scannedInt() {
        while (true) {
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Ошибка! Введите одно целое число.");
                scanner.next();
            }

        }
    };

    private static void printNumber(int maxWeidth, int number){
        int weidthOfNumber = String.valueOf(number).length();
        System.out.print(" ".repeat(maxWeidth - weidthOfNumber) + number + "\t");
    }
    public static void multiplicationTable() {
        System.out.print("Введите первое число: ");
        int a = scannedInt();

        System.out.print("Введите второе число: ");
        int b = scannedInt();
        while (b < a) {
            System.out.println("Ошибка! Введите число > "+a);
            b = scannedInt();
        }

        System.out.print("Введите шаг: ");
        int i = scannedInt();
        while (i <= 0) {
            System.out.println("Ошибка! Введите число > 0");
            i = scannedInt();
        }

        int cellWeidth = String.valueOf(b*b).length();

        System.out.print("\t");
        for (int j = a; j <= b; j += i) printNumber(cellWeidth, j);

        System.out.println();
        for (int j = a; j <= b; j += i) {
            printNumber(cellWeidth, j);
            for (int k = a; k <= b; k += i){
                printNumber(cellWeidth, j*k);
            }
            System.out.println();
        }
    }
}
