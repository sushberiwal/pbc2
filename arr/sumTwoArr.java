import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n1 = scn.nextInt();
    int a1[] = new int[n1];
    for(int i=0 ; i<a1.length ; i++){
        a1[i] = scn.nextInt();
    }
    
    int n2 = scn.nextInt();
    int a2[] = new int[n2];
    for(int i=0 ; i<a2.length ; i++){
        a2[i] = scn.nextInt();
    }
    int size = n1 > n2 ? n1+1 : n2+1;
    int sum[] = new int[size];
    int i = a1.length-1;
    int j = a2.length-1;
    int k = sum.length-1;
    int carry=0;
    while(k >=0 ){
        int dig = carry;
        if(i>=0){
           dig += a1[i]; 
        }
        if(j>=0){
            dig += a2[j];
        }
        carry = dig/10;
        dig = dig % 10;
        sum[k] = dig;
        i--;
        j--;
        k--;
    }
    int idx = 0;
    if(sum[0] == 0){
        idx++;
    }
    for(int p=idx ; p<sum.length ; p++ ){
        System.out.println(sum[p]);
    }
 }

}