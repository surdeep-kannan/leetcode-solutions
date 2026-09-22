// Solid Rectangle [Medium]
// https://www.geeksforgeeks.org/problems/solid-rectangle/

import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int cols = m;           // save original m to reset each row

        while (n != 0) {
            m = cols;            // reset m for this row
            while (m != 0) {
                System.out.print("* ");
                m--;              // move m toward 0
            }
            System.out.println("");
            n--;                  // move n toward 0
        }
    }
}