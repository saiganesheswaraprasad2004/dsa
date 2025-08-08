package Functions;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

// public class Prime {
//     public static void main(String[] args) {
//         System.out.println(isPrime1(11));
//     }
    
//     static boolean isPrime1(int n) {
//         if (n != 2 && n % 2 == 0)
//             return false;
//         if (n != 3 && n % 3 == 0)
//             return false;

//         for (int i = 5; i * i <= n; i += 6) {
//             if (n % i == 0 || n % (i + 2) == 0)
//                 return false;
//         }

//         return true;
//     }
// }

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        int n = 7;
        int count = 0;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }

    }
}
