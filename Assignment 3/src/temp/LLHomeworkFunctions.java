package temp;

public class LLHomeworkFunctions {

	static public void main(String [] args) {
		
		/* setting up linked list */
		LLNode<Integer> a1 = new LLNode<Integer>(8);
		LLNode<Integer> a2 = new LLNode<Integer>(6);
		a1.setLink(a2);
		LLNode<Integer> a3 = new LLNode<Integer>(9);
		a2.setLink(a3);
		
		LLNode<Integer> b1 = new LLNode<Integer>(3);
		LLNode<Integer> b2 = new LLNode<Integer>(6);
		b1.setLink(b2);
		LLNode<Integer> b3 = new LLNode<Integer>(9);
		b2.setLink(b3);
		LLNode<Integer> b4 = new LLNode<Integer>(10);
		b3.setLink(b4);

		System.out.println(equalLists(a1, b1));
	}
	
	/**
	 * @param <T>
	 * @param list1
	 * @param list2
	 * @return true if the lists are equal.  Assume both lists terminate.
	 */
	
	static public <T> boolean equalLists(LLNode<T> list1, LLNode<T> list2) {
		// TODO: Part 1 of this assignment is to implement this correctly.
		
		boolean isEqual = true;
		LLNode<T> head1 = list1;
		LLNode<T> head2 = list2;
		
		while(head1.getLink() != null && head2.getLink() != null){
			System.out.println("==============");
			if(head1.getInfo() != head2.getInfo()){
				isEqual = false;
			}
			System.out.printf("%d == %d\n", head1.getInfo(), head2.getInfo());
			System.out.println(isEqual);
			/*increment*/
			
			head1 = head1.getLink();
			head2 = head2.getLink();
			
			System.out.println("--------------");
			System.out.println("next h1: " + head1.getInfo());
			System.out.println("next h2: " + head2.getInfo());
		}
		
		if(head1.getLink() == null && head2.getLink() == null){
			if(head1.getInfo() != head2.getInfo()){
				isEqual = false;
			} 
		} else if (head1.getLink() == null || head2.getLink() == null){
			isEqual = false; //always, because only ONE of them is null. This means they're different sizes.
			//if both of them were null, the above condition catches it and deals with equality comparison
		}
		return isEqual;
	}
	
	/** Checks to see if the linked list stack can can be terminated, by checking the equality of references (logic explained more below)
	 * @param LLNode<T> the LLNode class type
	 * @param list      a node within the linked list
	 * @return true if the list eventually terminates, and false if the list points back at one of its
	 *  previous nodes.
	 */
	static public <T> boolean terminates(LLNode<T> list) {
		/* overarching logic: there is one 'slow' and one 'fast' reference to nodes within the linked list.
		 * The 'fast' reference is incremented (using getLink()) twice as fast as the 'slow' reference.
		 * If the 'fast' and 'slow' ever overlap, this means the list does not terminate and is recursive.
		 */
		boolean canBeTerminated = true;
		LLNode<Integer> slow = (LLNode<Integer>) list; //both start of referencing the top of the list
		LLNode<Integer> fast = (LLNode<Integer>) list;
		
		while(canBeTerminated && fast.getLink() != null && fast.getLink().getLink() != null){ //last two conditions makes sure the while loop ends if the list in question can be terminated
//			System.out.printf("s: %d | f: %d\n" , slow.getInfo(), fast.getInfo()); //just for debugging and testing if you want
			slow = slow.getLink();
			fast = fast.getLink().getLink();
			if(slow == fast)
				canBeTerminated = false;
		}
		return canBeTerminated;
	}

}
