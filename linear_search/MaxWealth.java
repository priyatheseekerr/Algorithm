package algorithm.linear_search;

import java.util.Scanner;

public class MaxWealth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the row and coloumn: ");
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] arr=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<row;i++){
            int sum=0;
            for(int j=0;j<arr[i].length;j++){
               sum+=arr[i][j];
            }
            if(sum>max){
                max=sum;
            }
        }
        System.out.println(max);
        sc.close();
    }
}
