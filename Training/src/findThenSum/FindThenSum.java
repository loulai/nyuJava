/** playing with all things odd and even **/
package findThenSum;

public class FindThenSum {

	 public static void main(String[] args){
		 int finalSum = sumEvensBetween(1,5, "ih");
		 System.out.println(finalSum);
		 System.out.println(sumOddsBetween(0,5));
	 }
	 
	 /* given an interval, sum all the even numbers in between (inclusive) */
	 public static int sumEvensBetween(int first, int last, String incl){
		 int sum = 0;
		 if(first%2 != 0) first = first + 1;
		 
		 if(incl.equalsIgnoreCase("inclusive")){
			 for(int i = first; i <= last; i+=2) sum = sum + i;
		 } else {
			 for(int i = first + 2; i < last; i+=2) sum = sum + i;
		 }
		 return sum;
	 }
	 
	 /* this time sum odds, ends also inclusive */
	 public static int sumOddsBetween(int first, int last){
		 int sum = 0;
		 if(first%2 != 1) first = first + 1;
		 for(int i = first; i <= last; i+=2) sum = sum + i;
		 return sum;
	 }
}
