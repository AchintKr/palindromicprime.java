import java.util.*;

public class palindrmicprimenew {
    public static int rev(int x) {
        int numrev = 0;
        while (x > 0) {
            numrev = numrev * 10 + (x % 10);
            x = x / 10;
        }
        return numrev;
    }

    public static boolean isprime(int x) {
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter any number want to check for palindromicprime");
        int num = ob.nextInt();
        if (isprime(num) && isprime(rev(num))) {
            System.out.println(num + " is a Palindromic Prime Number .");
        } else {
            System.out.println(num + " is not a Palindromic Prime Number .");
        }
        ob.close();
    }
}
