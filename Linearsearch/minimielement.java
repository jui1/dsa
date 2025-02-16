public class minimielement {
    //find the minimun one
    public static void main(String[] args) {
        int arr [] ={8, 4, -7 ,9};
       System.out.println(ss(arr));

        
    }
    public static int ss(int arr[] ){

        int min = arr[0] ;

        for(int i = 1 ; i< arr.length ;i++){
            if(arr[i] < min){
                min = arr[i];
            }

        }
        return min;

    }
    
}
