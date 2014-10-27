import java.util.Scanner;

/**
 *Created on : October 21st 2014
 *Description: Program creates a matrix (i.e. a 2D array) with row and column size specifications from the user, then applies transformations to the
 *             matrix according to what the user chooses from the given menu.
 *@author Lou Lai
 */

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Size of your array? (row by column): ");
		Scanner input = new Scanner(System.in);
		int row = input.nextInt();
		int column = input.nextInt();
		
		//checking for all conditions: rows && columns are between 1 and 5 inclusive
		if(row < 1){
			System.out.println("===You shall not pass===\n===Have you ever heard of negative or 0 rows? I don't think so. Try again.===");
		} else if(column < 1) {
			System.out.println("===You trolling?===\n===Columns can't be negative or 0, duh. Try again.===");
		} else if(row > 5){
			System.out.println("===Row too large! Must be equal or less than 5. Try again please.===");
		} else if (column > 5){
			System.out.println("===Column too large! Must be equal or less than 5. Try again please.===");
		} else { //at this point, code only runs if all conditions of matrix size are met
			int[][] myMatrix = generateMatrix(row, column); //generates a matrix
			printMatrix(myMatrix); //prints matrix
			boolean again = true;  //used for the while loop for menu selection below
			
			/* menu selection part begins */
			while(again){
			System.out.println("\n======  Menu  ======");
			System.out.println("---(H) horizontal flip---");
			System.out.println("---(V) vertical flip---");
			System.out.println("---(T) transpose---");
			System.out.println("---(R) row maximum---");
			System.out.println("---(C) column sum---");
			System.out.println("---(P) print original---");
			System.out.println("---(Q) quit---");
			
			Scanner menuInput = new Scanner(System.in);
			String choice = menuInput.next().toUpperCase();
				
				//calling the corresponding method for each case of user input
				switch(choice){
				case "Q": again = false;
						  break;
				case "H": printMatrix(horizontalFlip(myMatrix));
					      break;
				case "V": printMatrix(verticalFlip(myMatrix));
						  break;
				case "T": printMatrix(transpose(myMatrix));
				          break;
				case "R": printArray(rowMax(myMatrix));
				          break;
				case "C": printArray(columnSum(myMatrix));
		                  break;
				case "P": printMatrix(myMatrix);
	                      break;   
	            default: System.out.println("---Invalid choice. Choose wisely young elf. Here's the menu again.--- ");
	            	     break;
				} 
			}
			/* menu selection part ends */
		}
	
	}
	
	/**generates a two dimensional array from the user input of the size of row(s) and column(s)
	 * @param row    integer number of desired rows specified in the matrix
	 * @param column integer number of desired columns specified in the matrix
	 * @return       a two dimensional integer array which is the size of the specified rows and columns
	 */
	public static int[][] generateMatrix(int row, int column) {
		int[][] matrix = new int[row][column];
		for(int i = 0; i < row; i++) {
			for(int j = 0; j< column; j++) {
				matrix[i][j] = (int) (Math.random() * 21) - 10; // first generates numbers 0 to 20, then subtracts by 10 to get range of -10 to 10
				}
			}
		return matrix;
	}
	
	/** prints out a two-dimensional array, formatted to look like a matrix
	 * @param matrix   a two-dimensional array (the matrix)
	 */
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
	
	/** prints out a one-dimensional array, needed for rowMax() and columnSum() methods
	 * @param maxes   a two-dimensional array (the matrix)
	 */
	public static void printArray(int[] array){
		for(int i = 0; i < array.length; i++){
			System.out.printf("%5d", array[i]);
		}
	}
	
	/** takes a matrix and returns a new matrix whose rows are created by reversing each row of the original matrix, without modifying it
	 * @param matrix a two-dimensional array (the matrix)
	 * @return       the two-dimensional array that has been flipped horizontally
	 */
	public static int[][] horizontalFlip(int[][] matrix) {
		int[][] newMatrix = new int[matrix.length][matrix[0].length]; //generating a two dimensional array filled with zeros that is the same size as original matrix
		int columnSize = matrix[0].length;         //the number of columns, (i.e the number of elements in the inner array)
		for(int i = 0; i < matrix.length; i++) { 
			for(int j = 0; j < columnSize/2; j++){ //columnSize in half because it only needs to 'swap' half size.
				int temp = matrix[i][j];           //temporarily storing of the foremost element of the array
				newMatrix[i][j] = matrix[i][columnSize-1-j]; //replacing the foremost element to take the value of the last element
				newMatrix[i][columnSize-1-j] = temp; //replacing the last element to take the value of temp (which is the foremost element)
			}
		}
		return newMatrix;
	}
	
	/** takes a matrix and returns a new matrix whose rows are created by reversing each column of the original matrix, without modifying it
	 * @param matrix a two-dimensional array (the matrix)
	 * @return       the two-dimensional array that has been flipped vertically
	 */
	public static int[][] verticalFlip(int[][] matrix) { //logic is the same as method horizontalFlip(), except for column and rows are switched
		int[][] newMatrix = new int[matrix.length][matrix[0].length];
		int rowSize = matrix.length;
		for(int i = 0; i < matrix[0].length; i++) {
			for(int j = 0; j < rowSize/2; j++){
				int temp = matrix[j][i]; 
				newMatrix[j][i] = matrix[rowSize-j-1][i];
				newMatrix[rowSize-j-1][i]= temp;
			}
		}
		return newMatrix;
	}
	
	/**takes a matrix and returns a new matrix whose columns are the rows (and vice versa) of the original matrix, without modification
	 * @param matrix a two-dimensional array (the matrix)
	 * @return       a two-dimensional array that has been transposed
	 */
	public static int[][] transpose(int[][] matrix){
		int[][] transposed = new int[matrix[0].length][matrix.length]; //setting up new 2D array, with rows as columns instead and vice versa
		for(int i = 0; i< matrix.length; i++){                         //like everything else, outside loop is rows and inside is columns 
			for(int j=0; j< matrix[0].length; j++){        
				transposed[j][i] = matrix[i][j];         //going down by column, making the column values (going down) equal the row values (going across)
			}
		}
		return transposed;
	}
	
	/** returns an array of numbers such that the value at index i is the largest element of the i'th row in the passed matrix
	 * @param matrix  a two-dimensional array (the matrix)
	 * @return		  a one-dimensional array that contains each row's maximum number
	 */
	public static int[] rowMax(int[][] matrix) {
		int[] arrayOfMaxes = new int[matrix.length]; //creates a 1D array the size of the number of rows in the matrix
		int max = matrix[0][0];                      //assigns the max to the first element in the first row & column
		for(int i = 0; i < matrix.length; i++) {       //runs for #rows times
			for(int j = 0; j < matrix[0].length; j++){ //runs #columns times
				if(matrix[i][j] > max){                //compares each number with max
					max = matrix[i][j];		           //if the number is smaller, it takes the places of max
					arrayOfMaxes[i] = max;             //slotting in the determined max of the row into the arrayOfMaxes
				} else{
					arrayOfMaxes[i] = max;
				}
			}  
			max = matrix[i][0];                      //resetting max to the first number of the row (for each loop)
		}
		return arrayOfMaxes;
	}
	
	/** returns an array of numbers such that the value at index i is the sum of all elements of the i'th column of the passed matrix
	 * @param matrix   a two-dimensional array (the matrix)
	 * @return         a two-dimensional array that contains the sum of each individual column
	 */
	public static int[] columnSum(int[][] matrix) { 
		int[]arrayOfSums= new int[matrix[0].length]; //creates a 1D array the size of #column in the matrix
		/* idea is that the loop will look at each column and go 'down' (i.e. counter for rows change while column stays the same),
		 * which explains why the loop runs #column times first and not #row times like the other methods*/
		for(int i = 0; i < matrix[0].length; i++){     //runs #column times
			int sum = 0;                               //sets the initial sum of each column to 0
			for(int j = 0; j < matrix.length; j++){     //runs #row times
				sum = sum + matrix[j][i];               //sums the numbers that are positioned in the same column
				arrayOfSums[i] = sum;                   //slots the end sum into the array of sums
			}
		}
		return arrayOfSums;
	}
	
}

