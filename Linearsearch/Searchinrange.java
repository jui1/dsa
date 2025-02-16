public class Searchinrange {
    public static void main(String[] args) {
        int arr[] ={12, 45,67,89,90};
        int target = 90;
        System.out.println(ss(arr, target, 0, 4));
        
    }
    public static int ss(int arr[] , int target , int start , int end){

        if(arr.length == 0){
            return -1;
        }

        for(int i = start ; i<=end;i++){
            if(arr[i] == target){
                return i;
            }
        }

        return -1;
    }
}
