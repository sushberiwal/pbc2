import java.util.*;
            
            public class Main{
            
            public static void main(String[] args) {
                Scanner scn = new Scanner(System.in);
            
                 int n = scn.nextInt();
                 int spaces= n-1;
                 int stars = 1;
                 
                 for(int i=1 ; i<=n ; i++){
                     //spaces loop
                     for(int sp=1 ; sp<=spaces ; sp++){
                         System.out.print("\t");
                     }
                     //star loop
                     for(int st=1 ; st<=stars ; st++){
                         System.out.print("*\t");
                     }
                     //update values
                     spaces--;
                     stars++;
                     //enter
                     System.out.println();
                 }
            
             }
            }