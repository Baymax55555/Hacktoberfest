package Array2d;

import java.util.Scanner;

public class SaddlePoint {
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
            int col=0;
            for(int j=0;j<arr[0].length;j++)
            {
                if(arr[i][j]<arr[i][col])
                {
                    col=j;
                }
            }
            boolean flag=true;
            for(int k=0;k<arr.length;k++)
            {
                if(arr[i][col]<arr[k][col])
                {
                    flag=false;
                    break;
                }
            }
//            System.out.println(col);
            if(flag)
            {
                System.out.println(arr[i][col]);
                break;
            }
        }

    }
}
