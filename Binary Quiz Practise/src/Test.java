
public class Test {

	public static void main(String[] args) {
		recPrint(4234);

	}
	
	public static int recPrint(int i){
		int num = 0;
		if(i%10 == 0){
			System.out.println(0 + " hi");
		} else{
			num = recPrint(i/10);
			System.out.println(num);
		}
		return num;
	}

}
