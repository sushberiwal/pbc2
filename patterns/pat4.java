import java.util.*;
          
          public class Main{
          
          public static void main(String[] args) {
              Scanner scn = new Scanner(System.in);
              int n = scn.nextInt();
              int spaces=0;
              int stars =n;
              
              for(int i=1 ; i<=n ; i++){
                  
                  //spaces loop
                  for(int sp =1 ; sp<=spaces ; sp++){
                      System.out.print("\t");
                  }
                  
                  //stars loop
                  for(int sp =1 ; sp<=stars ; sp++){
                      System.out.print("*\t");
                  }
                  
                  //values update
                  spaces++;
                  stars--;
                  
                  System.out.println();
                  
              }
               
            
          
           }
          }