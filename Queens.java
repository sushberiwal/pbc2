import java.util.*;

public class Queens{


    public static int queensCombination1d(int boxes[] , int tnq , int qpsf , int idx , String ans){
        if(qpsf == tnq){
            System.out.println(ans);
            return 1;
        }

        int count=0;
        for(int i=idx ; i<boxes.length ; i++){
            count+=queensCombination1d(boxes , tnq , qpsf+1 , i+1 , ans + "Q"+qpsf+"["+i+"] ");
        }
        return count;
    }

    public static int queensPermutations1d(int boxes[] , int tnq , int qpsf , int idx , String ans){
        if(qpsf == tnq){
            System.out.println(ans);
            return 1;
        }

        int count=0;
        for(int i=idx ; i<boxes.length ; i++){

            if(boxes[i] == 0){
                boxes[i] = 1;
               count+=queensPermutations1d(boxes , tnq , qpsf+1 , 0 , ans + "Q"+qpsf+"["+i+"] ");
               boxes[i] = 0;
            }
        
        }
        return count;
    }


    public static boolean isQueenSafe(int chess[][] , int row , int col){
        //top
        for(int i = row ; i>=0 ; i--){
            if(chess[i][col] == 1){
                return false;
            }
        }
        //top-right
        for(int i=row , j=col ; i>=0 && j<chess[0].length ; i--,j++){
            if(chess[i][j] == 1){
                return false;
            }
        }
        //top-left
        for(int i=row , j=col ; i>=0 && j>=0 ; i--,j--){
            if(chess[i][j]==1){
                return false;
            }
        }
        //left
        for(int j=col ; j>=0 ; j--){
            if(chess[row][j] == 1){
                return false;
            }
        }

        return true;
    }
    public static int nQueensCombinations2d(int chess[][] , int tnq , int qpsf , int idx , String ans){
        if(qpsf == tnq){
            System.out.println(ans);
            return 1;
        }

        int count=0;
        for(int i=idx ; i<chess.length*chess[0].length; i++){
            int r= i / chess[0].length;
            int c= i % chess[0].length;
            if(isQueenSafe(chess , r , c) == true){
            chess[r][c] = 1;    
            count+=nQueensCombinations2d(chess , tnq , qpsf+1 , i+1 , ans + "Q"+qpsf+"[" + r + ","+ c + "] " );
            chess[r][c] = 0;
            }
        }
        return count;
    }


    public static int nQueensPermutations2d(int chess[][] , int tnq , int qpsf , int idx , String ans){
        if(qpsf == tnq){
            System.out.println(ans);
            return 1;
        }

        int count=0;
        for(int i=idx ; i<chess.length*chess[0].length; i++){
            int r= i / chess[0].length;
            int c= i % chess[0].length;
            if(chess[r][c] == 0){
            chess[r][c] = 1;
            count+=nQueensPermutations2d(chess , tnq , qpsf+1 , idx , ans + "Q"+qpsf+"[" + r + ","+ c + "] " );
            chess[r][c] = 0;
            }
        }
        return count;
    }

    public static void main(String[] args){
        // int boxes[] = new int[5];
        // int tnq = 3; // total no of queens
        // int qpsf= 0; // queen placed so far
        // int idx = 0; // index
        // int count = queensCombination1d(boxes , tnq , qpsf , idx , "");
        //  int count = queensPermutations1d(boxes , tnq , qpsf , idx , "");
        int chess[][] = new int[4][4];
        int tnq = 4;
        int qpsf = 0;
        int idx=0;
        int count = nQueensCombinations2d(chess , tnq , qpsf , idx , "");
        // int count = nQueensPermutations2d(chess , tnq , qpsf , idx , "");
        System.out.println(count);
    }
}