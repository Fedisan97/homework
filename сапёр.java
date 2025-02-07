import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ввод данных
        System.out.println("Количество строк:");
        int m = scanner.nextInt(); // строки
        System.out.println("Количество столбцов:");
        int n = scanner.nextInt(); // столбцы
        System.out.println("Количество мин:");
        int k = scanner.nextInt(); // количество мин

        // массив для хранения координат мин
        int[][] mines = new int[k][2]; // для координат мин

        System.out.println("Введите координаты мин (строка столбец):");
        for (int i = 0; i < k; i++) {
            mines[i][0] = scanner.nextInt() - 1; // строки начинаются с 1
            mines[i][1] = scanner.nextInt() - 1; // столбцы тоже начинаются с 1
        }

        // создание игрового поля
        char[][] field = new char[m][n];

        // заполнение поля пустыми клетками
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                field[i][j] = ' ';
            }
        }

        // размещение мин на поле
        for (int i = 0; i < k; i++) {
            int row = mines[i][0];
            int col = mines[i][1];
            field[row][col] = '*'; // устанавливаем мину
        }

        // oбновление соседних клеток
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (field[i][j] == '*') {
                    continue;
                }

                // подсчёт количества мин вокруг текущей клетки
                int count = 0;
                for (int x = Math.max(i - 1, 0); x <= Math.min(i + 1, m - 1); x++) {
                    for (int y = Math.max(j - 1, 0); y <= Math.min(j + 1, n - 1); y++) {
                        if (x != i || y != j && field[x][y] == '*') { // проверка 
                            count++;
                        }
                    }
                }
                if (count > 0) {
                    field[i][j] = (char)(count + '0'); // Запись количества мин в клетке
                }
            }
        }

        // Вывод результата
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
    }
}
