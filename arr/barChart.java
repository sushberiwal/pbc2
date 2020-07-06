import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    
    int arr[] = new int[n];
    int max=Integer.MIN_VALUE;
    for(int i=0 ; i<arr.length ; i++){
        
        arr[i] = scn.nextInt();
        if(max < arr[i]){
            max = arr[i];
        }
    }
    
    for(int i= max ; i>=1 ; i--){
        for(int j=0 ; j<arr.length ; j++){
            if(arr[j] >= i){
                System.out.print("*\t");
            }
            else{
                System.out.print("\t");
            }
        }
        System.out.println();
    }
    
 }

}