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
		
		ArrayStack<LLNode<String>> stack = new ArrayStack<LLNode<String>>(); //String because never needs to be evaluated (for this assignment)
		
		for (int i = 0; i < arr.length; i++){
			if(arr[i].matches("^-?\\d+$")){ //means if it's a digit
				stack.push(new LLNode<String>(arr[i])); //makes new Node, with info as integer
			} else {
				LLNode<String> operatorNode = new LLNode<String>(arr[i]);
				LLNode<String> rightChild = stack.top();
				
			}
		}
		
		
		
	}

}
