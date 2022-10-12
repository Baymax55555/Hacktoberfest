public class SelectionSortEx {
    public static void selectionSort(int[] arr){
        for (int x = 0; x < arr.length - 1; x++)
        {
            int indx = x;
            for (int y = x + 1; y < arr.length; y++){
                if (arr[y] < arr[indx]){
                    indx = y;
                }
            }
            int smallNumber = arr[indx];
            arr[indx] = arr[x];
            arr[x] = smallNumber;
        }
    }
    public static void main(String a[]){
        int[] arr1 = {3,5,1,2,4};
        System.out.println("Before Sorting");
        for(int x:arr1){
            System.out.print(x+" ");
        }
        System.out.println();
        selectionSort(arr1);
        System.out.println("After Selection Sorting");
        for(int x:arr1){
            System.out.print(x+" ");
        }
    }
}