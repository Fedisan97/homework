import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner gg = new Scanner(System.in);
 

        // вход данных
        System.out.println("Номер строки");
        int x1 = gg.nextInt();
        while (x1 < 0 | x1 > 8) {
            System.out.println("Вы ввели неверное значение. Попробуйте еще раз.");
            System.out.print("Введите число от 1 до 8: ");
            x1 = gg.nextInt();
        }
        System.out.println("Номер столбца");
        int y1 = gg.nextInt();
        while (y1 < 0 | y1 > 8) {
            System.out.println("Вы ввели неверное значение. Попробуйте еще раз.");
            System.out.print("Введите число от 1 до 8: ");
            y1 = gg.nextInt();
        }
        System.out.println("Укажите номер строки куда хотите походить");
        int x2 = gg.nextInt();
        while (x2 < 0 | x2 > 8) {
            System.out.println("Вы ввели неверное значение. Попробуйте еще раз.");
            System.out.print("Введите число от 1 до 8: ");
            x2 = gg.nextInt();
        }
        System.out.println("Укажите номер столбца куда хотите походить");
        int y2 = gg.nextInt();
        while (y2 < 0 | y2 > 8) {
            System.out.println("Вы ввели неверное значение. Попробуйте еще раз.");
            System.out.print("Введите число от 1 до 8: ");
            y2 = gg.nextInt();
        }

        if ((x1 == x2) ||
                (y1 == y2 )||
                (Math.abs(x1 - x2) == Math.abs(y1 - y2))) {
            System.out.println("Да");
        } else
            System.out.println("Нет");




    }


}
