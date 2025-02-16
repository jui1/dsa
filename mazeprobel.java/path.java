public class path {
    public static void main(String[] args) {
        
        System.out.println(ans(3, 3));
    }
    private static int ans(int row , int col ){
       
        if(row ==1 ||col==1){
          
            return 1;
        }

       
       int left =     ans( row-1, col);
    
        
       int right =     ans(row, col-1);
    
     return  left+right;

      





    }
    
}
