// Домашнее задание к семинару №1 (Соколов Никита)
// 3) (Дополнительно) Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий
//    новый массив, каждый элемент которого равен частному (целочисленное деление) элементов двух входящих массивов
//    в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.
//    Внимание! значение ячейки будет от 0 до 10, длина массива 4 или 5 (рандом)

import java.util.Random;

public class DZ_1_3 {
    static Random random = new Random();
    public static void main(String[] args) {

        System.out.println("Массив №1:");   // создаем массив №1 (длина случайная - от 4 до 5)
        int[] arr1 = arrCreateRandom(4 + random.nextInt(2));
        arrPrint(arr1);

        System.out.println("Массив №2:");   // создаем массив №2 (длина случайная - от 4 до 5)
        int[] arr2 = arrCreateRandom(4 + random.nextInt(2));
        arrPrint(arr2);

        // выполняем метод разницы массивов
        arrDivision(arr1, arr2);

    }

    // метод создания массива длиной len заполненного случайными числами от 0 до 9
    static int[] arrCreateRandom(int len){
        int arr[] = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = random.nextInt(10);
        }

        return arr;
    }

    // метод печати массива
    static void arrPrint(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d\t", arr[i]);
        }
        System.out.println();
    }

    // оснонвой метод создания массива из разницы двух входящих массивов аргументов
    static void arrDivision(int[] arr1, int[] arr2){
            System.out.println("Массив частного элементов массивов №1 и №2:");

            if (arr1.length != arr2.length)
                throw new RuntimeException(" >> Ошибка! Размеры массивов не совпадают");

            int res[] = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                if (arr2[i] == 0)
                    throw new RuntimeException(String.format(" >> Ошибка! Деление на ноль (элемент массива №2 с индексом %d)", i));
                res[i] = arr1[i]/arr2[i];
            }
            arrPrint(res);
    }
}