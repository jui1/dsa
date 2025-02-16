public class Cilling {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        System.out.println(ss(arr, target));
    }
    public static int ss(int arr[]  , int target){

        if(arr.length == 0){
            return -1;
        }
       int start = 0 ;
       int end = arr.length-1;

       while(start<=end){
        int mid = start +(end - start)  /2;
        if( arr[mid ] == target){
            return arr[mid];
        }
        else if(arr[mid] >target){
          end = mid-1;
        } else{
        start = mid+1;
        }
       }

       return arr[start];
    }
    
}
