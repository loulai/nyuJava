package temp;

public class FastMaxStack<T> implements MaxStack<T>{

	private final IntegerMaximizer maximizer;
	private LLNode<T> top = null;
	private LLNode<T> maxStackTop;
	
	public static void main(String[] args){
		/* setting up linked list */
		FastMaxStack<Integer> f = new FastMaxStack<Integer>(new IntegerMaximizer());
		f.push(2);
		f.push(3);
		Integer top = f.pop();
		Integer top2 = f.pop();
		System.out.printf("%d is greater than %d?: %s", top, top2, "h");
	}

	public FastMaxStack(IntegerMaximizer maximizer) {
		this.maximizer = maximizer;
	}

	@Override
	public boolean isEmpty() {
		return top == null;
	}

	@Override
	public void push(T info) {
		LLNode<T> newNode = new LLNode<T>(info);
		newNode.setLink(top);
		top = newNode;
		
//		/* maxStack tracker */
//		if(maxStackTop.getLink() == null){
//			newNode.setLink(maxStackTop);
//			maxStackTop = newNode;
//		} 
		
	}

	@Override
	public T pop() throws StackUnderflowException {
		T topNodeInfo;
		 if (!isEmpty()){
			 topNodeInfo = top.link.info;
			 this.top = top.link;
		 } else {
			 throw new StackUnderflowException("Pop attempted on an empty stack.");
		 }
		 return topNodeInfo;
	}

	@Override
	public T getMaxSoFar() {
		// TODO Auto-generated method stub
		return null;
	}

}
