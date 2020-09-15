package matrixMultiplication;

public class MatrixMultiplication {
	
	private static boolean validateMatricesForMultiplication(int[][] matrix1, int[][] matrix2) {
		
		// number of columns in first matrix is equal to number of rows in the second matrix
		int matrix1ColumnsLength = matrix1[0].length;
		int matrix2RowsLength = matrix2.length;
		
		return matrix1ColumnsLength == matrix2RowsLength;
	}
	
	public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
		if (validateMatricesForMultiplication(matrix1, matrix2)) {
			int matrix1Rows = matrix1.length;
			int matrix1Columns = matrix1[0].length;
			
			int matrix2Columns = matrix2[0].length;
			
			int[][] solution = new int [matrix1Rows][matrix2Columns];
			
			for (int i = 0; i < solution.length; i++) {
				for (int j = 0; j < solution[0].length; j++) {
					// Note matrix1Columns.length == matrix2Columns.length
					for (int k = 0; k < matrix1Columns; k++) {
						solution[i][j] += matrix1[i][k] * matrix2[k][j];
					}
				}
			}
			
			return solution;
		} else {
			return new int[0][0];
		}
		
	}
	
	public static void printMatrix(int [][] matrix) {
		if (matrix.length == 0) {
			System.out.println("unable to perform matrix multiplication");
		} else {
			String matrixAsString =  "";
			for (int i = 0; i < matrix.length; i++) {
				String row = "";
				for (int j = 0; j < matrix[0].length; j++) {
					row += matrix[i][j] + ", ";
				}
				row +="\n";
				matrixAsString += row;
			}
			System.out.println(matrixAsString);
		}
	}
	
	public static void main(String[] args) {
		int [][] matrix1 = {{1, 2,3}, {4,5,6}};
		int [][] matrix2 = {{7, 8}, {9, 10}, {11, 12}};

		int [][] matrix3 = {{3, 3}, {4, 4}};
		int [][] matrix4 = {{5, 5}, {6, 6}};

		int [][] matrix5 = {{ 1, 1}};
		int [][] matrix6 = {{3}, {4}, {5}};
		
		int [][] multipliedMatrix1 = multiplyMatrices(matrix1, matrix2);
		int [][] multipliedMatrix2 = multiplyMatrices(matrix3, matrix4);
		int [][] multipliedMatrix3 = multiplyMatrices(matrix5, matrix6);

		// print matrices
		printMatrix(multipliedMatrix1);
		printMatrix(multipliedMatrix2);
		printMatrix(multipliedMatrix3);
	}

}
