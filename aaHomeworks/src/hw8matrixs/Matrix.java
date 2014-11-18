package hw8matrixs;

public class Matrix {
	
	public static void main(String[] args){
		Matrix myMatrix = new Matrix(2,3);
		System.out.println("Rows    : " + myMatrix.getNumOfRows());
		System.out.println("Columns : " + myMatrix.getNumOfColumns());
		System.out.print(myMatrix);
		
		//testing and printing horizontal flip
		System.out.println();
		System.out.print(myMatrix.horizontalFlip());
	}
	

	private int numOfRows;
	private int numOfColumns;
	private int[][] rawMatrix;
	
	public Matrix(int row, int column){
		this.numOfRows = row;
		this.numOfColumns = column;
		int[][] matrix = new int[row][column];
		for(int i = 0; i < row; i++) {
			for(int j = 0; j< column; j++) {
				matrix[i][j] = (int) (Math.random() * 21) - 10;
				}
			}
		this.rawMatrix = matrix;
	}
	
	public int getNumOfRows(){
		return numOfRows;
	}
	
	public int getNumOfColumns(){
		return numOfColumns;
	}
	
	
	/** takes a matrix and returns a new matrix whose rows are created by reversing each row of the original matrix, without modifying it
	 * @param matrix a two-dimensional array (the matrix)
	 * @return       the two-dimensional array that has been flipped horizontally
	 */
	public Matrix horizontalFlip() {
        int[][] newMatrix = new int[numOfRows][numOfColumns]; //generating a two dimensional array filled with zeros that is the same size as original matrix
		
		for(int i = 0; i < numOfRows; i++) { //outer runs #row times and inner runs #column times
			for(int k = 0; k < numOfColumns; k++){ //within a row, it's the last column that gets assigned a value first, because the equation (columnSize - 1 -j) is largest the first time the inner 
				newMatrix[i][numOfColumns - 1 -k] = rawMatrix[i][k];  //loop runs. e.g. [0][2], [0][1], [0][0] then outerloop runs again then it does the same thing
															     //but for the second row this time e.g. [1][2], [1][1], [1][2]
			}
		}
		rawMatrix = newMatrix; //assigning it so that the old matrix is actually changed
		return this; //returns the Matrix object
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		String myString = ""; //must have a value, even if null, to be properly initialized **WHY?
		for(int i = 0; i < numOfRows; i++){ //looping through #row times
			for(int k = 0; k < numOfColumns; k++){  //looping through #column times
				myString = myString + String.format("%4d |", rawMatrix[i][k]); //goes through each element of the inner array (i.e. each "column" for the row), and adds
				                                                               // it to the string
			}
		 myString = myString + "\n"; //adds line break after the end of each row's iteration, to make it look like a matrix
		}
		return myString;
	}

}

/** constructor with 2 params, row column
 * - fill with random generated numbers (1-10)
 * - 1-5 inclusive
 * - if < 0, then default to one
 * - if < 5, default to 5
 * - 
 * 
 * - getNumRows, getNumColumns
 * - all matrix methods
 * - toString()
 * - add(matrix) <so this is an instance method> return boolean
 * - multiply(3) <another instance method>
 */

/** DRIVER
 * - construct > 1) with valid 2)3) row/col too small 4)5) row/col too large
 * - all of which is proven my getnumrows/columns
 * - perform all matrix transformations
 * - perform invalid addtion <expect return false>
 * - perform correct multiplication <pos,neg,zero>
 * - 
 */


