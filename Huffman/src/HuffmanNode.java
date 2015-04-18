
public class HuffmanNode {
	public String letter;
	public Double frequency;
	public HuffmanNode left;
	public HuffmanNode right;
	
	public HuffmanNode(String letter, Double frequency){
		this.letter = letter;
		this.frequency = frequency;
		this.left = null;
		this.right = null;
	}
	
	public HuffmanNode(HuffmanNode left, HuffmanNode right){
		this.letter = left.letter + right.letter;
		this.frequency = left.frequency + right.frequency;
		this.left = left;
		this.right = right;
	}
	
	public String toString(){
		String s = "<" + letter + ", " + frequency + ">";
		return s;
	}
	
	public int compareTo(Object o){
		
	}
	

	
}
