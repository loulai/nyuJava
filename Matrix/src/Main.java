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
		System.out.println("\n======  Menu  ======");
		System.out.println("---(H) horizontal flip---");
		System.out.println("---(V) vertical flip---");
		System.out.println("---(T) transpose---");
		System.out.println("---(M) row maximum---");
		
		
		Scanner menuInput = new Scanner(System.in);
		String choice = menuInput.next().toUpperCase();

			if(choice.equals("Q")){
				again = false;
			} else if(choice.equals("H")) {
				int[][] hFlippedMatrix = horizontalFlip(myMatrix);
				printMatrix(hFlippedMatrix);
			} else if(choice.equals("V")){
				int[][] vFlippedMatrix = verticalFlip(myMatrix);
				printMatrix(vFlippedMatrix);
			} else if(choice.equals("T")){
				int[][] transposed = transpose(myMatrix);
				printMatrix(transposed);
			}else if(choice.equals("M")){
				printMaxes(rowMax(myMatrix));
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
	
	/** prints out a one-dimensional array, needed for rowMax() method
	 * @param maxes   a two-dimensional array (the matrix)
	 */
	public static void printMaxes(int[] maxes){
		for(int i = 0; i < maxes.length; i++){
			System.out.printf("%5d", maxes[i]);
		}
	}
	
	/**
	 * @param matrix a two-dimensional array (the matrix)
	 * @return       the two-dimensional array that has been flipped horizontally
	 */
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
	
	/**
	 * @param matrix a two-dimensional array (the matrix)
	 * @return       the two-dimensional array that has been flipped vertically
	 */
	public static int[][] verticalFlip(int[][] matrix) {
		int howManyRows = matrix.length;
		for(int i = 0; i < matrix[0].length; i++) {
			for(int j = 0; j < howManyRows/2; j++){
				int temp = matrix[j][i]; //storing foremost element
				matrix[j][i] = matrix[howManyRows-j-1][i];
				matrix[howManyRows-j-1][i]= temp;
			}
		}
		return matrix;
	}
	
	public static int[][] transpose(int[][] matrix){
		int[][] transposed = new int[matrix[0].length][matrix.length]; //setting up new 2D array, with rows as columns instead and vice versa
		for(int i = 0; i< matrix.length; i++){                         
			for(int j=0; j< matrix[0].length; j++){        
				transposed[j][i] = matrix[i][j];         //going down by column, making the column values (going down) equal the row values (going across)
			}
		}
		return transposed;
	}
	
	/**
	 * @param matrix  a two-dimensional array (the matrix)
	 * @return		  a one-dimensional array that contains each row's maximum number
	 */
	public static int[] rowMax(int[][] matrix) {
		int[] arrayOfMaxes = new int[matrix.length]; //creates a 1D array the size of the number of rows in the matrix
		int max = matrix[0][0];                      //assigns the max to the first element in the first row & column
		for(int i = 0; i < matrix.length; i++) {     //runs for n #rows times
			for(int j = 0; j < matrix[0].length; j++){ //runs #columns times
				if(matrix[i][j] > max){        //compares each number with max
					max = matrix[i][j];		   //if the number is smaller, it takes the places of max
				}
			arrayOfMaxes[i] = max;                   //slotting in the determined max of the row into the arrayOfMaxes
			}
		}
		return arrayOfMaxes;
	}
	
	public static int[] columnSum(int[][] matrix) {
		int[] arrayOfMaxes = new int[matrix.length]; //creates a 1D array the size of the number of rows in the matrix
		int sum = matrix[0][0];                      //assigns the max to the first element in the first row & column
		for(int i = 0; i < matrix.length; i++) {     //runs for n #rows times
			for(int j = 0; j < matrix[0].length; j++){ //runs #columns times
				if(matrix[i][j] > max){        //compares each number with max
					max = matrix[i][j];		   //if the number is smaller, it takes the places of max
				}
			arrayOfMaxes[i] = max;                   //slotting in the determined max of the row into the arrayOfMaxes
			}
		}
		return arrayOfMaxes;
	}
	
}

