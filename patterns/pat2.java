import java.util.*;
      
      public class Main{
      
      public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);
      
           int n = scn.nextInt();
           int stars = n;
           
           for(int i=1 ; i<=n ; i++){
               //stars
               for(int st = 1 ; st<=stars ; st++){
                   System.out.print("*\t");
               }
               //update
               stars--;
               System.out.println();
           }
      
       }
      }