import java.util.*;
       
       public class Main{
       
       public static void main(String[] args) {
           Scanner scn = new Scanner(System.in);
       
            // write ur code here
            int n = scn.nextInt();
            int spaces=1;
            int stars = n/2 + 1;
            for(int i=1 ; i<=n ; i++){
                //stars loop
                for(int j=1 ; j<=stars ; j++){
                    System.out.print("*\t");
                }
                //spaces loop
                for(int j=1 ; j<=spaces ; j++){
                    System.out.print("\t");
                }
                //stars lopp
                for(int j=1 ; j<=stars ; j++){
                    System.out.print("*\t");
                }
                //values update
                
                if(i<=n/2){
                    stars--;
                    spaces+=2;
                }
                else{
                    stars++;
                    spaces-=2;
                }
                
                //enter
                System.out.println();
                
                
                
            }
       
        }
       }