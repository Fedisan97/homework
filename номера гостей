import java.util.Scanner;
    public static void main(String[] args) {
        Scanner gg = new Scanner(System.in);


        Scanner scanner = new Scanner(System.in);


        System.out.println("Введи количество гостей (от 1 до 20000):");
        int n = scanner.nextInt();


        if (n < 1 || n > 20000) {
            System.out.println("Ошибка: Количество гостей должно быть от 1 до 20000.");
            return;
        }


        System.out.println("Теперь введи номера мест, которые заняли гости (по одному номеру в строке):");
        int[] places = new int[n];
        for (int i = 0; i < n; i++) {
            places[i] = scanner.nextInt();
        }

        for (int place : places) {
            if (place < 1 || place > n) {
                System.out.println("Ошибка: Номер места должен быть в пределах от 1 до " + n + ".");
                return;
            }
        }


        int[] guests = new int[n];
        for (int i = 0; i < n; i++) {
            guests[places[i] - 1] = i + 1;
        }


        System.out.println("Вот номера гостей на соответствующих местах:");
        for (int guest : guests) {
            System.out.print(guest + " ");
        }
        // если я сделал правильно, я пойду отмечать вкусной чесночной булочкой:)
        scanner.close();
    }


