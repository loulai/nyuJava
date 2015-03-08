package temp;

public class SlowMaxStack<T> implements MaxStack<T> {

	private final Maximizer<T> maximizer; //>>> Diego: why do we even need a maximizer object??
	private LLNode<T> top;
	
	public static void main(String[] args){
		Maximizer<T> m = new Maximizer<T>(); //>>Diego: why doesn't this work?
	}

	public SlowMaxStack(Maximizer<T> maximizer) {
		this.maximizer = maximizer;
	}

	@Override
	public boolean isEmpty() {
		return top == null;
	}

	@Override
	public void push(T info) {
		top = top.pushValue(info);
	}

	@Override
	public T pop() {
		T info = top.info;
		top = top.link;
		return info;
	}

	@Override
	public T getMaxSoFar() {
		T currentMax = maximizer.getGlobalMin();
		
		for(LLNode<T> node = top; node != null; node = node.link) {
			currentMax = maximizer.getMax(currentMax, node.info); //Diego >> how is the method getMax() defined?
		}
		
		return currentMax;
	}

}