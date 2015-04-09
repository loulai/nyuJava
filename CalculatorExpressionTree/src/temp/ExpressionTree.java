package temp;

import java.util.Scanner;

public class ExpressionTree {
	
	LLTreeNode<String> rootNode;
	
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
	
	public static void inOrder(LLTreeNode<String> tree){
		if(tree != null){
			if(tree.getInfo().matches("^-?\\d+$")){ //leaf
				System.out.print(tree.getInfo() + " ");
			} else {
				System.out.print("( ");
				inOrder(tree.getLeftChild());
				System.out.print(tree.getInfo() + " ");
				inOrder(tree.getRightChild());
				System.out.print(") ");
			}
		}
	}
	
	public ExpressionTree(String postfixExpression){
		String[] arr = postfixExpression.split(" ");
		
		ArrayStack<LLTreeNode<String>> stack = new ArrayStack<LLTreeNode<String>>(); //String because never needs to be evaluated (for this assignment)
		
		for (int i = 0; i < arr.length; i++){
			if(arr[i].matches("^-?\\d+$")){ //means if it's a digit
				stack.push(new LLTreeNode<String>(arr[i])); //makes new Node, with info as the integer (as a string)
				System.out.println(">> pushing in stack: " + stack.top().info);
			} else {
				LLTreeNode<String> operatorNode = new LLTreeNode<String>(arr[i]); //operator
				
				// right child
				LLTreeNode<String> rightChild = stack.top();
				System.out.println("Right Child: " + rightChild.info);
				stack.pop();
				operatorNode.setRightChild(rightChild);
			
				//left child
				LLTreeNode<String> leftChild = stack.top();
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
		inOrder(rootNode);
		
		System.out.print("\n=== postorder : ");
		postorder(rootNode);
	}
	
	public static void preorder(LLTreeNode<String> tree){
		if(tree == null) return;
		System.out.print(tree.info + " ");
		preorder(tree.getLeftChild());
		preorder(tree.getRightChild());
	}
	
	
	public static String inorder(LLTreeNode<String> tree){
		String expression = " ";
		if (tree.getLeftChild() != null) {
			expression = expression + inorder(tree.getLeftChild());
			expression = expression + tree.getInfo();
			expression = expression + inorder(tree.getRightChild());
		}
		return expression;
	}
	
	public static void postorder(LLTreeNode<String> tree){
		if(tree == null) return;
		postorder(tree.getLeftChild());
		postorder(tree.getRightChild());
		System.out.print(tree.info + " ");
	}
	
	/**
	 * @param tree  Node to be assessed 
	 * @return  int  either 0, 1, 2 or 3 depending on precedence of: (int) < ( + , - ) < ( * , / ) < ( ^ )
	 */
	public static int precedence(LLTreeNode<String> tree){
		String info = tree.getInfo();
		int precedence;
		if(info.matches("^-?\\d+$")){ //if its a number
			precedence = 0;
		} else {
			if (info.equals("+") || info.equals("-")) precedence = 1;
			else if (info.equals("*") || info.equals("/")) precedence = 2;
			else precedence = 3; //operator is ^ at this stage
		}
		return precedence;
	}
	
	
	
}
