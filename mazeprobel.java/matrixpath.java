import java.util.Arrays;

public class matrixpath {
    public static void main(String[] args) {
        boolean[][] maze ={
            {true, true, true},
            {true, true, true},
            {true, true, true}
        };
        
        int[][] path = new int[maze.length][maze[0].length];
        ans("", 0, 0, maze, path, 1);
    }
    private static void ans(String emp , int row , int col , boolean [][] maze , int [][] path , int step){
        if(row == maze.length -1 && col == maze[0].length -1){
            path[row][col]= step;
            for (int[] rpow : path) {
            System.out.println(Arrays.toString(rpow));
        }
        System.out.println();
        System.out.println(emp);
            
            return ;
        }
        if(!maze[row][col]){
            return ;
        }

        maze[row][col]= false;
        path[row][col] = step;

        if(row<maze.length-1){
            ans(emp+'d', row+1, col, maze, path, step+1);
        }

        if(col<maze[0].length-1){
            ans(emp+'p', row, col+1, maze, path, step+1);
        }
        if(col>0){
            ans(emp+'j', row, col-1, maze, path, step+1);
        }
        if(row>0){
            ans(emp+'l', row-1, col, maze, path, step+1);
        }

        maze[row][col]= true;
        path[row][col]= step;

    }
}
