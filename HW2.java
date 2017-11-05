import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int y = scn.nextInt();
        if ( y % 4 == 0) {
            System.out.println("Bissextile Year");
        }
        else if (y%4 != 0 && y%100 != 0) {
            System.out.println("Common Year");

        }
    }
}
//西元年份除以4不可整除，為平年。
//西元年份除以4可整除，且除以100不可整除，為閏年。
//西元年份除以100可整除，且除以400不可整除，為平年
// 西元年份除以400可整除，為閏年。