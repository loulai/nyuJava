import java.util.LinkedList;
import java.util.Scanner;



public class AssignmentMain {

	public static void main(String[] args) throws BinaryHeap.UnderflowException {
		Scanner input = new Scanner(System.in);
		System.out.println("hello");
		
		
		TreeNode root = stringInputToTree(input.nextLine());
		
		try {
			System.out.println("\nthe closest path to \"*\" is: " + findClosest(root, "*"));
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
	    		System.out.println(t);
	    		System.out.println(t.left);
	    		System.out.println(t.right);
	    		
	    		while(t != null && !t.element.equals(target)){
	    			
	    			if(t.left!=null){
//	    				System.out.println("before " + t.left);
	    				t.left.distance += t.distance;
//	    				System.out.println("after " + t.left);
	    				minheap.insert(t.left);
	    			}
	    			if(t.right!=null){
	    				t.right.distance += t.distance;
	    				minheap.insert(t.right);
	    			}
	    			t = minheap.deleteMin();
		    	} //this if loop ends if the element is not found. If the element was found, with min value, then it would've been returned
	    		return t.distance;
	    	}
	    	return -1.0;
	  }
	
	
	
	public static TreeNode stringInputToTree(String stringInput) {
		 ArrayStack<TreeNode> stack = new ArrayStack<TreeNode>();
		 Scanner tokenizer = new Scanner(stringInput);
		 while(tokenizer.hasNext()){
			 if(tokenizer.hasNext("[^()]")){ //if is is anything other than "(" or ")"
				 TreeNode<String> treeNode = new TreeNode<String>(tokenizer.next(), tokenizer.nextDouble());
				
				 stack.push(treeNode);
			 } else if (tokenizer.hasNext("[(]")){
			
				 tokenizer.next();
			 } else {
				 tokenizer.next();
				 TreeNode rightChild = stack.top();
				 stack.pop();
				 
				 TreeNode leftChild = stack.top();
				 stack.pop();
				 
				 stack.top().setRightChild(rightChild);
				 stack.top().setLeftChild(leftChild);
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
