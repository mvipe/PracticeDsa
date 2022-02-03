package com.mvipe.Question;
//leetcode
//link-https://leetcode.com/problems/valid-sudoku/
public class ValidSudoku {
    public static void main(String[] args) {
        char[][] board = new char[][]{
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}

        };

        System.out.println(isValidSudoku(board));


    }

    static boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (!isValidPos(board, i, j)) {

                    return false;
                }
            }
        }

        return true;
    }

    static boolean isValidPos(char[][] board, int row, int col) {
        char ch = board[row][col];
        if (ch == '.') {
            return true;
        }

        //checking in row
        for (int i = 0; i < board[row].length; i++) {
            if (board[row][i] == ch && col != i) {

                return false;
            }
        }

        //checking in col
        for (int i = 0; i < board[col].length; i++) {
            if (board[i][col] == ch && row != i) {

                return false;
            }
        }


        //checking in the small grid
        int[] startingPoints = startingGridPoint(row, col);
        int a = startingPoints[0];
        int b = startingPoints[1];
        for (int i = a; i < a + 3; i++) {
            for (int j = b; j < b + 3; j++) {

                if (board[i][j] == ch && (i != row && j != col)) {
                    return false;
                }
            }
        }

        return true;
    }

    static int[] startingGridPoint(int row, int col) {
        if (row < 3 && col < 3) {
            return new int[]{0, 0};
        }
        if (row < 3 && col < 6) {
            return new int[]{0, 3};
        }
        if (row < 3 && col < 9) {
            return new int[]{0, 6};
        }

        if (row < 6 && col < 3) {
            return new int[]{3, 0};
        }
        if (row < 6 && col < 6) {
            return new int[]{3, 3};
        }
        if (row < 6 && col < 9) {
            return new int[]{3, 6};
        }

        if (row < 9 && col < 3) {
            return new int[]{6, 0};
        }
        if (row < 9 && col < 6) {
            return new int[]{6, 3};
        }

        return new int[]{6, 6};


    }
}