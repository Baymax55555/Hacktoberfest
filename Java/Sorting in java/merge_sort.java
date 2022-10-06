import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class MergeSort {
    static void merge(int[] array,int lowval,int midval,int highval){
        int x, y ,k;
        int[] c= new int[highval-lowval+1];
        k = 0;
        x=lowval;
        y=midval+1;
        while(x<=midval && y<=highval){
            if(array[x]<=array[y]){
                c[k++] = array[x++];
            }
            else{
                c[k++] = array[y++];
            }
        }
        while(x<=midval){
            c[k++] = array[x++];
        }
        while(y<=highval){
            c[k++] = array[y++];
        }
        k=0;
        for(x = lowval; x<=highval; x++){
            array[x] = c[k++];
        }
    }
    static void mergeSort(int[] array,int lowval, int highval){
        if(highval-lowval+1>1){
            int midval = (lowval+highval)/2;
            mergeSort(array,lowval,midval);
            mergeSort(array,midval+1,highval);
            merge(array,lowval,midval,highval);
        }
    }
    public static void main(String[] args) {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int size;
        System.out.println("Enter the array");
        try {
            size = Integer.parseInt(r.readLine());
        } catch (Exception e) {
            System.out.println("Please Enter valid Input");
            return;
        }
        int[] array = new int[size];
        System.out.println("Enter array elements");
        int x;
        for (x = 0; x < array.length; x++) {
            try {
                array[x] = Integer.parseInt(r.readLine());
            } catch (Exception e) {
                System.out.println("An error Occurred");
            }
        }
        System.out.println("After Sorting");
        System.out.println(Arrays.toString(array));
        mergeSort(array,0,array.length-1);
        System.out.println("Before Merge Sorting");
        System.out.println(Arrays.toString(array));
    }
}