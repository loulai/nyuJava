package temp;

public class ExpressionTree {
	
	public static void main(String[] args){
		String postfixExpression = "5 8 100 * -";
		ExpressionTree ex = new ExpressionTree(postfixExpression);
	}
	
	public ExpressionTree(String postfixExpression){
		String[] arr = postfixExpression.split(" ");

		for (int i = 0; i < arr.length; i++){
			System.out.print(i + ". ");
			System.out.printf("%4s %b\n",arr[i], arr[i].matches("^-?\\d+$"));
		}
		
		
		
		
		
	}

}
