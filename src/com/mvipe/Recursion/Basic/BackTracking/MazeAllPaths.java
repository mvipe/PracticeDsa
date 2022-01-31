package com.mvipe.Recursion.Basic.BackTracking;

public class MazeAllPaths {
    public static void main(String[] args) {
        boolean[][] maze={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };

        mazeAllPath(0,0,"",maze);

    }

    static void mazeAllPath(int r,int c,String paths,boolean[][] maze){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(paths);
            return;
        }
        if(!maze[r][c]) return;

        maze[r][c]=false;

        if(r<maze.length-1){
            mazeAllPath(r+1,c,paths+"R",maze);

        }
        if(c<maze[0].length-1){
            mazeAllPath(r,c+1,paths+"D",maze);
        }

        if(c>0){
            mazeAllPath(r,c-1,paths+"U",maze);
        }

        if(r>0){
            mazeAllPath(r-1,c,paths+"L",maze);
        }
        maze[r][c]=true;


    }
}
