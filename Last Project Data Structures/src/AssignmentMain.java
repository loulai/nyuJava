import java.util.LinkedList;
import java.util.Scanner;



public class AssignmentMain {

	public static void main(String[] args) throws BinaryHeap.UnderflowException {
		Scanner input = new Scanner(System.in);
		System.out.println("hello");
		
		
		TreeNode root = stringInputToTree(input.nextLine());
	
		printBinaryTree(root, 0);
		
		try {
			System.out.println("the closest path is: " + findClosest(root, "*"));
		} catch (UnderflowException e) {
			e.printStackTrace();
		}
		
//		while(input.hasNext("[^()]*")){
//			System.out.println(input.next());
//		}
		
//		if (input.hasNext("[^(]")){
//			System.out.println("whoooo");
//			System.out.println(input.next());
//		}
		
//		while(input.hasNext()){
//			System.out.println("==inif");
//			System.out.printf("Element: %s, Distance: %.1f\n", input.next(), input.nextDouble());
//		}
	}
	
	public static Double findClosest(TreeNode root, Object target) throws BinaryHeap.UnderflowException {
	    	BinaryHeap<TreeNode<String>> minheap = new BinaryHeap<TreeNode<String>>();
	    	minheap.insert(root);
	    	TreeNode<String> t;
	  
	    	while(!minheap.isEmpty()){
	    		
	    		t = minheap.deleteMin();
	    		
	    		if(t != null && !t.element.equals(target)){
	    			if(t.left!=null){
	    				t.left.distance += t.distance;
	    				minheap.insert(t.left);
	    			}
	    			if(t.right!=null){
	    				t.right.distance += t.distance;
	    				minheap.insert(t.right);
	    			}
	    		return t.distance;
		    	} //this if loop ends if the element is not found. If the element was found, with min value, then it would've been returned
	    	}
	    	return -1.0;
	  }
	
	
	
	public static TreeNode stringInputToTree(String stringInput) {
		 ArrayStack<TreeNode> stack = new ArrayStack<TreeNode>();
		 Scanner tokenizer = new Scanner(stringInput);
		 while(tokenizer.hasNext()){
			 if(tokenizer.hasNext("[^()]")){ //if is is anything other than "(" or ")"
				 TreeNode<String> treeNode = new TreeNode<String>(tokenizer.next(), tokenizer.nextDouble());
				 System.out.println("Pushing in : " + treeNode);
				 stack.push(treeNode);
			 } else if (tokenizer.hasNext("[(]")){
				 System.out.println("(");
				 tokenizer.next();
			 } else {
				 tokenizer.next();
				 System.out.println(")");
				 TreeNode rightChild = stack.top();
				 System.out.println("Popping: " + rightChild);
				 stack.pop();
				 
				 TreeNode leftChild = stack.top();
				 System.out.println("Popping: " + leftChild);
				 stack.pop();
				 
				 stack.top().setRightChild(rightChild);
				 stack.top().setLeftChild(leftChild);
				 System.out.println("parent: " + stack.top());
			 }
		 }
		 return stack.top();
	}

	/**extra method, for some fun
	 * prints out the tree in a visual format, used when debugging
	**/
	public static void printBinaryTree(TreeNode root, int level){
	    if(root==null)
	         return;
	    printBinaryTree(root.right, level+1);
	    if(level!=0){
	        for(int i=0;i<level-1;i++)
	            System.out.print("|\t");
	            System.out.println("|-------"+root.element);
	    }
	    else
	        System.out.println(root.element);
	    printBinaryTree(root.left, level+1);
	}    

}
