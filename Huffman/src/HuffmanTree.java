import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HuffmanTree {
	
	HuffmanNode root;

	public static void main(String[] args) throws IOException{
//		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
//		while(true){
//			String line;
//			if(line == null) break;
//			System.out.println(line);
//		}
		
//		bheap.printHeap();
//		createFromHeap(bheap);
//		htree.printLegend();
		
		BufferedReader buffRead = new BufferedReader(new FileReader(new File(System.getProperty("user.dir") + "/src/" + "data")));
		
		
		while(true){
			String line = buffRead.readLine();
			if (line == null) break;
			System.out.println(line);
		}
	
	}

	public HuffmanTree(HuffmanNode huff){
		this.root = huff;
	}
	
	public void printLegend(){
		printLegend(root, "");
	}
	
	public static BinaryHeap fileToHeap(String filename){
		
	}
	
	private void printLegend(HuffmanNode t, String s){
		
	}
	
	public static HuffmanTree createFromHeap(BinaryHeap b){
		
	}
	

}
