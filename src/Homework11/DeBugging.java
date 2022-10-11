package Homework11;
import java.util.Scanner;

public class DeBugging {

        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.print("Enter the first number : ");
            int start = s.nextInt();
            System.out.print("Enter the second number : ");
            int end = s.nextInt();
            System.out.println("List of prime numbers between " + start + " and " + end);
            for (int i = start; i <= end; i++) {
                if (isPrime(i )) {
                    System.out.println(i);
                }
            }
        }

        public static boolean isPrime(int n) {
            boolean is = true;
            if (n <= 1) {
                return true;
            }
            for (int i = 2; i < n; i ++) {
                if (n % i == 0) {
                    is = false;
                }
            }return is;
        }
    }

