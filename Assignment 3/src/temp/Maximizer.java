package temp;

public interface Maximizer<T> {
	//>>Diego: what is this?? 
	T getMax(T t1, T t2);  //>>how do these methods know what to return?
	T getGlobalMin();
}
