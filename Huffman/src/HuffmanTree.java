import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HuffmanTree {
	
	HuffmanNode root;

	public static void main(String[] args) throws IOException{
		
//		bheap.printHeap();
//		createFromHeap(bheap);
//		htree.printLegend();
		System.out.println(fileToHeap("data")[0]);
		System.out.println(fileToHeap("data")[1]);
		System.out.println(fileToHeap("data")[2]);
		System.out.println(fileToHeap("data").length);
		System.out.println(fileToHeap("data")[20]);
	}

	public HuffmanTree(HuffmanNode huff){
		this.root = huff;
	}
	
	public void printLegend(){
		printLegend(root, "");
	}
	
	public static String[] fileToHeap(String filename) throws FileNotFoundException{
		/* get first line from file */
		BufferedReader buffRead = new BufferedReader(new FileReader(new File(System.getProperty("user.dir") + "/src/" + filename)));
		String fileToString = "";
		try {
			fileToString = buffRead.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String[] stringToArray = fileToString.split(" ");
		
		return stringToArray;
	}
	
	private void printLegend(HuffmanNode t, String s){
		
	}
	
	public static HuffmanTree createFromHeap(BinaryHeap b){
		
	}
	

}
