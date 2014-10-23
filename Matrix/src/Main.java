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
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j< column; j++) {
				matrix[i][j] = (int) (Math.random() * 21) - 10; // first generates numbers 0 to 20, then subtracts by 10 to get range of -10 to 10
				}
			}
		return matrix;
	}
	
	public static void printMatrix(int[][] matrix){
		int rowSize = matrix.length;       //counts the number of rows
		int columnSize = matrix[0].length; //counts number of columns
		for(int i = 0; i < rowSize; i++) { //outer loop runs 'rowSize' times
			for(int j = 0; j< columnSize; j++) { //inner loop runs 'columnSize' times
				System.out.printf("%3d", matrix[i][j]); 
				}
			System.out.println(); //added line break at the end of each row
			}
		}
	}

