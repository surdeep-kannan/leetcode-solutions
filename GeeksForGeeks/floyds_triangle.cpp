// Floyds Triangle [Medium]
// https://www.geeksforgeeks.org/problems/floyds-triangle/

import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // code here
        int c=1;
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print(c+" ");
                c++;
            }
            System.out.println("");
        }
    }
}