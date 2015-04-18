import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class HuffmanTree {
	
	HuffmanNode root;

	public static void main(String[] args) throws IOException{
//		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//		while(true){
//			String line;
//			if(line== null) break;
//			System.out.println(line);
//		}
		
//		bheap.pritHeap();
//		createFromHeap(bheap);
//		htree.printLegend();
	
	}

	public HuffmanTree(HuffmanNode huff){
		this.root = huff;
	}
	
	public void printLegend(){
		printLegend(root, "");
	}
	
	private void printLegend(HuffmanNode t, String s){
		
	}
	
	public static HuffmanTree createFromHeap(BinaryHeap b){
		
	}
	

}
