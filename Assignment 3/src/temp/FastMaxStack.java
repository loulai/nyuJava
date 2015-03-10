package temp;

public class FastMaxStack implements MaxStack<Integer>{

	private final IntegerMaximizer maximizer;
	private LLNode<Integer> top = null;
	private LLNode<Integer> maxStackTop;
	
	public static void main(String[] args){
		/* setting up linked list */
		FastMaxStack f = new FastMaxStack(new IntegerMaximizer());
		f.push(3);
		f.push(2);
		f.push(1);
		String sourceStackString = "Source :";
		String maxStackString = "Max    :";
		
		while(!f.isEmpty()){
			sourceStackString = sourceStackString + " [ " + f.top.info + " ] ";
			maxStackString = maxStackString + " [ " + f.maxStackTop.info + " ] ";
			System.out.println(sourceStackString);
			System.out.println(maxStackString);
			System.out.println("max so far >> " + f.getMaxSoFar());
			System.out.println("=========");
			f.pop();
		}
		
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
			 if(maxStackTop.info.equals(top.info)){ //if the top of source stack equals top of maxStack
				 maxStackTop = maxStackTop.link;  //remove it from the max stack
			 }
		this.top = top.link;
		 } else {
			 throw new StackUnderflowException("Pop attempted on an empty stack.");
		 }
	
	}

	@Override
	public Integer getMaxSoFar() {
		Integer maxIntegerSoFar = null;
		if(!isEmpty())
			maxIntegerSoFar = maxStackTop.info;
		return maxIntegerSoFar;
	}

}
