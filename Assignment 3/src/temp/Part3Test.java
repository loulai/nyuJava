package temp;

public class Part3Test {

	public static void main(String[] args) {
		/* slow stack */
		SlowMaxStack slow = new SlowMaxStack(new SlowIntegerMaximizer());
		slow.push(1);
		slow.push(2);
		slow.push(3);
		slow.push(2);
		System.out.println("Slow Max Stack result: " + slow.getMaxSoFar());
		
		/* fast stack */
		FastMaxStack fast = new FastMaxStack(new FastIntegerMaximizer());
		fast.push(1);
		fast.push(2);
		fast.push(3);
		fast.push(2);
		System.out.println("Fast Max Stack result: " + fast.getMaxSoFar());

	}

}
