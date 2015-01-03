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
	
	public static int[][] horizontalFlip(int[][] matrix){
		int[][] hflipped = new int[matrix.length][matrix[0].length];
		
		for(int r = 0; r < matrix.length; r++){
			for(int c = 0; c < matrix[0].length; c++){
				hflipped[r][c] = matrix[r][matrix[0].length - c - 1]; //e.g. if each 'row' has 5 columns, for first row and col, hflipped[0][0] gets matrix[0][5 - 0 - 1]
			}
		}
		
		return hflipped;
		
	}
	
	public static int[][] transpose(int[][] matrix){
		return matrix;
	}
	
	

}
