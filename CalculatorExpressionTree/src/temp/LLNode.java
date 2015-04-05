package temp;
//----------------------------------------------------------------------------
// Implements Integer nodes for a Linked List.
//----------------------------------------------------------------------------


public class LLNode<T> {
  protected T info;
  protected LLNode<T> rightChild;
  protected LLNode<T> leftChild;
  
  public LLNode(T info)
  {
    this.info = info;
    rightChild = null;
    leftChild = null;
  }
 
  public void setInfo(T info)
  // Sets info T of this LLStringNode.
  {
    this.info = info;
  }

  public T getInfo()
  // Returns info T of this LLStringNode.
  {
    return info;
  }
 
  public void setRightChild(LLNode link)
  {
	  rightChild = link;
  }
  
  public void setLeftChild(LLNode link)
  {
	  leftChild = link;
  }

  public LLNode getRightChild()
  {
    return rightChild;
  }
  
  public LLNode getLeftChild()
  {
    return leftChild;
  }
//  
//  /* additional two methods from homework code */
//  public LLNode(T info, LLNode<T> link) {
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
 
 