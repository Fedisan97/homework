import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner gg = new Scanner(System.in);
        System.out.println("Сторона А");
        int a = gg.nextInt();
        System.out.println("Сторона B");
        int b = gg.nextInt();
        System.out.println("Стророна С");
        int c = gg.nextInt();

        if (a <= 0 || b <= 0 || c <= 0)
        {
            System.out.println("UNDEFINED");
            return;
        }
        if (( a + b > c)  && ( a + c > b) && ( b + c > a)) {
          double hh =Math.sqrt((a  * a )+ (b * b));
          if (Math.abs(c - hh )<0.0001 ) {
              System.out.println("Да");
          } else {
              System.out.println("Нет");
          }
          } else  {
              System.out.println("UNDEFINED");
            }

        }


    }
