package hw5;

public class ShiftByOne {

	public static void main(String[] args){
		String s = "crabs";
		// 0 1 2 3 4
		// c r a b s
		// c c a b s (r)  >shift1 result
		// c c r b s (a)  >shift2 result
		// c c r a s (b)
		// c c r a b (s)
		// s c r a b (c?)
	
		char[] chars = s.toCharArray();
		char store;
		char temp;
		
		store = chars[1];  //store r
		chars[1] = chars[0]; // make r into c
		System.out.printf("== first shift: %s, (%s)\n", new String(chars), store);
		
		//shift2
		temp = store;
		store = chars[2];
		chars[2] = temp; //change a into r 
		System.out.printf("==second shift: %s, (%s)\n", new String(chars), store);
		
		//third shift
		System.out.printf("== third shift: %s, (%s)\n", new String(chars), store);
		
		String shifted = new String(chars);
		System.out.println(shifted);
	}

}
