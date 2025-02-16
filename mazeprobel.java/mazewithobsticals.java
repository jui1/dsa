public class mazewithobsticals {
    public static void main(String[] args) {
        boolean[][] maze = {
            {true, true, true},
            {true, false, true},
            {true, true, true}
        };

        ans("", 0, 0, maze);
    }

    private static void ans(String ab , int row , int col , boolean [][] mazze){
        if(row== mazze.length-1 && col == mazze[0].length-1){
            System.out.println(ab);
            return;
        }
        if(!mazze[row][col]){
            return;

        }

        if(col<mazze[0].length-1){
            ans(ab+'r', col+1, row, mazze);
        }
        if(row<mazze.length -1){
            ans(ab+'d', col, row+1, mazze);
        }
    }
    
}
