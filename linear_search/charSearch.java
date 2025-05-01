package algorithm.linear_search;

import java.util.Scanner;

public class charSearch {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the word:");
        String word = sc.next();
        System.out.println("Enter the target character: ");
        char ch = sc.next().charAt(0);
        System.out.println(search(word, ch));
        sc.close();
    }

    static boolean search(String word, char ch) {
        if (word.length() == 0) {
            return false;
        }
        for (char srch : word.toCharArray()) {
            if (srch == ch) {
                return true;
            }
        }
        return false;
    }
}
