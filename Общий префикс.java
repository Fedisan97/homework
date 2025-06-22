// код не сделан полностью

import java.util.Scanner;
public class Ss {
    public static String ix(String... strings) {


        //  наибольшего общего префикса строк

 
        if (strings.length == 0) {
            return "";
        }StringBuilder longestCommonPrefix = new StringBuilder();
        for (int i = 0; i < strings[0].length(); i++) {
            char Char = strings[0].charAt(i);
            boolean Match = true;
            for (int j = 1; j < strings.length; j++) {
                if (i >= strings[j].length() || strings[j].charAt(i) != Char) {
                    Match = false;
                    break;}
            }if (!Match) {break;
            } else {longestCommonPrefix.append(Char);}}return longestCommonPrefix.toString();}



   //яблоко абрикос рименение НЕ ЗАБЫТЬ
    public static void main(String[] args) {
        String[] words = {"apple", "apricot", "application"};
        String fix =ix(words);
        System.out.println("Самый длинный общий префикс:" + fix);
    }
}
