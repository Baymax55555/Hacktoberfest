public class HeapSort
{
    public void sort(int arr[])
    {
        int n = arr.length;
        for (int x = n / 2 - 1; x >= 0; x--)
            heapify(arr, n, x);
        for (int x=n-1; x>=0; x--)
            int tmp = arr[0];
        arr[0] = arr[x];
        arr[x] = tmp;
        heapify(arr, x, 0);
    }
}
    void heapify(int arr[], int n, int x)
    {
        int largest = x;
        int L = 2*x + 1;
        int r = 2*x + 2;
        if (L < n && arr[L] > arr[largest])
            largest = L;
        if (r < n && arr[r] > arr[largest])
            largest = r;
        if (largest != x)
        {
            int swap = arr[x];
            arr[x] = arr[largest];
            arr[largest] = swap;
            heapify(arr, n, largest);
        }
    }
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int x=0; x<n; ++x)
            System.out.print(arr[x]+" ");
        System.out.println();
    }
    public static void main(String args[])
    {
        int arr[] = {6,1,8,3,5,2,4};
        int n = arr.length;
        System.out.println("Before Sorting:");
        printArray(arr);
        HeapSort ob = new HeapSort();
        ob.sort(arr);
        System.out.println("After Heap Sorting:");
        printArray(arr);
    }
}_
