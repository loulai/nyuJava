/** given an interval, sum all the even numbers in between (inclusive) **/
package findThenSum;

public class FindThenSum {

	 public static void main(String[] args){
		 int finalSum = sumEvensBetween(-5,0);
		 System.out.println(finalSum);
	 }
	 
	 public static int sumEvensBetween(int first, int last){
		 int sum = 0;
		 if(first%2 != 0) first = first + 1;
		 for(int i = first; i <= last; i+=2) sum = sum + i;
		 return sum;
	 }
}
