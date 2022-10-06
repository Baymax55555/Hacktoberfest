package Array2d;

import java.util.Scanner;

public class Rotateby90degree {
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
        for(int i=0;i<n1;i++) {
            for (int j = i; j < n1; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        int scol=0,ecol=n1-1;
        while(scol<ecol)
        {
            for(int i=0;i<n1;i++)
            {
                int temp=arr[i][scol];
                arr[i][scol]=arr[i][ecol];
                arr[i][ecol]=temp;
            }
            scol++;
            ecol--;
        }
        display(arr);
    }
    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
