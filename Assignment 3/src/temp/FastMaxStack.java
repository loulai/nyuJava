package temp;

public class FastMaxStack implements MaxStack<Integer>{

	private final IntegerMaximizer maximizer;
	private LLNode<Integer> top = null;
	private LLNode<Integer> maxStackTop;
	
	public static void main(String[] args){
		/* setting up linked list */
		FastMaxStack f = new FastMaxStack(new IntegerMaximizer());
		f.push(1);
		System.out.printf("f.top         : %d \nf.maxStackTop : %d\n====\n", f.top.info, f.maxStackTop.info);
		f.push(3);
		System.out.printf("f.top         : %d \nf.maxStackTop : %d\n====\n", f.top.info, f.maxStackTop.info);
		f.push(2);
		System.out.printf("f.top         : %d \nf.maxStackTop : %d\n====\n", f.top.info, f.maxStackTop.info);
		
		Integer top = f.top.info;
//		f.pop();
		Integer top2 = f.top.info;
		System.out.printf("%d >= %d:  %s", top, top2, IntegerMaximizer.isLargerOrEqualTo(top, top2) );
		
	}

	public FastMaxStack(IntegerMaximizer maximizer) {
		this.maximizer = maximizer;
	}

	@Override
	public boolean isEmpty() {
		return top == null;
	}

	@Override
	public void push(Integer info) {
		LLNode<Integer> newNode = new LLNode<Integer>(info);
		newNode.setLink(top);
		top = newNode;
		
		/* maxStack tracker */
		//insert in the tracker stack is the tracker stack is empty (i.e. it's the first value being pushed, ever)
		//or if the value being pushed is greater or equal to the current top of the max stack
		if(maxStackTop == null || IntegerMaximizer.isLargerOrEqualTo(info, maxStackTop.info)){
			LLNode<Integer> newMaxNode = new LLNode<Integer>(info);
			newMaxNode.setLink(maxStackTop);
			maxStackTop = newMaxNode;
		} 
		
	}

	@Override
	public void pop() throws StackUnderflowException {
		 if (!isEmpty()){
			 this.top = top.link;
			 
			 if(top.link.info.equals(maxStackTop.info)){ //if the top of source stack equals top of maxStack
				 maxStackTop = maxStackTop.link;  //remove it from the stack
			 }
		 } else {
			 throw new StackUnderflowException("Pop attempted on an empty stack.");
		 }
	}

	@Override
	public Integer getMaxSoFar() {
		return maxStackTop.info;
	}

}
