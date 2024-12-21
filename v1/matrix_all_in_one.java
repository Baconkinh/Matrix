package v1;

public class matrix_all_in_one {
    public static void main(String[] args) {
        int[][] matrixA = {{1, 2}, {3, 4}};
        int[][] matrixB = {{1, 2}, {3, 4}};
        int c = 2;

        
        System.out.println("Matrix A:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrixA[i][j] + " ");
            }
            System.out.println();
        }

        
        System.out.println("\nMatrix B:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrixB[i][j] + " ");
            }
            System.out.println();
        }

        //+
        System.out.println("\nA + B =");
        int[][] result = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nA + B =");
        int[][] result1 = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result1[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }
        //-
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        

    }
}
