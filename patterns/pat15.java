import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int spaces = n / 2;
        int stars = 1;
        int val = 1;
        for (int i = 1; i <= n; i++) {
            //sapce loop
            for (int sp = 1; sp <= spaces; sp++) {
                System.out.print("\t");
            }
            int copy = val;
            //star loop
            for (int st = 1; st <= stars; st++) {
                System.out.print(copy + "\t");
                if(st <= stars/2){
                copy++;
                }
                else{
                    copy--;
                }
            }
            //update valyes
            if (i <= n / 2) {
                spaces--;
                stars += 2;
                val++;
            } else {
                spaces++;
                stars -= 2;
                val--;
            }
            //enter
            System.out.println();
        }

    }
}