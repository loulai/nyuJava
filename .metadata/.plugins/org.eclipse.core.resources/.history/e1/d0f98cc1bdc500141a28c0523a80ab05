package temp;

public class FastMaxStack<T> implements MaxStack<T>{
	
	private LLNode<T> top;
	private LLNode<T> topOfMaxStack;
	private final Maximizer<T> maximizer;

	public static void main(String[] args) {
		FastMaxStack<T> fms = new FastMaxStack<T>(new Maximizer<T>());
		System.out.println();
	}
	
	public FastMaxStack(Maximizer<T> maximizer) {
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T getMaxSoFar() {
		// TODO Auto-generated method stub
		return null;
	}

}
