import BinaryHeap.UnderflowException;



public class AssignmentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	 public Double findClosest(TreeNode root, Object target) throws UnderflowException{
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
		    		//for all children of p of t
		    		//update distance => p.distance += q.distance
		    		//bheap.insert(p)
	    			return t.distance;
		    	}
		    	
		    	
	    	}
	    	
	    	return -1.0;
	    	
	    	
	    }

}
