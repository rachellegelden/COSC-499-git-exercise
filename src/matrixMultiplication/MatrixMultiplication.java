package matrixMultiplication;

public class MatrixMultiplication {
	
	// function to multiply the matrices
	// function to determine if two matrices can be multiplied by each other
	
	public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
		int matrix1Rows = matrix1.length;
		int matrix1Columns = matrix1[0].length;	// assumes matrix1Columns.length = matrix2Rows.length
		
		int matrix2Columns = matrix2[0].length;
		
		// Resulting matrix has num rows of matrix1 and num columns of matrix2
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
	}
	
	public static void printMatrix(int [][] matrix) {
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
	
	public static void main (String[] args) {
		// Sample data
		int [][] matrix1 = {{1, 2,3}, {4,5,6}};
		int [][] matrix2 = {{7, 8}, {9, 10}, {11, 12}};
		
		int [][] multipliedMatrix = multiplyMatrices(matrix1, matrix2);

		printMatrix(multipliedMatrix);
		
	}

}
