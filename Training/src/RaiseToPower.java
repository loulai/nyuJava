
import java.util.Scanner;
public class RaiseToPower {
	
	public static void Main(String[] args){
		System.out.println("input desired number to raise to the power of itself: ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int endsum = num;
		for(int i = 0; i < num - 1; i++){
			if(num == 1){}
			else{
				endsum = endsum * num;
			}
		}
		System.out.println(endsum);
		System.out.println("TEST" + (4*4*4*4));
	}
	
	

}
