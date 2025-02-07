import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner gg = new Scanner(System.in);



        System.out.print("Введите номер месяца: ");
        int month = gg.nextInt();
        System.out.print("Введите год: ");
        int year = gg
                .nextInt();
        int daysInMonth;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = 30;
                break;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    daysInMonth = 29;
                } else {
                    daysInMonth = 28;
                }
                break;
            default:
                throw new  IllegalArgumentException("Неверный номер месяца");
        }


        System.out.println(daysInMonth);
    }
}

