package dsa;

//
//Question: Solve the N-Queens problem.
//
//Solution: Use backtracking to place queens on the board such that no two queens threaten each other.

import java.util.ArrayList;
import java.util.List;

public class NQueens {
	
	private static List<List<String>> solveNQueens(int n) {
		 List<List<String>> result = new ArrayList<>();
		 char[][] board = new char[n][n];
		 
		 for(int i =0; i<n; i++) {
			 for(int j=0; j<n;j++) {
				 board[i][j] = '.';
			 }
		 }
		 
		 solve(result, board, 0, n);
		 
		return result;
	}

	private static void solve(List<List<String>> result, char[][] board, int row, int n) {
		
		if(row == n) {
			result.add(construct(board));
            return;
		}
		  // Try placing queen in all columns of the current row
        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col, n)) {
                // Place the queen
                board[row][col] = 'Q';
                // Recursively place the queen in the next row
                solve(result, board, row + 1, n);
                // Backtrack and remove the queen from the current position
                board[row][col] = '.';
            }
        }
	}

	private static boolean isSafe(char[][] board, int row, int col, int n) {
		 // Check the column for another queen
		for(int i =0; i<row; i++) {
			if(board[i][col] =='Q' ) {
				return false;			
			}
		}
		
		// Check the upper-left diagonal for another queen
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Check the upper-right diagonal for another queen
        for (int i = row, j = col; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Safe to place the queen
		return true;
	}

	private static List<String> construct(char[][] board) {
		 List<String> list = new ArrayList<>();
	        for (int i = 0; i < board.length; i++) {
	            list.add(new String(board[i]));
	        }
	        return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n = 4; // Example for 4-Queens
	        List<List<String>> solutions = solveNQueens(n);
	        
	        for (List<String> solution : solutions) {
	            for (String row : solution) {
	                System.out.println(row);
	            }
	            System.out.println(); // Print empty line between solutions

	}

}
	
}

	
