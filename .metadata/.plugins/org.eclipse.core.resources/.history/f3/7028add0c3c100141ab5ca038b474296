/**
 * Author     : Lou (Louise) Lai
 * Date       : Monday March 2nd, 2015
 * Professor  : Evan Korth
 * Graders    : XXX XXX
 * About      : Sieve class filters out primes from 2 until the user's chosen number, using XXX's method
 */

package temp;
import java.util.Scanner;
import java.math.*;
public class Sieve {

	public static void main(String[] args) {
		System.out.println("Calculate primes up until which number?: ");
		Scanner input = new Scanner(System.in);
		Integer n = input.nextInt();
		primesTo(n);
	}
	
	/** Outputs all primes from 2 until a number the user specifies (inclusive). Returns void.
	 * @param lastNum  Last number, which is input by the user.
	 */
	public static void primesTo(Integer lastNum){
		ArrayUnbndQueue primes = new ArrayUnbndQueue<Integer>();
		
		/* divs and others are a split of the numbers queue*/
		ArrayUnbndQueue divs = new ArrayUnbndQueue();        //contains all numbers < sqrt(n)
		ArrayUnbndQueue others = new ArrayUnbndQueue();      //everything else < n
		
		ArrayUnbndQueue divsPrepend = new ArrayUnbndQueue();  //needed to prepend to output
		
		Integer p;
		Integer p2 = null;
		Integer temp;
		
		for (int i = 2; i <= lastNum; i++) {  //filling numbers queue from 2 to n
			/* splitting up 'numbers' into 'divs' and 'others' */
			if(i <= Math.sqrt(lastNum)) {
				System.out.println("divs  : " + i);
				divs.enqueue(i);
			}
			else { //everthing that isn't a div, is 'others'
				System.out.println("others: " + i);
				others.enqueue(i);
			}
		}
		
		while(!divs.isEmpty()){
			
			
			p = (Integer) divs.dequeue();
			divsPrepend.enqueue(p); // only ever used for output purposes
			System.out.println("=====");
			System.out.println("current div: " + p);
			System.out.println("is others empty?:" + others.isEmpty());
			System.out.println("is primes empty?:" + primes.isEmpty());
		
			while(!others.isEmpty()){
				p2 = (Integer) others.dequeue();
				System.out.println(p2 + " % " + p);
				if(!(p2 % p == 0)) primes.enqueue(p2);
			}
			
			while(!primes.isEmpty()) others.enqueue(primes.dequeue()); //others = primes, so the inner while loop continues to work
			
			if(!divs.isEmpty()) {
				while(!primes.isEmpty()) primes.dequeue(); //primes = null, so the primes are blanked out, ready for the next inner while loop iteration
				                                           //note that it doesn't blank out when after the LAST iteration of the inner while loop, marked by
				                                           //whether or not 'divs' queue is empty
			}
		}
		
		/* output */
		while(!divsPrepend.isEmpty()) System.out.print(divsPrepend.dequeue() + " "); //because 'primes' queue doesn't contain the divs.
		while(primes.isEmpty() && !others.isEmpty()) System.out.print(others.dequeue() + " ");
	}
	
}
