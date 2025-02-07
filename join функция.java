import java.util.Scanner;
public class Main {
    public static String join(String[] tokens, char delimiter) {

        if (tokens.length == 0) {
             return "";
        }

        StringBuilder result = new StringBuilder(tokens[0]);
        for (int i = 1; i < tokens.length; i++) {
            result.append(delimiter).append(tokens[i]);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner gg = new Scanner(System.in);

        System.out.print("введите строки через пробел: ");
        String input =gg.nextLine();
        String[] words = input.split(" ");

        System.out.print("введите разделитель: ");
        char delimiter = gg.next().charAt(0);

        String joinedString = join(words, delimiter);
        System.out.println(joinedString);
    }
}
