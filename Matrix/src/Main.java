import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		System.out.println("Size of your array? (row by column): ");
		Scanner input = new Scanner(System.in);
		int row = input.nextInt();
		int column = input.nextInt();

		int[][] myMatrix = generateMatrix(row, column);
		
		printMatrix(myMatrix);
		
	}
	
	public static int[][] generateMatrix(int row, int column) {
		int[][] matrix = new int[row][column];
		return matrix;
	}
	
	public static void printMatrix(int[][] matrix){
		int rowSize = matrix.length; //counts the number of rows
		int columnSize = matrix[0].length; // counts number of columns
		for(int i = 0; i < 2; i++) {
			for(int j = 0; i< 2; j++) {
				System.out.print(matrix[i][j]);
				}
			}
		}
	}

