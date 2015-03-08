package temp;

public class TerminatesTest {

	public static void main(String[] args) {
		
//		LinkedStack<Integer> linkedStack = new LinkedStack<Integer>();
//		linkedStack.push(1);
//		linkedStack.push(2);
//		linkedStack.push(3);
//		System.out.println(linkedStack.top());
		
		/* setting up linked lists */
		 /* list can be terminated */
		LLNode<Integer> a1 = new LLNode<Integer>(1);
		LLNode<Integer> a2 = new LLNode<Integer>(2);
		a2.setLink(a1);
		LLNode<Integer> a3 = new LLNode<Integer>(3);
		a3.setLink(a2);
		
		/* list can't be terminated (recursive) */
		LLNode<Integer> b1 = new LLNode<Integer>(1);
		LLNode<Integer> b2 = new LLNode<Integer>(2);
		b2.setLink(b1);
		LLNode<Integer> b3 = new LLNode<Integer>(3);
		b3.setLink(b2);
		b1.setLink(b3);
		
		System.out.println(b1.getLink().getInfo());
		
	}
	
	/**
	 * @param <T>
	 * @param list1
	 * @return true if the list eventually terminates, and false if the list points back at one of it's
	 *  previous nodes.
	 */
	static public <T> boolean terminates(LLNode<T> list) {
		boolean canBeTerminated = true;
		LLNode<Integer> slow = list.getLink();
		LLNode<Integer> fast = list.getLink().getLink();
		
		while(canBeTerminated){
			
		}
		
		
		return canBeTerminated;
		
	}
	
}
