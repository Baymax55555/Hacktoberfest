package Array2d;

import java.util.Scanner;

public class StateOfWakanda2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n1=scan.nextInt();
        int[][] arr=new int[n1][n1];
        for(int i=0;i<n1;i++)
        {
            for(int j=0;j<n1;j++)
            {
                arr[i][j]=scan.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            int count=0;
            for(int j=i;j<arr.length;j++)
            {
                System.out.println(arr[count][j]);
                count++;
            }
        }
    }
}
