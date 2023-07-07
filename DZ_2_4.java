// Домашнее задание к семинару №2 (Соколов Никита)
// 4) Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

import java.util.Scanner;

public class DZ_2_4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in,"Cp866");
        System.out.println();
        System.out.println("Для выхода из программы введите: exit");
        String stroka = "";

        do {
            System.out.print("Введите любой текст (пустые строки вводить нельзя!)\nВвод: ");
            stroka = scanner.nextLine();
            try{
                System.out.println("Вы ввели строку длиной: " + StrokaLength(stroka) + "\n");
            } catch (EmptyException ex){
                System.out.println(ex.getMessage());
            }
            
        } while (!stroka.equals("exit"));

        System.out.println("\nПрограмма завершена");
        scanner.close();
    }

    static int StrokaLength (String stroka) throws EmptyException{
        if(stroka.length()<1) throw new EmptyException(" >> Ошибка! Введена пустая строка!\n");
        return stroka.length();
    }
}

class EmptyException extends Exception {
    public EmptyException(String message) {
        super(message);
    }
}