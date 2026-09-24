package lect_8;
import java.util.*;
public class FindMinimumAreaToCoverAllOnes {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[][]grid = {{0,1,0},{1,0,1}};
       System.out.println( AllOnes(grid,0,0,grid.length-1,grid[0].length-1));
    }
    static int AllOnes(int[][]nums,int cr,int cc,int er,int ec){
        int minr = Integer.MAX_VALUE;
        int maxr = Integer.MIN_VALUE;
        int minc = Integer.MAX_VALUE;
        int maxc = Integer.MIN_VALUE;
        for(int i =  cr ; i<= er;i++ ){
            for(int j = cc; j<ec; j++){
                if(nums[i][j] == 1){
                    minr = Math.min(minr,i);
                    minc = Math.min(minc,j);
                    maxr = Math.max(maxr,i);
                    maxc = Math.max(maxc,j);
                }
            }
        }
        return (maxr-minr+1)*(maxc-minc+1);
    }
}
