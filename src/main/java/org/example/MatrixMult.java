package org.example;

public class MatrixMult {
    static void multiplication(int a[][],int b[][])
    {  int[][] c= new int[a.length][b[0].length];
        for(int i=0;i<a.length; i++)
        {
            for(int j=0; j<b[i].length; j++)
            {   c[i][j]=0;
                for(int k=0;k<a.length; k++)
                {
                    c[i][j]+= a[i][k]*b[k][j];
                }

            }
        }
        for(int[] row : c) {
            System.out.println();
            for (int i : row)
                System.out.print(i + " ");
        }

    }


    public static void main(String[] args) {


    int[][] a ={{1,1,1},
                {2,2,2},
                {3,3,3}};
        int[][] b ={{4,4},
                {5,5},
                {6,6}};

        multiplication(a,b);


    }


}
