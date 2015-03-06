package temp;

public class LLHomeworkFunctions {

	static public void main(String [] args) {
		
		LLNode<Integer> a1 = new LLNode<Integer>(3);
		LLNode<Integer> a2 = new LLNode<Integer>(6);
		a1.setLink(a2);
		LLNode<Integer> a3 = new LLNode<Integer>(9);
		a2.setLink(a3);
		System.out.println(a1.getInfo());
		System.out.println(a2.getInfo());
		System.out.println(a3.getInfo());
		
		LLNode<Integer> b1 = new LLNode<Integer>(3);
		LLNode<Integer> b2 = new LLNode<Integer>(6);
		b1.setLink(b2);
		LLNode<Integer> b3 = new LLNode<Integer>(9);
		b2.setLink(b3);
		
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
		
		while(head1 != null && head2 != null){
			System.out.println("==============");
			if(head1.getInfo() != head2.getInfo()){
				isEqual = false;
			}
			System.out.println("head1 info: " + head1.getInfo());
			System.out.println("head2 info: " + head2.getInfo());
			System.out.println(isEqual);
			/*increment*/
			head1 = head1.getLink();
			head2 = head2.getLink();
		}
		
		if(head1 == null && head2 == null){
			if(head1.getInfo() != head2.getInfo()){
				isEqual = false;
			} else if (head1.getLink() == null || head2.getLink() == null){
				isEqual = false; //always, coz ONE of them is null
				//if both of them were null, the above condition catches it and deals with equality comparison
			}
		}
		
		return isEqual;
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
