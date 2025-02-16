public class mazediogonal {
    public static void main(String[] args) {
        boolean[][] maze = {
            {true, true, true},
            {true, false, true},
            {true, true, true}
        };

        ans("", 0, 0, maze);
        
    }

    private static void ans(String emp , int row , int col , boolean [][] mazze){
        if(row == mazze.length-1 && col == mazze[0].length-1){
            System.out.println(emp);
            return ;
        }
       

        if(!mazze[row][col]){
          return;
        }

        mazze[row][col] = false;
        if(row<mazze.length-1){
            ans(emp+'h', row+1, col, mazze);
        }
        if(col<mazze[0].length-1){
            ans(emp+'u', row, col+1, mazze);
        }

        if(col>0){
            ans(emp+'k', row, col-1, mazze);
        }
        if(row>0){
            ans(emp+'y', row-1, col, mazze);
        }

        mazze[row][col] = true;
    }
    
}
