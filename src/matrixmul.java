import java.util.*;
public class matrixmul{
    public static void main(String[] args){
        int matrix1[][]= new int[4][4];
        int matrix2[][] = new int[4][4];
        int n=matrix1.length,m=matrix1[0].length;
        int n2=matrix2.length,m2=matrix2[0].length;
        int result[][] = new int[n][m2];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix1[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n2;i++){
            for(int j=0;j<m2;j++){
                matrix2[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix1[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<n2;i++){
            for(int j=0;j<m2;j++){
                System.out.print(matrix2[i][j]+" ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m2; j++) {
                for (int k = 0; k < m; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
    }
}