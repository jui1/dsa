public class mazzewithre {
    public static void main(String[] args) {
        boolean[][] maze = {
            {true, true, true},
            {true, false, true},
            {true, true, true}
        };

        ans("", 0, 0, maze);
        
    }
    private static void ans(String emp , int row , int col , boolean [][]maze){
        if(row== maze.length-1 && col==maze[0].length-1){
            System.out.println(emp);
            return;
        }
        if(!maze[row][col]){
            return ;
        }

        if(row<maze.length-1){
            ans(emp+'r', row+1, col, maze);
        }
        if(col<maze[0].length-1){
            ans(emp+'c', row, col+1, maze);
        }
    }
    
}
