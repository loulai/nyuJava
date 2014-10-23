import java.util.Scanner;


public class Main {

	public static void main(String[] args){
		int[][] myMatrix = {{0,1,2},{3,4,5},{6,7,8}};
		System.out.println(java.util.Arrays.deepToString(myMatrix));
		printMatrix(myMatrix);
	}
	
	public static void printMatrix(int[][] matrix) {
		int rowSize = matrix.length;
		int columnSize = matrix[0].length;
		for(int i = 0; i < rowSize; i++ ) {
			for(int j = 0; i< columnSize; j++) {
				System.out.println(matrix[i][j]);
			}
		}
	}
	
	
	
}

