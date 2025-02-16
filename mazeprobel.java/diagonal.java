

public class diagonal {
    public static void main(String[] args) {
        ans("", 3, 3);
        
    }
    private static void ans(String ab  , int row , int col){
        if(row == 1 || col == 1){
         System.out.println(ab);
         return ;

        }

        if(row>1){
            ans(ab+'p', row-1, col);
        }

        if(col >1){
            ans(ab+'A', row, col-1);
        }
        if(col >1 && col >1){
            ans(ab+'J', row-1, col-1);
        }

    }
    
}
