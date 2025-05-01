package algorithm.linear_search;

import java.util.Scanner;

public class EvenDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the array:");
        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        even(arr);
        sc.close(); {
        
            
        }
    }
    static void even(int[]arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            String num=String.valueOf(arr[i]);
            int len=num.length();
            if(len%2==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
