package Ornekler;

public class TranspozMatris {

    public static void main(String[] args) {
        int[][] matrix1 = {
                {2, 3, 4},
                {5, 6, 4}
        };

        int[][] matrix2 = {
                {1, 2, 3},
                {4, 5, 6}
        };

        System.out.println("Matris 1:");
        printMatrix(matrix1);
        System.out.println("Transpoze Matris 1:");
        printMatrix(transpose(matrix1));

        System.out.println("\nMatris 2:");
        printMatrix(matrix2);
        System.out.println("Transpoze Matris 2:");
        printMatrix(transpose(matrix2));
    }

    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] transposed = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }

        return transposed;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}

