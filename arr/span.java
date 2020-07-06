import java.io.*;
import java.util.*;

public class Main{
    
    public static int max(int a[]){
        int max = a[0];
        for(int i=1 ; i<a.length ; i++){
            if (max < a[i] ){
                max = a[i];
            }
        }
        return max;
    }
    public static int min(int a[]){
        int min = a[0];
        for(int i=1 ; i<a.length ; i++){
            if (min > a[i] ){
                min = a[i];
            }
        }
        return min;
    }
    

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int a[] = new int[n];
    for(int i=0 ; i<a.length ; i++){
        a[i] = scn.nextInt();
    }
    int max = max(a);
    int min = min(a);
    int span = max-min;
    System.out.println(span);
 }

}