public class Searchintowarry {
    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3, 4},  // First row
            {5, 6, 7, 8},  // Second row
            {9, 10, 11, 12} // Third row
        };

        int target = 11;
     System.err.println(ss(array, target));
        
    }

    public static int ss(int arr[][] ,  int target){
        if(arr.length == 0) return -1;

        for(int i = 0 ; i < arr.length ;i++){
            for(int j = 0 ; j < arr[i].length ; j++){
                if(arr[i][j] == target){
                return  arr[i][j];
                }
            }
        }

        return -1;
    }
    
}
