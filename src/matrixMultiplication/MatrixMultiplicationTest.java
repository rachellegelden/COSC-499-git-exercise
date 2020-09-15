package matrixMultiplication;

import static org.junit.Assert.*;

import org.junit.Test;

public class MatrixMultiplicationTest {
	
	@Test
	public void multiplyMatricesShouldMultiply2ValidMatricesCorrectly() {
		// expected result
		int[][] expectedMatrixProduct = { { 64, 89 } };
		
		// given
		int[][] matrix1 = {{ 1, 4, 6 }};
		int[][] matrix2 = {{ 2, 3 }, { 5, 8 }, { 7, 9 }};
		
		// when
		int[][] matrixProduct = MatrixMultiplication.multiplyMatrices(matrix1, matrix2);
		
		// then 
		assertArrayEquals(matrixProduct, expectedMatrixProduct);
	}
	
	@Test
	public void multiplyMatricesShouldNotMultiplyInvalidMatrices() {
		// expected result
		int[][] expectedMatrixProduct = new int[0][0];
		
		// given
		int[][] matrix1 = {{ 1, 4, 6 }};
		int[][] matrix2 = {{ 2, 3 }, { 5, 8 }, { 7, 9 }, {10, 11}};
		
		// when 
		int[][] matrixProduct = MatrixMultiplication.multiplyMatrices(matrix1, matrix2);
		
		// then 
		assertArrayEquals(matrixProduct, expectedMatrixProduct);
	}

}
