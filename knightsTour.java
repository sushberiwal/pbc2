import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int chess[][]=new int[n][n];
        int i=scn.nextInt();
        int j=scn.nextInt();
        printKnightsTour(chess , i , j , 1);
    }

    public static void printKnightsTour(int[][] chess, int i , int j , int move) {
        //-ve base case
        if(i<0 || j<0 || i>=chess.length || j>=chess[0].length || chess[i][j] != 0){
            return;
        }
        if(move == chess.length*chess.length){
            chess[i][j] = move;
            displayBoard(chess);
            chess[i][j] = 0;
            return;
        }
        chess[i][j] = move;
        printKnightsTour(chess , i-2,j+1,move+1);
        printKnightsTour(chess , i-1,j+2,move+1);
        printKnightsTour(chess , i+1,j+2,move+1);
        printKnightsTour(chess , i+2,j+1,move+1);
        printKnightsTour(chess , i+2,j-1,move+1);
        printKnightsTour(chess , i+1,j-2,move+1);
        printKnightsTour(chess , i-1,j-2,move+1);
        printKnightsTour(chess , i-2,j-1,move+1);
        chess[i][j] = 0;
    }

    public static void displayBoard(int[][] chess){
        for(int i = 0; i < chess.length; i++){
            for(int j = 0; j < chess[0].length; j++){
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}