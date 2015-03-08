package temp;

public class TerminatesTest {

	public static void main(String[] args) {
		LLNode<Integer> a1 = new LLNode<Integer>(1);
		LLNode<Integer> a2 = new LLNode<Integer>(2);
		a1.setLink(a2);
		LLNode<Integer> a3 = new LLNode<Integer>(3);
		a2.setLink(a3);
		a3.setLink(a1);
		
		System.out.println(a3.getLink());
	}
	
	/**
	 * @param <T>
	 * @param list1
	 * @return true if the list eventually terminates, and false if the list points back at one of it's
	 *  previous nodes.
	 */
	static public <T> boolean terminates(LLNode<T> list) {
		return true;
	}
	
}
