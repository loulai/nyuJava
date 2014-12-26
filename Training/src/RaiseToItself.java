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
				 endSum = endSum * num;	//calculate the 'end sum', and that end sum is brought over to the next sum then multiplied num-1 times, coz 1^1 you don't need to multiply
			}
		}
		System.out.println(endSum);
	}

}
