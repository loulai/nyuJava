package homeworksAgain;

public class Main {

	public static void main(String[] args) {
	
		double n1 = 4 * (1 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11);
		double n2 =  4 * (1 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11 + 1.0/13);
		
		System.out.println(n1);
		System.out.println(n2);
		
		double num = 1;
		int d = 1;
		
		for (int i = 1; i < 101; i++){
			if(i == 1){}
			else if(i%2 == 0){
				d+=2;
				num = num - 1.0/d;
			} else {
				d+=2;
				num = num + 1.0/d;
			}
		}
		
		System.out.println(4 * num);

	}

}
