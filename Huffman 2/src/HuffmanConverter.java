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
  
  public static void main(String args[]) {
	  HuffmanConverter hc = new HuffmanConverter(fileToString("data2"));
	  hc.recordFrequencies();
	  hc.frequenciesToTree();
	  hc.treeToCode();
	  String y = hc.encodeMessage();
	  System.out.println("FINAL STRING YALL: " + y);
	  String real = "110011 1010 00111 10010 1011 0100 00001101011110000110100100010101110000011010111100001101110111000111000110011110000110001110101011100001110001010110000010110000000100010100100110100000110111001000001111000001001000110100111110001101010100001111101000111101100011110110111010100011010101110001011100111010001111001010110100000001101110010000010011001110101000100111010000111010100011000000100010110000000110010101111011100011100011001110001011000101001001101000011111010001111011000111111101110001110001100110011101011001000111110011000100111110110101011101010111000000100001010100011010101110001010010111001110100011110010101101000000011011100100000100110110001011110001001110100001111001001001001100110000001000101100000001100101111100111010001110001010110000010110000000100010100100110100000110111001000001000111110110100110010000011110111111101000111100001001100011010101000011111010001111011000111101111001001001100110011100010110001010010011010000010000010111101111100101001011000111101111110100001000101000001000101100000001111000100111101101000111000101011001101111010100001101010100001111101000111101100010101111010100001000101000011001011010101100001001100011100100101100010110100100110011001110001010010111001110100011110010101101000000011011100100000011011010001110101001100010011010101000111000111110000100000001000101100000001110110111000111001110001011000101001001101000001101110010000011110010010011111111110100011110001100010110100010001010000010001011000000010001111011000001000111000101110011101000111100101011010000000110111001000001100101010100000111100001100101101101101101000001000101100000001001100110101110100101110000111000101011000001011000000010001010010011010000010000010111101110010000110010101001010100000101001010000111110100011110110001001111011000001000111000101001011100111010001111001010110100000001000101000010000100110001111101000000110010111110111111010101110000001110110111000111001110001011000101001001101000011111010001111011000011001001000010000110111001001011100110001111111011100011100011000000100010110000000110010101110101000110101011100010111001110100011110010101101000000110101111000011010010001010111000001101011110000110001110101011100000010100110010000011000111010101110001001101110001010110000010110000000100010100100110100000110111001000001111000001001000110100111110001101010100001111101000111101100011110110111010100011010101100110000101001010110011111101011010010000001100000110001110010001001011110100101";
	  String mine = "110011 1010 00111 10010 1011 0100 011010111101101001000101011100110101111011011101110001110001100111101100011101010111000011100010101100000101100001000101001001101001101110010011110000010010001101001111111010101011111010001111011111101101110101000110101011100010111001110100011110010101101000011011100100100110011101011001110101110101000110001000101100001100101011110111000111000110011100010110001010010011010111110100011110111111111011100011100011001100111010110010001111100111001111101101010111010101110001000010101000110101011100010100101110011101000111100101011010000110111001001001101100010111110011101011110010010010011001100010001011000011001011111001110100011100010101100000101100001000101001001101001101110010010001111101101001100100111101111111010001111000010011110101010111110100011110111111011110010010011001100111000101100010100100110100100101111011111001010010111111011111101000010001010010001011000011110001001111011010001110001010110011011110101011010101011111010001111011101011110101000010001010110010110101011000010011111001001011101101001001100110011100010100101110011101000111100101011010000110111001000110110100011101010011000100110101011110001111100001000010001011000011101101110001110011100010110001010010011010011011100100111100100100111111111101000111111000101101000100010100100010110000100011110110000010001110001011100111010001111001010110100001101110010011001010101000001111011001011011011011010010001011000010011001101011101001011100001110001010110000010110000100010100100110100100101111011100101100101010010101001010010101111101000111101110011110110000010001110001010010111001110100011110010101101000010001010100001001100011111010001100101111101111110101011100011101101110001110011100010110001010010011010111110100011110110110010010000100001101110010010111001111111110111000111000110001000101100001100101011101010001101010111000101110011101000111100101011010001101011110110100100010101110011010111101100011101010111000101001100100110001110101011100010011011100010101100000101100001000101001001101001101110010011110000010010001101001111111010101011111010001111011111101101110101000110101011001100001010010101100111111010110100100011000001100011100100010010111101";
	  
	  System.out.println(mine.equals(real));
  }

  /** Constructor taking input String to be converted */
  public HuffmanConverter(String input) {
    this.contents = input;
    this.count = new int[NUMBER_OF_CHARACTERS];
    this.code = new String[NUMBER_OF_CHARACTERS];
  }
  
  public static String fileToString(String filename){
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
	 
	 //print for debugging, can delete
	 for(int i = 0; i < c.length; i++){
		 System.out.print( " [ " + c[i] + " ] ");
		 System.out.println((int) c[i]);
	 }
	 for(int i = 0; i < 256; i++){
		 System.out.printf("%2d => %d\n", i, count[i]);
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
	  /* formats contents into a string that looks like A 20 B 10 .. */
	  String result = "";
	  for(int i = 0; i < this.count.length; i++){
		  if(count[i] != 0){
			  if(i == 32) result += ((char)i + "" + count[i] + " " ); //accounting for when the character is a space, so that splitting with (" ") later on works
			  else result += ( (char)i + " " + count[i] + " " );
		  }
	  }
	  System.out.print("===Data broken down: " + result);

	  /* creating a Huffman tree from the contents */
	  // splits string into array, in preparation for creating an array of huffman nodes */
	  String[] stringToArray = result.split(" ");
	  System.out.println();
//	  for extra clarity of each array item, can delete
	  for(int i = 0; i < stringToArray.length; i++){
		  System.out.print("[" + stringToArray[i] + "]");
	  }
	  System.out.println();
	  HuffmanNode[] arrayToHuffman = new HuffmanNode[stringToArray.length/2];
	  int k = 0; //counter for new array of Huffman nodes
	  //hacky way of inserting space, because split was with (" ")
	  HuffmanNod
	  for(int i = 2; i < stringToArray.length ; i++){
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
  public static String readContents(String filename){}
 
  /**
   * Using the encoded String argument, and the huffman codings,
   * re-create the original message from our
   * huffman encoding and return it...
   */
  public String decodeMessage(String encodedStr) {}
 
  /**
   * Uses args[0] as the filename, and reads in its contents. Then
   * instantiates a HuffmanConverter object, using its methods to
   * obtain our results and print the necessary output. Finally,
   * decode the message and compare it to the input file.<p>
   * NOTE: Example method provided below...
   *
   *
   */
  

}
