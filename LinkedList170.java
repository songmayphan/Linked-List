/*
   May Phan
   On my honour I have not given nor received, nor witnessed
   any unauthorized assistance on this work except my professor's advice during her office hour
   */
 
public class LinkedList170{
    // The head or first node, initially null

   private Node head;

  /**
   * No-argument constructor creates a linked list with no elements.
   */
   public LinkedList170() {
      head = null;
   }
  
  /**
   * A linked list is empty if its head node is null.
   * @return whether the list is empty.
   */
   public boolean isEmpty() {
      return (head == null);
   }
  
  /**
   * removeFirst removes the first node of the list. If the list was
   * empty, it does nothing. removeFirst does not return the node. To
   * remove the first node and return it, first call getFirst() and then
   * call removeFirst()
   */
   public void removeFirst() {
      if(head != null) {
         head = head.getNext();
      }
   }

  /**
   * size calculates length of the list by traversing
   * @return the number of nodes in the list
   */
   public int size() {
      int length = 0;
      Node temp = head;
      while (temp != null) {
         temp = temp.getNext();
         length++;
      }
      return length;
   }
  
  /**
   * toString calculates the string representation of the list by
   * traversing it and giving the concatenation of the string
   * representation of the constituent nodes
   * @return the string representation of the list
   */
   
   public String toString() {
      String rep = "head ->  ";
      Node current = head;
      while(current != null) {
         rep += current.toString() + "  ->  ";
         current = current.getNext();
      }
      return rep + "null";
   }

  /**Method that returns the first node of the list
   * @return head the node at the beginning of the list
   */
   public Node getFirst(){
     
      if (head == null){
         return null;
      }
      else {
         return this.head;
      }
   }
  /**
   *Method that add a node with given value to the front of the list
   *@param vaue the node's data/value
   */
   public void addFirst(int value){
   
      Node n = new Node( value );
      n.setNext(head);
      head = n;
   }
  
  /**
   *A method that returns the index of the node inthe linked list with given value
   *@param value the value to be assigned
   *@return index if value at the node at the index matches value
   */
   public int contains(int value)  {
      Node temp = head;
      int index = 0;
      
      while (temp != null) {
         if ( temp.getData() == value)
            return index;
         index++;
         temp = temp.next;
      }
      return -1;
   }
  
     /**
      *A helper method that return a node with given index
      *@param index the index of the node to be refered
      *@return current the node at given index
      */  
  public Node getTo(int index) {
		Node current = head;
		for (int i = 0; i < index; i++) {
			current = current.next;
		}
		return current;
	}

  /** 
   *A method that set or reset a node at given index with given value
   *@param index the index of the node to be assigned
   *@param value the value of the node to be assigned
   */
   
   public void set(int index, int value) {
   if (index < 0 || index > size() - 1) {
         throw new IllegalArgumentException("Illegal index to linked list at index: " + index); 
   }
      Node current = getTo(index);
      current.setData(value);
   }
  
     /**
      *Method that remove a node at a given index
      *@param index the index to be removed
      */
  
   public void removeNthNode(int index) {
   
   //if linked list is empty
      if ( head == null){
         return; 
      }
      Node temp = head;
      Node prev = null;
      int count = 0;
      Node emptyNode = null;
      
      if (index < 0 || index > size() - 1) {
         throw new IllegalArgumentException("Illegal index to linked list at index: " + index); //make new error object and points to the error 
      }
      if  (index == 0) {
         temp = head;
         head = head.getNext();
         temp.next = emptyNode;
         return;  
      }
      else {
         prev = head;
         count = 1;
         while (count < index ) {
            prev = prev.next;
            count++;
         }
      }
      Node current = prev.next;
      prev.next= current.next;
         
   }
     /**  
      *A method that add a node with specific value at a given index
      *@param index index to be inserted
      *@param value data of the node to be inserted
      */
   public void addNode(int index, int value) {
         
      Node newNode = new Node(value); //create a new node
   
   
      if (index < 0 || index >= size() + 1) {
         throw new IllegalArgumentException("Illegal index to linked list at index: " + index); 
      }
           
      if(index == 0) { 
         newNode.setNext(head);
         head = newNode;
      }
      else if ( index > 0 && index < size() - 1 ){
      
         Node current = head;
         Node prev = null;
         int count = 0;
      
         while(count < index) { //loop until find the given position.
            prev = current;
            current = current.next;
            count++;
         }
      
         prev.next = newNode;
         newNode.next = current;
      
      }
   }
}