import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner gg = new Scanner(System.in);

        System.out.print("введите количество строк матрицы: ");
        int rows = gg.nextInt();

        System.out.print("введите количество столбцов матрицы: ");
        int cols = gg.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("введите элементы матрицы:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("матрица[%d][%d]: ", i + 1, j + 1);
                matrix[i][j] = gg.nextInt();
            }
        }

        int[][] transposedMatrix = transpose(matrix);

        System.out.println("\nматрица:");
        printMatrix(transposedMatrix);
    }

    public static int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int[][] transposedMatrix = new int[n][m];

        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        return transposedMatrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}


