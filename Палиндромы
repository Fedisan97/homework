import java.util.Scanner;
    public static void main(String[] args) {
        Scanner gg = new Scanner(System.in);

        String DA = gg.nextLine();

        String withoutSpaces = DA.replace(" ", "");

      
        int left = 0;
        int right = withoutSpaces.length() - 1;

        while (left < right) {
            if (withoutSpaces.charAt(left) != withoutSpaces.charAt(right)) {
                System.out.println("нет");
                return;
            }

            left++;
            right--;
        }

        System.out.println("да");
    }


