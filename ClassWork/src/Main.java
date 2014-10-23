import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		int[][] myMatrix = {{2,3,1,5},{7,-10,-1,4},{0,0,10,6},{-9,6,2,3}};
		printMatrix(myMatrix);
		
		int[][] maxes = rowMax(myMatrix);
		System.out.println();
		rowMax();
	}
	
	public static void printMatrix(int[][] matrix){
		int rowSize = matrix.length;       //counts the number of rows
		int columnSize = matrix[0].length; //counts number of columns
		for(int i = 0; i < rowSize; i++) { //outer loop runs 'rowSize' times
			for(int j = 0; j< columnSize; j++) { //inner loop runs 'columnSize' times
				System.out.printf("%4d", matrix[i][j]); 
				}
			System.out.println(); //added line break at the end of each row
			}
		}
	
	public static void transpose(int[][] matrix){
		int[][] transposed = new int[matrix[0].length][matrix.length]; //setting up new 2D array, with rows as columns instead and vice versa
		for(int i = 0; i< matrix.length; i++){                         
			for(int j=0; j< matrix[0].length; j++){        
				matrix[j][i] = matrix[i][j];         //going down by column, making the column values (going down) equal the row values (going across)
			}
		}
	}
}