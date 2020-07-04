import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        int spaces=n/2;
        int stars=1;
        
        for(int i=1 ; i<=n ; i++){
            
            //spaces
            for(int sp=1;sp<=spaces;sp++){
                System.out.print("\t");
            }
            
            //stars
            for(int sp=1;sp<=stars;sp++){
                System.out.print("*\t");
            }
            //values update
            if(i<=n/2){
                spaces--;
                stars+=2;
            }
            else{
                spaces++;
                stars-=2;
            }
            System.out.println();
            
        }

    }
}