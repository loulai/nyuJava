import java.util.Scanner;
public class RaiseToItself {

	public static void main(String[] args) {
		
		System.out.println("input integer to be raised to itself:");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int endSum = num;
		
		if(num == 1){}
		else{
			for(int i = 0; i < num-1; i++){
				 endSum = endSum * num;	
			}
		}
		System.out.println(endSum);
	}

}
