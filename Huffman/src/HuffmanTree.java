import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class HuffmanTree {
	
	HuffmanNode root;

	public static void main(String[] args) throws FileNotFoundException, UnderflowException, BinaryHeap.UnderflowException{
		BinaryHeap bheap = fileToHeap("data");
		HuffmanTree htree = createFromHeap(bheap);
		htree.printLegend();
	}

	public HuffmanTree(HuffmanNode huff){
		this.root = huff;
	}

	
	public static BinaryHeap fileToHeap(String filename) throws FileNotFoundException{
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
		HuffmanNode[] arrayToHuffman = new HuffmanNode[stringToArray.length/2];
		int k = 0;
		for(int i = 0; i < stringToArray.length; i++){
			HuffmanNode temp = new HuffmanNode(stringToArray[i++], Double.parseDouble(stringToArray[i]));
			arrayToHuffman[k] = temp;
			System.out.println(arrayToHuffman[k].toString());
			k++;
		}
		BinaryHeap arrayToHeap = new BinaryHeap(arrayToHuffman);
		return arrayToHeap;
	}
	
	public void printLegend(){
		printLegend(root, "");
	}
	
	private void printLegend(HuffmanNode t, String s){
		if(t.letter.length() > 1){
			printLegend(t.left, (s + "0"));
			printLegend(t.right, (s + "1"));
		} else {
			System.out.println(t.letter + "=" + s);
		}
	}
	
	public static HuffmanTree createFromHeap(BinaryHeap b) throws UnderflowException, BinaryHeap.UnderflowException{
		HuffmanNode tempLeft = (HuffmanNode) b.deleteMin();
		while(!b.isEmpty()){
			HuffmanNode tempRight = (HuffmanNode) b.deleteMin();
			HuffmanNode newParent = new HuffmanNode(tempLeft, tempRight);
			b.insert(newParent);
		}
		HuffmanTree r = new HuffmanTree(tempLeft);
		return r;
	}
	

}
