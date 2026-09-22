// Reverse Coding [Medium]
// https://www.geeksforgeeks.org/problems/reverse-coding/

import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result=sum(n);
        System.out.print(result);
    }
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        return n+sum(n-1);
    }
}