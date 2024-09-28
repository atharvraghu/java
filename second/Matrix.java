package second;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        int m,n;
        Scanner in=new Scanner(System.in);
        System.out.println("enter the required length for array");
        m=in.nextInt();
        n=in.nextInt();
        int[][] arr=new int[m][n];
        System.out.println("ENTER REQUIRED LENGTH FOR 2ND ARRAY");
        int j=in.nextInt();
        int k=in.nextInt();
        int[][] array=new int[j][k];
        System.out.println("enter elements for 1st array");
        for (int i = 0; i < m; i++) {
            for (int l=0;l<n;l++){
                arr[i][l]=in.nextInt();
            }
        }
        System.out.println("now enter elements for 2nd array");
        for (int i = 0; i < m; i++) {
            for (int o=0;o<n;o++){
                array[i][o]=in.nextInt();
            }
        }
    }

}
