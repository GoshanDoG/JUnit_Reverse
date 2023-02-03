package org.example;
import java.util.Scanner;
public class Test_Task {
    String[] not_reversed = new String[]{ "a" , "e", "i", "0", "u", "y"};

    public static String reverse_String(String string) {


        return new StringBuilder(string).reverse().toString();
    }
    public static void write_a_String() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a word, please");
        String string = scanner.nextLine();

        string = reverse_String(string);
        System.out.println(string);

        if(string.contains("a")){
            string.replace("a", "1");
        }
    }
}

