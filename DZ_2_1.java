// Домашнее задание к семинару №2 (Соколов Никита)
// 1) Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа double), и возвращает
//    введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, вместо этого,
//    необходимо повторно запросить у пользователя ввод данных.

import java.util.Scanner;

public class DZ_2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in,"Cp866");
        System.out.println();
        System.out.println("Для выхода из программы введите: exit");
        String number = "";

        do {
            System.out.println("Введите дробное число:");
            number = scanner.nextLine();
            checkDoubleData(number);
        } while (!number.equals("exit"));

        System.out.println("\nПрограмма завершена");
        scanner.close();
    }

    public static void checkDoubleData (String number){
        if (number.equals("exit")) return;
        try {
            System.out.printf("Вы ввели дробное число: %f\n", parseDouble(number));
            System.out.println();
        } catch (MyDoubleException e) {
            System.out.printf("%s Введена строка: %s\n  >> В зависимости от системных настроек разделителем десятичной части может вступать точка или запятая\n\n", e.getMessage(), e.getValue());
        }
    }

    public static double parseDouble(String value) throws MyDoubleException {
        try {
            return Double.parseDouble(value);
        } catch (NumberFormatException e) {
            throw new MyDoubleException("  >> Ошибка ввода! Неправильный формат данных.", value);
        }
    }
}

abstract class Exception2 extends Exception {
    private final String value;

    public Exception2(String message, String value) {
        super(message);
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

class MyDoubleException extends Exception2 {
    public MyDoubleException(String message, String value) {
        super(message, value);
    }
}