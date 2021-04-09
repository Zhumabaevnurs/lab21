// LinkedList.java
// 
// This version uses three instance variables,
// a pointer to the first node, a pointer to
// the last node, and length, to make our
// append and getLength methods more efficient
// than the would be if our only instance
// variable were a pointer to the first node.
//
// This version uses a dummy first node.  Hence
// it needs less decision-making than it would
// need if a dummy first node were not used.
//

/**
 * Encapsulates a linked list of <code>String</code>.
 */
public class LinkedList {

	/** First node in linked list - dummy node */
	private ListNode first = new ListNode(null);

	/** Last node in linked list */
	private ListNode last = first;

	/** Number of data items in the list. */
	private int length = 0;

	/**
	 * Gets the number of data values currently stored in this LinkedList.
	 * 
	 * @return the number of elements in the list.
	 */

	public int getLength() {
		return length;
	}

	/**
	 * Appends a String data element to this LinkedList.
	 * 
	 * @param data
	 *            the data element to be appended.
	 */
	
	//append a new node to the end of the linked list
	public void append(String d) {
		// TODO Code here for append
		//Step1: create a new node
		ListNode newNode = new ListNode(d);
		//Step2: make connection, add the new node to the end of the linked list
		last.next = newNode;
		//Step3: if you need to update the field (first, last, length)
		last = newNode;
		length++;
		//Step4: check the boundary condition (empty linked list)

	} // method append(String)

	/**
	 * Prepends (adds to the beginning) a String data element to this
	 * LinkedList.
	 * 
	 * @param data
	 *            the data element to be prepended.
	 */
	
	public void prepend(String d) {
		// TODO Code here for prepend
		//Step1: create a new node 
		ListNode newNode= new ListNode(d);
		//check if it is empty liked list or not 
		if(first.next==null)
			last=newNode; // update the last node
		//Step2: make connection
		newNode.next=first.next;
		first.next = newNode;
		//step3: update
		length++;
		//step4: check the boundary condition 
		//we need to update the last node if it is empty linked list
		

		
		

	} // method append(String)

	/**
	 * @return String representation of elements in linked list delimited by a
	 *         space character
	 */
	public String toString() {
		ListNode p = first.next;
		String returnString = "";
		while (p != null) {
			returnString += p.data + " ";
			p = p.next;
		}
		return returnString;
	}

	/**
	 * Determines whether this ShortSequenceLinkedList is equal in value to the
	 * parameter object. They are equal if the parameter is of class
	 * ShortSequenceLinkedList and the two objects contain the same short
	 * integer values at each index.
	 * 
	 * @param other
	 *            the object to be compared to this ShortSequenceLinkedList
	 * 
	 * @return <code>true</code> if the parameter object is a
	 *         ShortSequenceLinkedList containing the same numbers at each index
	 *         as this ShortSequenceLinkedList, <code>false</code> otherwise.
	 */
	public boolean equals(Object other) {
		if (other == null || getClass() != other.getClass()
				|| length != ((LinkedList) other).length)
			return false;

		ListNode nodeThis = first;
		ListNode nodeOther = ((LinkedList) other).first;
		while (nodeThis != null) {
			// Since the two linked lists are the same length,
			// they should reach null on the same iteration.

			if (nodeThis.data != nodeOther.data)
				return false;

			nodeThis = nodeThis.next;
			nodeOther = nodeOther.next;
		} // while

		return true;
	} // method equals

} // class LinkedList

