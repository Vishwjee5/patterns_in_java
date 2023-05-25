// Write a program to print following patterns: 

//      *****
//       ****
//        ***
//         **
//          *

//          *
//         **
//        ***
//       ****
//      *****
//       ****
//        ***
//         **
//          *


public class patterns {
    public static void main(String[] args) {
        // Pattern 1
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= 5; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println(" ");

        // Pattern 2
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Pattern 3
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
