package Programs;

import java.util.Scanner;

public class PrimeCheckEg {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the number of test cases: ");
        int t = scn.nextInt();  
        for (int i = 0; i < t; i++) {
            System.out.print("Enter the number: ");
            int n = scn.nextInt();  

            boolean isPrime = true;

            for (int div = 2; div * div <= n; div++) {
                if (n % div == 0) {  
                    isPrime = false;
                    break;  
                }
            }

            if (isPrime && n > 1) {
                System.out.println(n + ": Prime");
            } else {
                System.out.println(n + ": Not Prime");
            }
        }
    }
}
