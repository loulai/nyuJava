import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		System.out.println("Size of your array? (row by column): ");
		Scanner input = new Scanner(System.in);
		int row = input.nextInt();
		int column = input.nextInt();
		
		if(row < 1){
			System.out.println("===You shall not pass===\n===Please input a positive number for the row==="); //need to break?
		} else if(column < 1) {
			System.out.println("===You trolling?===\n===Please input a positive number for the column===");
		}
		
		int[][] myMatrix = generateMatrix(row, column); //generateMatrix method called (see below)
		printMatrix(myMatrix); //printing (see below)

		boolean again = true;
		
		/* menu selection part begins */
		while(again){
		System.out.println("====Menu====");
		System.out.println("---(H) horizontal flip---");
		System.out.println("---(V) vertical flip---");
		
		Scanner menuInput = new Scanner(System.in);
		String choice = menuInput.next().toUpperCase();

			if(choice.equals("Q")){
				again = false;
			} else if (choice.equals("H")) {
				int[][] hFlippedMatrix = horizontalFlip(myMatrix);
				printMatrix(hFlippedMatrix);
			}
		}

		/* menu selection part ends */
		
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
				System.out.printf("%4d", matrix[i][j]); 
				}
			System.out.println(); //added line break at the end of each row
			}
		}
	
	public static int[][] horizontalFlip(int[][] matrix) {
		int columnSize = matrix[0].length;
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < columnSize/2; j++){
				int temp = matrix[i][j]; //temporarily storing of the foremost element of the array
				matrix[i][j] = matrix[i][columnSize-1-j]; //replacing the foremost element to take the value of the last element
				matrix[i][columnSize-1-j] = temp; //replacing the last element to take the value of temp (wthich is the foremost element)
			}
		}
		return matrix;
	}
	}

