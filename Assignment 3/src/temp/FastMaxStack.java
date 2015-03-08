package temp;

public class FastMaxStack<T> implements MaxStack<T>{
	
	private LLNode<T> top;
	private LinkedStack<T> maxStack;
	
	public static void main(String[] args){
		/* setting up linked list */
		FastMaxStack f = new FastMaxStack(new LLNode<Integer>(1));
		f.push(2);
		f.push(3);
		System.out.println(f.top.link.info.getClass());
	}

	public FastMaxStack(LLNode<T> top) {
		this.top = top;
		maxStack.push(top.info); //pushes onto maxStack, regardless of the value, if it's the first one.
	}

	@Override
	public boolean isEmpty() {
		return top == null;
	}

	@Override
	public void push(T info) {
		top = top.pushValue(info); //pushing into source stack
		
//		/* maxStack tracker */
//		if(maxStack.top.info.){
//			maxStack.top.pushValue(info); //push into the stack if it's stack is empty
//		}
//		
	}

	@Override
	public T pop() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T getMaxSoFar() {
		// TODO Auto-generated method stub
		return null;
	}

}
