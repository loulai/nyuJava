import BinaryHeap.UnderflowException;



public class AssignmentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	public Double findClosest(TreeNode root, Object target) {
	    	BinaryHeap minheap = new BinaryHeap();
	    	minheap.insert(root);
	    	TreeNode<Double> t;
	  
	    	while(!minheap.isEmpty()){
	    		
	    		t = (TreeNode) minheap.deleteMin();
	    		
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
	
	

}
