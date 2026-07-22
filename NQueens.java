import java.util.*;
public class NQueens{
    public static void printBoard(int[][] board, int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(board[i][j] == 1) System.out.print("Q");
                else System.out.print(". ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean isSafe(int board[][],int n, int row, int col){
        for(int i=0; i<row; i++){
            if(board[i][col] == 1){
                return false;
            }
        }
        int i=row-1, j=col-1;
        while(i>=0 && j>=0){
            if(board[i][j] == 1) return false;
            i--; j--;
        }
        int i2 = row-1, j2=col+1;
        while(i2>=0 && j2<n){
            if(board[i2][j2]==1) return false;
            i2--; j2++;
        }
        return true;
    }

    public static void queen(int[][] board, int n, int row){
        if(row==n){
            printBoard(board, n);
            return;
        }
        for(int i=0; i<n; i++){
            if (isSafe(board, n, row, i) == true){
                board[row][i] = 1;
                queen(board, n, row+1);
                board[row][i] = 0;
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] board = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = 0;
            }
        }
        queen(board,n,0);
        sc.close();
    }
}