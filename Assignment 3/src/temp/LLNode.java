//----------------------------------------------------------------------------
// Implements Integer nodes for a Linked List.
//----------------------------------------------------------------------------

package temp;

public class LLNode<T> {
  protected T info;
  protected LLNode<T> link;
 
  
  public LLNode(T info)
  {
    this.info = info;
    link = null;
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
 
  public void setLink(LLNode link)
  // Sets link of this LLStringNode.
  {
    this.link = link;
  }

  public LLNode getLink()
  // Returns link of this LLStringNode.
  {
    return link;
  }
}
 
 