import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class HuffmanConverter { 
  // The # of chars in the ASCII table dictates
  // the size of the count[] & code[] arrays.
  public static final int NUMBER_OF_CHARACTERS = 256;
 
  // the contents of our message...
  private String contents;
 
  // the tree created from the msg
  private HuffmanTree huffmanTree;
 
  // tracks how often each character occurs
  private int count[];
 
  // the huffman code for each character
  private String code[];
 
  // stores the # of unique chars in contents
  private int uniqueChars = 0; //(optional)
  

  /**
   * Uses args[0] as the filename, and reads in its contents. Then
   * instantiates a HuffmanConverter object, using its methods to
   * obtain our results and print the necessary output. Finally,
   * decode the message and compare it to the input file.<p>
   * NOTE: Example method provided below...
   *
   *
   */
  public static void main(String args[]) {
	  HuffmanConverter hc = new HuffmanConverter(readContents("love_poem_80"));
	  hc.recordFrequencies();
	  hc.frequenciesToTree();
	  hc.treeToCode();
	  String y = hc.encodeMessage();
	  String decoded = hc.decodeMessage("11110010010010001010100110010001000000010100100100011011100011100010000001011000011110010101010000110011000000010110100110000110000010000101001011001101110110010111000100011111100000011000101100001101001111000000110110010111110000000101100111100110001000011010000100010101111110101010011011010000000011100010110000011000011001101110000111001001100001111011001001001100000011010100000000001000011000001101100110101001011111001001001000101100011001001110001000001010101100100100110101011101001000101000110010101100100111110010011010111010000111011001111010010110000011100001101101001000110000100010101111100000001100110111100010101010110010010011010100000101111010010110000110001111000101000110111010011000011001111100100001001001000100000001110110010100001001000010100000000001100101010110110010000111001000100000000101101000000000011100001011011000011010011000011000001000110111011000001101001110011101001011111001001001000101011110100000100001001010101000011001000001001111111001000001010111111110011000100001111011111011111010010111110010010010011010101010011001000100101000110110111101010100011111001011101001100101100001100110111110000010110000010101111001000100001101111100001010110111100010101101000010111110111000100110100110111110000010110000100111111000111000100001000000010100110000110000010000101100110111100010101010010001100110001000000111001011010011011111000001011111001001001000101110101100100011101100000110101010110111100010100001001010101000011000010111101011011100101110001101111100011100010110100000001101100101111110101010111110011011001010000100101111100001100000110111010011010010101101000010100110011100001110011100000011000000101100001110001100000100000011110100100011101101110110001101111100001011000110011001000101101000110111010101011001001001101010111000100111110110110010000010000010101000011100010110000001000111000110001000001110100011011101010111100111001010101111111111001101101101110100101100101010001101100110111011000110111110001110001011000010011000010101111100101010110010010000010101001000010110001110110110010101111001110010101011110101100011111001101110010111000000000001011111001001001000101011110100000101010001100100000110110110101111101111101111101001010010110000010100110001101010101010000101101101100011101100010000101");
	  System.out.println(decoded);
  }

  /** Constructor taking input String to be converted */
  public HuffmanConverter(String input) {
    this.contents = input;
    this.count = new int[NUMBER_OF_CHARACTERS];
    this.code = new String[NUMBER_OF_CHARACTERS];
  }
 
  /**
   * Records the frequencies that each character of our
   * message occurs...
   * I.e., we use 'contents' to fill up the count[] list...
   */
  public void recordFrequencies() {
	 //make char array from string
	 char[] c = this.contents.toCharArray();
	 
	 for(int i = 0; i < c.length; i++){
		 count[(int) c[i]]++; //incremeting the count of each char, as positioned by the ASCII numbering
	 }
	
  }
 
  /**
   * Converts our frequency list into a Huffman Tree. We do this by
   * taking our count[] list of frequencies, and creating a binary
   * heap in a manner similar to how a heap was made in HuffmanTree's
   * fileToHeap method. Then, we print the heap, and make a call to
   * HuffmanTree.heapToTree() method to get our much desired
   * HuffmanTree object, which we store as huffmanTree.
   */
  public void frequenciesToTree() throws UnderflowException, UnderflowException {
	  /* formats contents into a string that looks like A~20~B~10~.. */
	  String result = "";
	  for(int i = 0; i < this.count.length; i++){
		  if(count[i] != 0){
			  if(i == 32) result += ((char)i + "~" + count[i] + "~" ); //accounting for when the character is a space, so that splitting with (" ") later on works
			  else result += ( (char)i + "~" + count[i] + "~" );
		  }
	  }
	  System.out.print("===Data broken down: " + result);

	  /* creating a Huffman tree from the contents */
	  // splits string into array, in preparation for creating an array of huffman nodes */
	  String[] stringToArray = result.split("~");
	  System.out.println();
//	  for extra clarity of each array item, can delete
	  for(int i = 0; i < stringToArray.length; i++){
		  System.out.print("[" + stringToArray[i] + "]");
	  }
	  System.out.println();
	  HuffmanNode[] arrayToHuffman = new HuffmanNode[stringToArray.length/2];
	  int k = 0; 
	  for(int i = 0; i < stringToArray.length ; i++){
		System.out.println("i:  " + i);
		HuffmanNode temp = new HuffmanNode(stringToArray[i++], Double.parseDouble(stringToArray[i]));
		System.out.println("k:  " + k);
		arrayToHuffman[k] = temp;
		System.out.println("HUFFNODE: " + arrayToHuffman[k].toString()); //used to test each huffman node is is correct and prints fine
		k++;
		System.out.println("---------------");
	  }
		
		//creates binary heap from array and assigns it
		BinaryHeap arrayToHeap = new BinaryHeap(arrayToHuffman);
		try {
			this.huffmanTree = HuffmanTree.heapToTree(arrayToHeap); 
		} catch (BinaryHeap.UnderflowException e) {
			e.printStackTrace();
		}
  }
 
  /*
   * Iterates over the huffmanTree to get the code for each letter.
   * The code for letter i gets stored as code[i]... This method
   * behaves similarly to HuffmanTree's printLegend() method...
   * Warning: Don't forget to initialize each code[i] to ""
   * BEFORE calling the recursive version of treeToCode...
   */
  public void treeToCode(){
	  for(int i = 0; i < NUMBER_OF_CHARACTERS; i++){
		  code[i] = "";
	  }
	  
	  treeToCode(huffmanTree.root, "");
	 
	 //DELETE : this is for debugging
	 //for(int i = 0; i < NUMBER_OF_CHARACTERS; i++) System.out.printf("%3d. %c %s\n", i, (char)i, code[i]);
  }
 
  /**
   * A private method to iterate over a HuffmanNode t using s, which
   * contains what we know of the HuffmanCode up to node t. This is
   * called by treeToCode(), and resembles the recursive printLegend
   * method in the HuffmanTree class. Note that when t is a leaf node,
   * t's letter tells us which index i to access in code[], and tells
   * us what to set code[i] to...
   */
  private void treeToCode(HuffmanNode t, String s){
	  if(t.letter.length() > 1){
		  treeToCode(t.left, s + "1");
		  treeToCode(t.right, s + "0");
	  }
	  
	  if(t.letter.length() == 1){
		  code[(int)t.letter.charAt(0)] = s; //gets char, uses it as index, stores code
	  }
  }
 
  /**
   * Using the message stored in contents, and the huffman conversions
   * stored in code[], we create the Huffman encoding for our message
   * (a String of 0's and 1's), and return it...
   */
  public String encodeMessage(){
	  String s = "";
	  char[] arr = contents.toCharArray();
	  for(int i = 0; i < arr.length; i++){
		  if(!code[(int)arr[i]].equals("")){
			  s += code[(int)arr[i]];
			  System.out.println(arr[i] + " -> " + code[(int)arr[i]]);
		  }
	  }
	  return s;
  }
 
  /**
   * Reads in the contents of the file named filename and returns
   * it as a String. The main method calls this method on args[0]...
   */
  public static String readContents(String filename){
		/* convert file to String */
		String text = "";
		try {
			text = new Scanner( new File(System.getProperty("user.dir") + "/src/" + filename)).useDelimiter("\\A").next();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return text;
   }
 
  /**
   * Using the encoded String argument, and the huffman codings,
   * re-create the original message from our
   * huffman encoding and return it...
   */
  public String decodeMessage(String encodedStr) {
	  char[] c = encodedStr.toCharArray();
	  HuffmanNode current = this.huffmanTree.root;
	  String s = "";
	  for(int i = 0; i < c.length; i++){
		  if(c[i] == '1')current = current.left;
		  else current = current.right;
		  
		  if(current.right == null && current.left == null){
			  s += current.letter;
			  current = this.huffmanTree.root;
		  }
	  }
	  return s;
  }
 
  

}
