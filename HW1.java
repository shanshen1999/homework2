import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int y = scn.nextInt();
        String str = "inside";
        double r = Math.sqrt ( (x-0) * (x-0) + (y-0) * (y-0) );
        if ( r > 100 ) {
            str = "outside"; }
        System.out.println(str);
        }
}

