import java.util.*;
      
      public class Main{
      
      public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);
      
           // write ur code here
           int n = scn.nextInt();
           int spaces = 2*n - 3;
           int stars = 1;
           int val =1;
           for(int i=1 ; i<=n ; i++){
               //stars loop
               for(int st =1 ; st<=stars ; st++){
                   System.out.print(val+"\t");
                   val++;
               }
               //space loop
               for(int sp=1 ; sp<=spaces ; sp++){
                   System.out.print("\t");
               }
               //stars loop
               if(i==n){
                   stars--;
                   val--;
               }
               for(int st =1 ; st<=stars ; st++){
                   val--;
                   System.out.print(val+"\t");
               }
               //update vakkues
               spaces -=2;
               stars++;
               System.out.println();
           }
       }
      }