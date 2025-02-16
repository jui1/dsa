public class Search {
    public static void main(String[] args) {
        int arr1[] = {12, 23, 24, 29, 89};
        int k = 9;
        
        System.out.println(ss(arr1, k));
    }
    static int ss(int arr[] , int a){
        if(arr.length ==0) return -1;
       

        for(int i = 0 ;i< arr.length; i++){
            if(arr[i] == a){
            return i;
            }

        }
        return -1;
    }
    
}
