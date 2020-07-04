import java.util.*;
      
      public class Main{
      
      public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);
      
           // write ur code here
           int n = scn.nextInt();
           int ospaces = n/2;
           int ispaces = -1;
           
           for(int i=1 ; i<=n ; i++){
               
               //osapces loop
               for(int sp = 1 ; sp<=ospaces ; sp++){
                   System.out.print("\t");
               }
               //star
               System.out.print("*\t");
               
               //ispaces loop
               for(int sp = 1 ; sp<=ispaces ; sp++){
                   System.out.print("\t");
               }
               //star
               if(i>1 && i<n)
               System.out.print("*\t");
               
               //values update
               if(i<=n/2){
                   ospaces--;
                   ispaces+=2;
               }
               else{
                   ospaces++;
                   ispaces-=2;
               }
               System.out.println();
           }
           
      
       }
      }