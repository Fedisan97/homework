import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner strom = new Scanner(System.in);
        String password = strom.nextLine();
        if (isValidPassword(password)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        strom.close();
    }

    private static boolean isValidPassword(String password) {
        if (password.length() < 8 || password.length() > 14) {
            return false;
        }
        int ff2 = 0;
        int ggf = 0;
        int dss = 0;
        int q = 0;
        for (char c : password.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                ff2++;
            } else if (c >= 'a' && c <= 'z') {
                ggf++;
            } else if (c >= '0' && c <= '9') {
                dss++;
            } else if ((c >= 33 && c <= 47) || (c >= 58 && c <= 64) || (c >= 91 && c <= 96) || (c >= 123 && c <= 126)) {
                q++;
            } else {
                return false;
            }
        }


        int ff = (ff2 > 0 ? 1 : 0)
                + (ggf > 0 ? 1 : 0) + (dss > 0 ? 1 : 0)
                + (q > 0 ? 1 : 0);
        return ff >= 3;
    }
}




