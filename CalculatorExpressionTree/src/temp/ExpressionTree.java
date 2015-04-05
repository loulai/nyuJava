package temp;

public class ExpressionTree {
	
	public static void main(String[] args){
		String postfixExpression = "100 3 + 5 -";
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
				stack.push(new LLNode<String>(arr[i])); //makes new Node, with info as the integer (as a string)
				System.out.println(">> pushing in stack: " + stack.top().info);
			} else {
				LLNode<String> operatorNode = new LLNode<String>(arr[i]); //operator
				
				// right child
				LLNode<String> rightChild = stack.top();
				System.out.println("Right Child: " + rightChild.info);
				stack.pop();
				operatorNode.setRightChild(rightChild);
			
				//left child
				LLNode<String> leftChild = stack.top();
				System.out.println("Left Child: " + leftChild.info);
				stack.pop();
				operatorNode.setLeftChild(leftChild);
				
				stack.push(operatorNode);
			}
		}
		
		
		
	}

}
