
   /*
    Assignment 9: Multithreading
    PAWAN KOSHTI
    125B1F079
    A2
*/
/*Design an application for performing matrix multiplication using multithreading to improve performance. 
Implement a matrix multiplication algorithm that divides the computation across multiple threads, with each thread 
responsible for computing a subset of the resulting matrix. [Use concept of exception handling in implementation] 
*/ 
import java.util.*;

public class assignment9 {

    public static void main(String[] args) throws InterruptedException {

        int matrix1[][] = new int[4][4];
        int matrix2[][] = new int[4][4];

        int n = matrix1.length, m = matrix1[0].length;
        int n2 = matrix2.length, m2 = matrix2[0].length;

        int result[][] = new int[n][m2];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter elements of Matrix 1:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of Matrix 2:");
        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < m2; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        // Create one thread for each row
        Thread threads[] = new Thread[n];

        for (int i = 0; i < n; i++) {
            final int row = i;

            threads[i] = new Thread(() -> {
                for (int j = 0; j < m2; j++) {
                    for (int k = 0; k < m; k++) {
                        result[row][j] +=
                            matrix1[row][k] * matrix2[k][j];
                    }
                }
            });

            threads[i].start();
        }

        // Wait for all threads to finish
        for (int i = 0; i < n; i++) {
            threads[i].join();
        }

        // Display result
        System.out.println("Resultant Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}

