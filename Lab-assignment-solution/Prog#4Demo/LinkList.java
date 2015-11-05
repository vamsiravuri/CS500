/*
 *   Sample code for LinkList Class
 */

public class LinkList {
		
	IntegerNode head;         // head of the list		 
		 
		 public void insert(int pos, IntegerNode item)    //add one node there
		 {
			 IntegerNode dummy = new IntegerNode(-1, null); // dummy node to assist the programming
			 dummy.next = head;
			 
			 IntegerNode curr = dummy;
			 
			 while(--pos >= 0)                            // find the position, curr.next will be right position to add new node there
			 {
				 curr = curr.next;				 
			 }
			 
			 item.next = curr.next;                     //insert the node in the list
			 curr.next = item;
			 
			 head = dummy.next;                          // update head
		 }
		 
		 
		 public IntegerNode get(int pos)
		 {
			 // add your code here
		 }
		 
		 public void remove(int value)
		 {
			// add your code here
		 }
		 
		 
		 public String toString()   //return the string representation of the list
		 {
			StringBuilder ret = new StringBuilder();
			IntegerNode curr = head;
			
			 while (curr != null)
			 {
				 if(curr != head)
				 {
					 ret.append("->"); 
				 }
				 ret.append(curr.item);
				 curr = curr.next;
			 }			
			return ret.toString();
			
		 }
		 
		
		 public static void main(String[] args)
		 {
		 
		    LinkList list = new LinkList();
		      list.insert(0,new IntegerNode(10));
		      list.insert(0,new IntegerNode(20));
		      IntegerNode s = list.get(1);
		      System.out.println("Item at index 1 is " + s );
		      list.insert(2,new IntegerNode(30));
		      
		      System.out.println("Before removing: ");
		      System.out.println(list);
		      list.remove(10);
		      System.out.println("After removing: ");
		      System.out.println(list);
		 }

	}
