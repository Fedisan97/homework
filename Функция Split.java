import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner gg = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String inputText = gg.nextLine();
        String convertedText = inputText.replaceAll("_", "\n");
        System.out.println(convertedText);
        gg.close();
    }
}
