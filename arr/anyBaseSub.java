import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getDifference(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getDifference(int b, int n1, int n2){
       int ans =0;
       int p = 1;
       int carry = 0;
       while( n2 != 0){
           int d2 = n2%10;
           n2 = n2/10;
           int d1 = n1%10;
           n1 = n1/10;
           
           int diff = d2 - d1 - carry;
           if(diff < 0){
               diff += b;
               carry = 1;
           }
           else{
               carry = 0;
           }
           ans += diff * p;
           p = p*10;
       }
       return ans;
   }
  
  }