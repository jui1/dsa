import java.util.Arrays;

public class first {
    public static void main(String[] args) {
        // Implement Bubble Sort and optimize it to stop early if the array is already sorted.
         int[] arr = {3,1,0 ,98,56};

         buble(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    public static void  buble(int[]arr){
        for(int i = 0;i<arr.length-1;i++){
            boolean swapped = false;
            for(int j = 1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    swap(arr, j ,j-1);
                    swapped = true;
                }
            }

            if(!swapped){
                break;
            }
        }


    }

    static void swap(int[]arr, int start , int end){
        int temp = arr[start];
        arr[start]= arr[end];
        arr[end]= temp;

    }
}
