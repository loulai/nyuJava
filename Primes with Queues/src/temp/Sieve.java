package temp;
import java.util.Scanner;
import java.math.*;
public class Sieve {

	public static void main(String[] args) {
		System.out.println("Calculate primes up until which number?: ");
		Scanner input = new Scanner(System.in);
		int n = (Integer) input.nextInt();
		primesTo(n);

	}
	
	public static void primesTo(Integer n){
		ArrayUnbndQueue numbers = new ArrayUnbndQueue();
		ArrayUnbndQueue primes = new ArrayUnbndQueue();
		ArrayUnbndQueue aside = new ArrayUnbndQueue();
		Integer p;
		Integer p2;
		
		for (Integer i = 2; i <= n; i++) {
			numbers.enqueue(i); //filling up 'numbers' queue from 2 to n
		}
		
		p = (Integer) numbers.dequeue(); //obtaining first divisor
		aside.enqueue(p); //putting it in aside
		
		while(p <= Math.sqrt(n)){
			do { 
				p2 = (Integer) numbers.dequeue();
				System.out.println("second divisor:" + p2);
				if( p2 % p != 0){
					primes.enqueue(p2); //falls through to primes if mod is not 0
					System.out.println(" <<< " + p2);
				}
			} while(!numbers.isEmpty());
			p = (Integer) primes.dequeue(); //preparing for next round
			aside.enqueue(p);
			System.out.println("==== next round div:" + p);
			
			while(!primes.isEmpty()) numbers.enqueue(primes.dequeue()); //numbers = primes
		//	while(!primes.isEmpty()) primes.dequeue(); //primes = null, so the primes are blanked out, ready for the next while loop iteration
		}
		
		/* output */
		while(!aside.isEmpty()) System.out.print("[" + aside.dequeue() + "]"); 
		while(!numbers.isEmpty()) System.out.print(" " + numbers.dequeue() + " ");
	}

}
