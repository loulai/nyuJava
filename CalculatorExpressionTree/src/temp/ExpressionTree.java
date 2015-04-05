package temp;

import java.util.Scanner;

public class ExpressionTree {
	
	LLNode<String> rootNode;
	
	public static void main(String[] args){
		boolean again = true;
		while(again){
			System.out.println("~ ~ ~ Type in prefix:");
			Scanner input = new Scanner(System.in);
			String originalInput = input.nextLine();
			Convertor convertor = new Convertor(originalInput);
			String postfixExpression = convertor.toPostFix();
			
			ExpressionTree ex = new ExpressionTree(postfixExpression);
			
			//asking for repeat or not
			System.out.println("\n=== Y for again, else program will terminate ===");
			Scanner input2 = new Scanner(System.in);
			again = false;
			if(input2.next().equalsIgnoreCase("Y")) again = true;
		}
		
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
		
		//set the expression 'tree'
		rootNode = stack.top();
		System.out.printf("%s, right: %s, left: %s", rootNode.getInfo(), rootNode.getRightChild().info, rootNode.getLeftChild().info);
		
		System.out.print("\n=== preorder  : ");
		preorder(rootNode);
		
		System.out.print("\n=== inorder   : ");
		inorder(rootNode);
		
		System.out.print("\n=== postorder : ");
		postorder(rootNode);
	}
	
	public static void preorder(LLNode<String> tree){
		if(tree == null) return;
		System.out.print(tree.info + " ");
		preorder(tree.getLeftChild());
		preorder(tree.getRightChild());
	}
	
	public static void inorder(LLNode<String> tree){
		if(tree == null) return;
		inorder(tree.getLeftChild());
		System.out.print(tree.info + " ");
		inorder(tree.getRightChild());
	}
	
	public static void postorder(LLNode<String> tree){
		if(tree == null) return;
		postorder(tree.getLeftChild());
		postorder(tree.getRightChild());
		System.out.print(tree.info + " ");
	}
	
	
	
}
