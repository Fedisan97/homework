import java.util.Scanner;
public class Main {    public static void main(String[] args) {
    double S1;
    double S2;
    double Drecp;
    double Dpere;
    double cof;
    double Radius1;
    double Radius2;
    final double pi = 3.14;

 
    Scanner in = new Scanner(System.in);
    System.out.println("Написать диаметр формы рецепта.");
    Drecp = in.nextDouble();
    System.out.println("Написать диаметр формы для перерасчета.");
    Dpere = in.nextDouble();

    Radius1 = Drecp/2;
    Radius2 = Dpere/2;


    S1 = pi * Radius1*Radius1;
    S2 = pi * Radius2*Radius2;
    //S1 = Math.PI * Radius1*Radius1;
    //S2 = Math.PI * Radius2*Radius2;

    cof = S2/S1;
    System.out.println("коэффициент для\nперерасчета ингредиентов");
    System.out.println(cof);
}}
