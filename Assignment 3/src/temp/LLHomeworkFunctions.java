package temp;

public class LLHomeworkFunctions {

	static public void main(String [] args) {
	}
	
	/**
	 * @param <T>
	 * @param list1
	 * @param list2
	 * @return true if the lists are equal.  Assume both lists terminate.
	 */
	static public <T> boolean equalLists(LLNode<T> list1, LLNode<T> list2) {
		// TODO: Part 1 of this assignment is to implement this correctly.
		return list1 == list2;
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
