import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		String string1 = "hello";
		String string2 = "hot";
		String string3 = "coffee";
		String string4 = "hello";
		
		String s5 = "an";
		String s6 = "apple";
		String s7 = "boy";
		
		int answer = s7.compareToIgnoreCase(s6);
		
		System.out.println(answer);
	}
}