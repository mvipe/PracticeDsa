package com.mvipe.Recursion.Basic.BackTracking;

public class MazeWithObstacle {
    public static void main(String[] args) {
        boolean[][] maze={
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        printingDiagonally(0,0,"",maze);
    }

    //printing path with obstacle
    static void printingDiagonally(int r,int c,String paths,boolean[][] maze){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(paths);
            return;
        }
        if(!maze[r][c]) return;



        if(r<maze.length-1 && c<maze[0].length-1){
            printingDiagonally(r+1,c+1,paths+"x",maze);
        }
        if(r<maze.length-1){
            printingDiagonally(r+1,c,paths+"D",maze);
        }
        if(c<maze[0].length-1){
            printingDiagonally(r,c+1,paths+"R",maze);
        }


    }
}
