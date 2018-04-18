public class Main {
  /// This class tests your LinkedList170 code
  
 public static void main(String[] args) {
    LinkedList170 ls = new LinkedList170();
    System.out.println("LinkedList170 is empty: " + ls.isEmpty());
    System.out.println("The size is: " + ls.size()); 
    System.out.println(ls); 

    int i1 = 4;
    int i2 = 6;
    int i3 = 8;
    
    System.out.println("\nAdding first three nodes using addFirst!");
    ls.addFirst(i3);
    ls.addFirst(i2);
    ls.addFirst(i1);
    ls.addFirst(10);
    //ls.addFirst(20);
    
    System.out.println("LinkedList170 is empty: " + ls.isEmpty()); 
    System.out.println("The size is: " + ls.size()); 
    System.out.println(ls); 

    System.out.println("\nTesting getFirst().. " );
    System.out.println("The data in the first node is: " + ls.getFirst());
      
    System.out.println("\nTesting contains method...");
    System.out.println("LinkedList170 contains 6: " + ls.contains(6));
    System.out.println("LinkedList170 contains 6: " + ls.contains(6));
    System.out.println("LinkedList170 contains 600: " + ls.contains(600));
    
    
    System.out.println("\nTesting set method with good inputs...");
    ls.set(2, 600);
    ls.set(0, 40);
    System.out.println("LinkedList170 is empty: " + ls.isEmpty()); 
    System.out.println("The size is: " + ls.size()); 
    System.out.println(ls); 
      
    ls.removeNthNode(1);
  
    System.out.println("\nAbout to test addNode(index, data) using good inputs");
    ls.addNode(2, 200);
    System.out.println(ls);
    ls.addNode(0, 90);// adds a node in the first position (index of 0).
    System.out.println("LinkedList170 is empty: " + ls.isEmpty()); 
    System.out.println("The size is: " + ls.size()); 
    System.out.println(ls); 

   
    System.out.println("\nAbout to test removeNthNode(index) using good inputs.");
    //ls.removeNthNode(); //removes last node
    ls.removeNthNode(3); //removes first node
    System.out.println("LinkedList170 is empty: " + ls.isEmpty()); 
    System.out.println("The size is: " + ls.size()); 
    System.out.println(ls);   
    



    //DON'T RUN UNTIL YOU HAVE EXCEPTION HANDLING IMPLEMENTED*/

    System.out.println("\nTesting set method with bad inputs...");
    ls.set(-1, 20); //bad input
    ls.set(6, 1); //bad input 
    ls.set(ls.size(), 4000); // bad input
    System.out.println("LinkedList170 is empty: " + ls.isEmpty()); 
    System.out.println("The size is: " + ls.size()); 
    System.out.println(ls); 

    System.out.println("\nAbout to test addNode(index, data), using bad inputs");
    ls.addNode(ls.size() + 1, 4000); // bad input
    ls.addNode(-1, 4000);// bad input
    System.out.println("LinkedList170 is empty: " + ls.isEmpty()); 
    System.out.println("The size is: " + ls.size()); 
    System.out.println(ls); 


    System.out.println("\nAbout to test removeNthNode(index) using bad inputs.");
    ls.removeNthNode(-100000);// bad input
    ls.removeNthNode(ls.size()); // bad input
    System.out.println("LinkedList170 is empty: " + ls.isEmpty()); 
    System.out.println("The size is: " + ls.size()); 
    System.out.println(ls); 
    


  }
}
