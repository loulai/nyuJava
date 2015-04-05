package temp;
//----------------------------------------------------------------------------
// Implements Integer nodes for a Linked List, modified for an expression tree
//----------------------------------------------------------------------------


public class LLIntegerNode {
  protected Integer info;
  protected LLIntegerNode rightChild;
  protected LLIntegerNode leftChild;
 
  public LLIntegerNode(Integer element)
  {
    this.info = element;
    rightChild = null;
    leftChild = null;
  }
 
  public void setInfo(Integer info)
  // Sets info T of this LLStringNode.
  {
    this.info = info;
  }

  public Integer getInfo()
  // Returns info T of this LLStringNode.
  {
    return info;
  }
 
  public void setRightChild(LLIntegerNode link)
  {
	  rightChild = link;
  }
  
  public void setLeftChild(LLIntegerNode link)
  {
	  leftChild = link;
  }

  public LLIntegerNode getRightChild()
  {
    return rightChild;
  }
  
  public LLIntegerNode getLeftChild()
  {
    return leftChild;
  }
  
//  /* additional two methods from homework code */
//  public LLIntegerNode<Integer>(Integer info, LLIntegerNode<Integer> link) {
//	  	this.info = info;
//		this.link = link;
//	}
//	
//	public LLNode<T> pushValue(T info) {
//		return new LLNode<T>(info, this);
//	}
//	
//	public void swapFirstWithLargest(){
//		LLNode<Integer> currMax = (LLNode<Integer>) this;
//		Integer max = currMax.info;
//		LLNode<Integer> list = (LLNode<Integer>) this;
//		LLNode<Integer> storeFirst = (LLNode<Integer>) this;
//		
//		while(list != null){
//			if(list.info > max){
//				currMax = list;
//			}
//			list = list.link;
//		}
//		
//		Integer temp;
//		temp = storeFirst.info;
//		storeFirst.info = max;
//		currMax.setInfo(temp);
//	}
}
 
 