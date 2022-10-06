public class InsertionSortEx {
    public static void insertionSort(int[] arr) {
        for (int x = 1; x < arr.length; x++) {
            int current = arr[x];
            int y = x - 1;
            while(y >= 0 && current < arr[y]) {
                arr[y+1] = arr[y];
                y--;
            }
            arr[y+1] = current;
        }
    }
    public static void main(String a[]){
        int[] arr1 = {3,5,7,8,4,2,1,9,6};
        System.out.println("Before Sorting");
        for(int x:arr1){
            System.out.print(x+" ");
        }
        System.out.println();
        insertionSort(arr1);//sorting array using insertion sort
        System.out.println("After Insertion Sorting");
        for(int x:arr1){
            System.out.print(x+" ");
        }
    }
}