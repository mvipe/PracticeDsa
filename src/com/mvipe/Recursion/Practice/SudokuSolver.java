package com.mvipe.Recursion.Practice;

public class SudokuSolver {
    public static void main(String[] args) {
        System.out.println((int)('9'));
        System.out.println((char)(9+'0')+"h");
    }

    public void solveSudoku(char[][] board) {
        if (solve(board)) {
            display(board);
        }
    }
    boolean solve(char[][] board) {
        int n = board.length;
        int row = -1;
        int col = -1;

        boolean emptyLeft = true;

        // this is how we are replacing the r,c from arguments
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == '.') {
                    row = i;
                    col = j;
                    emptyLeft = false;
                    break;
                }
            }
            // if you found some empty element in row, then break
            if (emptyLeft == false) {
                break;
            }

            if (emptyLeft == true) {
                return true;
                // soduko is solved
            }

            // backtrack
            for (int number = 1; number <= 9; number++) {
                if (isSafe(board, row, col, (char)(number+'0'))) {
                    board[row][col] = (char)(number+'0');
                    if (solve(board)) {
                        // found the answer
                        return true;
                    } else {
                        // backtrack
                        board[row][col] = '.';
                    }
                }
            }
            return false;
        }
        return false;
    }



        private boolean isSafe(char[][] board,int row ,int col,char num){
            //check for row
            for (int i = 0; i < board.length; i++) {
                //check if the number is in row or not
                if(board[row][i]==num){
                    return false;
                }
            }

            //check for col
            for(char[] nums:board){
                //check if the number is in row or not
                if(nums[col]==num){
                    return false;
                }
            }


            //checking in small grid
            int sqrt=(int)(Math.sqrt(board.length));
            int rowStart=row-row % sqrt;
            int colStart=col-col % sqrt;

            for (int i = rowStart; i <rowStart + sqrt ; i++) {
                for (int j = colStart; j < colStart+sqrt; j++) {
                    if(board[i][j]==num){
                        return false;
                    }
                }
            }

            return true;
        }

        void display(char[][] board) {
            for(char[] row : board) {
                for(char num : row) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }

    }
