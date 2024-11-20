import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner gg = new Scanner(System.in);

        // количество строк
        int n = gg.nextInt();

        //  хранение точек
        Point[] poi = new Point[n];


        for (int i = 0; i < n; i++) {
            int x = gg.nextInt();
            int y = gg.nextInt();
            poi[i] = new Point(x, y);
        }so(poi);

        // отсортированные точки
        for (Point point : poi) {
            System.out.println(point.x + " " + point.y);
        }
    }

    private static void so(Point[] points) {
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                if (points[j].distanceSquared() < points[i].distanceSquared()) {
                    swap(points, i, j);
                }
            }
        }
    }
    private static void swap(Point[] poits, int i, int j) {
        Point tep = poits[i];
        poits[i] = poits[j];
        poits[j] = tep;
    }
}
class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public long distanceSquared() {
        return (long) x * x + (long) y * y;
    }
}
