package hw6;

public class Matrix {
	
	public static void main(String[] args){
		int[][] myMatrix = {{-1,2},{3,4},{5,6}};
		printMatrix(myMatrix);
	}
	
	public static void printMatrix(int[][] matrix){
		for(int r = 0; r < matrix.length; r++){ //run #row times
			for(int c = 0; c < matrix[0].length; c++){ //run #column times
				System.out.printf("[%3d  ]",matrix[r][c]);
			}
		System.out.println();
		}
	}

}
