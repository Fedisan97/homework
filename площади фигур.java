import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1-прямоугольник, 2-круг, 3-треугольник");
        System.out.print("Выберите фигуру: ");
        String figure = scanner.nextLine();
        switch (figure) {
            case "1":

                System.out.println("Длины сторон прямоугольника:");
                System.out.print("a = ");
                double a = scanner.nextDouble();
                System.out.print("b = ");
                double b = scanner.nextDouble();
                System.out.print("Площадь:" + a * b);
                break;


            case "2":

                System.out.print("Радиус круга R = ");
                double r = scanner.nextDouble();
                System.out.print("Площадь:" + Math.PI * r * r);
                break;



            case "3":

                System.out.println("Длины сторон треугольника:");
                System.out.print("a = ");
                double sideA = scanner.nextDouble();
                System.out.print("b = ");
                double sideB = scanner.nextDouble();
                System.out.print("c = ");
                double sideC = scanner.nextDouble();
                double p = (sideA + sideB + sideC) / 2;
                double s = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
                System.out.print("Площадь:" + s);
                break;
             
                

        
            
            
        }

        scanner.close();
    }
}
