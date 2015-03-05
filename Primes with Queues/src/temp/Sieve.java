/**
+ * Author      : Lou (Louise) Lai
+ * Date        : Monday March 2nd, 2015
+ * Professor   : Evan Korth
+ * Graders     : Shuang Zhou, Navneet Saini 
+ * Description : Sieve class filters out primes from 2 until the user's upper bound (n), using the Sieve of Eratosthenes method
+ **/

package temp;
import java.util.Scanner;
import java.math.*;
public class Sieve {

	public static void main(String[] args) {
		System.out.println("Please enter upper bound: ");
		Scanner input = new Scanner(System.in);
		int n = (Integer) input.nextInt();
		primesTo(n);
	}
	
	/** method outputs all primes number up until the upper bound (inclusive)
	 * @param n                         Upper bound, which is input by user    
	 * @throws IllegalArgumentException Error thrown if upper bound is less than 2
	 */
	public static void primesTo(Integer n) throws IllegalArgumentException{
		if (n < 2) throw new IllegalArgumentException("Upper bound must be greater than 2, try again");
		ArrayUnbndQueue numbers = new ArrayUnbndQueue();
		ArrayUnbndQueue primes = new ArrayUnbndQueue();
		ArrayUnbndQueue aside = new ArrayUnbndQueue(); //used to hold the prime numbers that are also divisors, and is output at the end of method
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
