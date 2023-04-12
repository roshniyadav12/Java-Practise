import java.util.Scanner;
class MatrixMultiplication{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of rows in matA :");
        int row1=sc.nextInt();
        System.out.print("Enter no. of columns in matA :");
        int col1=sc.nextInt();
        System.out.print("Enter no. of rows in matB");
        int row2=sc.nextInt();
        System.out.print("Enter no. of columns in matB");
        int col2=sc.nextInt();

        int matA[][]=new int[row1][col1];
        int matB[][]=new int[row2][col2];
        if(col1==row2){
            System.out.println("Enter Elements of matrix A :");
        for(int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
                matA[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter Elements of matrix B :");
        for(int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
                matB[i][j]=sc.nextInt();
            }
        }
        int matC[][]=new int[row1][col1];
        for(int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
                matC[i][j]=matA[i][j] + matB[i][j];
                System.out.print(matC[i][j]+" ");
            }System.out.println(" ");
        }

    }
    }
}