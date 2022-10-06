package Array2d;

import java.util.Scanner;

public class FindElementInSortedArray {
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
        int val=scan.nextInt();
        int row=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i][n1-1]>val)
            {
                row=i;
                break;
            }else if(arr[i][n1-1]==val)
            {
                System.out.println(i);
                System.out.println(n1-1);
                return ;
            }
        }

        for(int j=0;j<arr[0].length;j++)
        {
            if(arr[row][j]==val)
            {
                System.out.println(row);
                System.out.println(j);
                return;
            }
        }
        System.out.println("Not Found");
    }
}
