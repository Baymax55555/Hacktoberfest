package Array2d;

import java.util.LinkedList;
import java.util.Scanner;


public class RingRotate {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scan=new Scanner(System.in);
        int n1=scan.nextInt();
        int m1=scan.nextInt();
        int[][] arr=new int[n1][m1];
        for(int i=0;i<n1;i++)
        {
            for(int j=0;j<m1;j++)
            {
                arr[i][j]=scan.nextInt();
            }
        }
        int sh=scan.nextInt();
        int r=scan.nextInt();

        int[] store=fillarray(arr,sh);
        rotate(store,r);
        fillMatrix(arr,store,sh);
        display(arr);
    }

    private static void fillMatrix(int[][] arr, int[] store, int sh) {
        int mr=sh-1,mc=sh-1,mar=arr.length-sh,mac=arr[0].length-sh;
        int size=store.length;

        int idx=0;
        for(int i=mc;i<=mac&&size>idx;i++)
        {
            arr[mr][i]=store[idx];
            idx++;
        }
        mr++;
        for(int i=mr;i<=mar&&size>idx;i++)
        {
            arr[i][mac]=store[idx];
            idx++;
        }
        mac--;
        for(int i=mac;i>=mc&&size>idx;i--)
        {
            arr[mar][i]=store[idx];
            idx++;
        }
        mar--;
        for(int i=mar;i>=mr&&size>idx;i--)
        {
            arr[i][mc]=store[idx];
            idx++;
        }

    }

    private static int[] fillarray(int[][] arr, int sh)
    {
        int mr=sh-1,mc=sh-1,mar=arr.length-sh,mac=arr[0].length-sh;
        int size=2*(mar-mr);
        if(mr!=mar)
        {
            size+=2*(mac-mc);
        }else
        {
            size+=mac-mc+1;
        }
        int[] store=new int[size];
        int idx=0;
            for(int i=mc;i<=mac&&size>idx;i++)
            {
                store[idx]=arr[mr][i];
                idx++;
            }
            mr++;
            for(int i=mr;i<=mar&&size>idx;i++)
            {
                store[idx]=arr[i][mac];
                idx++;
            }
            mac--;
            for(int i=mac;i>=mc&&size>idx;i--)
            {
                store[idx]=arr[mar][i];
                idx++;
            }
            mar--;
            for(int i=mar;i>=mr&&size>idx;i--)
            {
                store[idx]=arr[i][mc];
                idx++;
            }


        return store;
    }

    private static void rotate(int[] store, int r) {
        r=r%store.length;
        if(r<0)
        {
            r=r+store.length;
        }
        int s=0,e=r-1;
        while(s<e)
        {
            int temp=store[s];
            store[s]=store[e];
            store[e]=temp;
            s++;
            e--;
        }
        s=r;e=store.length-1;
        while(s<e)
        {
            int temp=store[s];
            store[s]=store[e];
            store[e]=temp;
            s++;
            e--;
        }
        s=0;e=store.length-1;
        while(s<e)
        {
            int temp=store[s];
            store[s]=store[e];
            store[e]=temp;
            s++;
            e--;
        }
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
