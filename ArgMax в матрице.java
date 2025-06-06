

import java.util.Scanner;

public class MagMax {
    public static void main(String[] args) {
        Scanner gg = new Scanner(System.in);
        System.out.println("вв=ведите количество строк и столбцов: ");
        int ns = gg.nextInt(), k = gg.nextInt();

        System.out.println("введите элементы матрицы: ");
        double[][] matrix = new double[ns][k];
        for (int i = 0; i < ns; i++) {
            for (int j = 0; j < k; j++) {
                matrix[i][j] = gg.nextDouble();
            }
        }

        int[] Row = new int[1], Col = new int[1];
        double Val = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < ns; i++) {
            for (int j = 0; j < k; j++) {
                if (matrix[i][j] > Val) {
                    Val = matrix[i][j];
                    Row[0] = i;
                    Col[0] = j;
                }
            }
        }

        System.out.printf("равен(%d,%d)\n", Row[0], Col[0]);
    }
}
