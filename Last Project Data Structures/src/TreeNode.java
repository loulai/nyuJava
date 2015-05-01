
public class TreeNode<T> implements Comparable{
	public T element;
	public Double distance;
	public TreeNode<T> left, right;
	
	public TreeNode(T letter, Double distance){
		this.element = letter;
		this.distance = distance; //distance of this new TreeNode from parent
		this.left = null;
		this.right = null;
	}
	
	public String toString(){
		String s = "<" + element + ", " + distance + ">";
		return s;
	}
	
	@Override
	public int compareTo(Object object){
		TreeNode t = (TreeNode) object;
		return this.distance.compareTo(t.distance);
	}
	

	
}
