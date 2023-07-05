// Домашнее задание к семинару №1 (Соколов Никита)
// 1) Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

import java.util.Random;

public class DZ_1_1 {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("Выбор метода с ошибкой наугад (из 3 вариантов)");
        switch (random.nextInt(3)) {
            case 0:
                System.out.println("Метод 1 - деление на ноль");
                System.out.println(methodDivision(2, 0));
                break;
            case 1:
                System.out.println("Метод 2 - выход за границы массива");
                System.out.println(methodValue(new int[] { 1, 2, 3, 4 }, 5));
                break;
            default:
                System.out.println("Метод 3 - сумма цифр в строке");
                System.out.println(methodCountingNum("123фых"));
                break;
        }
    }

    // метод деления A на B
    static int methodDivision(int a, int b) {
        return a / b;
    }

    // метод возвращения значения массива по индексу
    static int methodValue(int[] arr, int index) {
        return arr[index];
    }

    // метод подсчета суммы цифр в строке
    static int methodCountingNum(String str) {
        Integer res = 0;
        for (int i = 0; i < str.length(); i++) {
            String c = str.substring(i, i + 1);
            res += Integer.parseInt(c);
        }
        return res;
    }
}