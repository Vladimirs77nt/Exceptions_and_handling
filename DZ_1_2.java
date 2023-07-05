// Домашнее задание к семинару №1 (Соколов Никита)
// 2) Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий
//    новый массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
//    Если длины массивов не равны, необходимо как-то оповестить пользователя.
//    Внимание! значение ячейки будет от 0 до 10, длина массива 4 или 5 (рандом)

import java.util.Random;

public class DZ_1_2 {
    static Random random = new Random();
    public static void main(String[] args) {

        System.out.println("Массив №1:");   // создаем массив №1 (длина случайная - от 4 до 5)
        int[] arr1 = arrCreateRandom(4 + random.nextInt(2));
        arrPrint(arr1);

        System.out.println("Массив №2:");   // создаем массив №2 (длина случайная - от 4 до 5)
        int[] arr2 = arrCreateRandom(4 + random.nextInt(2));
        arrPrint(arr2);

        // выполняем метод разницы массивов
        arrDifferent(arr1, arr2);

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
    static void arrDifferent(int[] arr1, int[] arr2){
        
        // проверка на равенство массивов - если равны, то выполянем метод
        if (arr1.length == arr2.length) {
            System.out.println("Массив разности массивов №1 и №2:");
            int res[] = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                res[i] = arr1[i] - arr2[i];
            }
            arrPrint(res);
        }

        // если массивы не равны - то сообщаем об этом
        else {
            System.out.println(" >> Ошибка!!!");
            if (arr1.length > arr2.length)
                System.out.println("Длина массива №1 больше длины массива №2. Разница массивов не выполнима.");
            if (arr1.length < arr2.length)
                System.out.println("Длина массива №1 меньше длины массива №2. Разница массивов не выполнима.");
        }
    }
}