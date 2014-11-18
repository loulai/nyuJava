package hw8matrixs;

public class Matrix {
	
	public static void main(String[] args){
		Matrix myMatrix = new Matrix(2,3);
		System.out.println("Rows    : " + myMatrix.getNumOfRows());
		System.out.println("Columns : " + myMatrix.getNumOfColumns());
		System.out.print(myMatrix);
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
	
	public int[][]
	
	
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


