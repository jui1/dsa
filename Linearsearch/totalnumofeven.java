public class totalnumofeven {
    public static void main(String[] args) {
        int arr[] = {10 ,12, 16, 23, 99 , 7};
System.out.println(ss(arr));
        
    }
    
    public static int ss(int arr[] ){
        if(arr.length == 0) return -1;
        int count = 0;

        for(int i = 0 ; i< arr.length; i++){
            if( arr[i] %2 == 0){
                count++;
            }
        }
        return count ;
    }
}
