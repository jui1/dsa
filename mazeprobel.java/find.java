public class find {
    public static void main(String[] args) {

        fun("", 3, 3);
        
    }

    private static  void fun( String em  , int row , int col){

if(row == 1 && col == 1){
    System.out.println(em);
    return ;
   
}

if(row >1){
   fun( em + 'r', row-1 , col);
    }

    if(col>1){
        fun( em + 'd', row , col-1); 
    }
    
}
}
