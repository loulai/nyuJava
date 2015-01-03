package hw6;

public class Matrix {
	
	public static void main(String[] args){
		int[][] myMatrix = {{-1,2,5},{3,4,12},{5,6,99},{0,2,-6}};
		printMatrix(myMatrix);
		System.out.println("=========== horizontal flip:");
		printMatrix(horizontalFlip(myMatrix));
		System.out.println("=========== vertical flip:");
		printMatrix(verticalFlip(myMatrix));
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
		int[][] hFlipped = new int[matrix.length][matrix[0].length];
		
		for(int r = 0; r < matrix.length; r++){ //run #row times
			for(int c = 0; c < matrix[0].length; c++){ //run #column times
				hFlipped[r][c] = matrix[r][matrix[0].length - c - 1]; //e.g. if each 'row' has 5 columns, for first row and col, hflipped[0][0] gets matrix[0][5 - 0 - 1]
			}
		}
		return hFlipped;
	}
	
	public static int[][] verticalFlip(int[][] matrix){
		int[][] vFlipped = new int[matrix.length][matrix[0].length];
		for(int c = 0; c < matrix[0].length; c++){
			for(int r = 0; r < matrix.length; r++){ //because 'row' is the one changing #row times, and column stays the same
				vFlipped[r][c] = matrix[matrix.length - r - 1][c];
			}
		}
		return vFlipped;
	}
	
	public static int[][] transpose(int[][] matrix){
		return matrix;
	}
	
	

}
