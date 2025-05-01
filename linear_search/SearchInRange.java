package algorithm.linear_search;

import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the array:");
        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter starting range:");
        int start = sc.nextInt();
        System.out.println("Enter the end range:");
        int end = sc.nextInt();
        System.out.println("enter the target to found:");
        int target = sc.nextInt();
        search(arr, start, end, target);
        sc.close();
    }

    static void search(int[] arr, int start, int end, int target) {
        if (arr.length == 0 || arr.length < start || arr.length < end) {
            System.out.println("element not found");
        }
        for (int i = start; i <= end; i++) {
            if (arr[i] == target) {
                System.out.println("element found");
            }
        }
    }
}
