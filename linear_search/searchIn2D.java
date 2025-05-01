package algorithm.linear_search;

import java.util.Scanner;

public class searchIn2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the array:");
        int len = sc.nextInt();
        int[][] arr = new int[len][4];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the target :");
        int target = sc.nextInt();
        sc.close();

        
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < 4; j++) {
                if (arr[i][j] == target) {
                    System.out.println("element found ");
                    return;
                }
            }
        }
        System.out.println("elemetn not found");
        
    }
}
