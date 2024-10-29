package java_recursive.divide_and_conquer.quick_sort;

public class QuickSort_01 {

    void swap(int[]arr, int i, int j){
        int tmp;
        tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    int partitioning(int[]arr, int low, int high){
        int pivot = arr[high];

        int i = low -1;

        //note 2: j = low
        for (int j = low; j < high; j++) {
            if(arr[j] < pivot){

                i++;
                swap(arr, i, j);
            }
        }
        i++;
        swap(arr, i, high);
        return i;
    }

    void quickSort(int[]arr, int low, int high){
        //note1: if(high-low<1) return;
        if(high-low<1) return;
        int pi = partitioning(arr, low, high);

        //less
        quickSort(arr, 0, pi -1 );

        //greater
        quickSort(arr, pi + 1, high  );

    }

    void display(int[] arr){
        for (int i: arr
             ) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {

        QuickSort_01 quickSort_01 = new QuickSort_01();
//        int[] arr = new int[]{1,6,2,7,5};
        int[] arr = new int[]{1,9,6,2,7,-1,5};
        quickSort_01.quickSort(arr, 0, arr.length-1);
        quickSort_01.display(arr);

    }
}
