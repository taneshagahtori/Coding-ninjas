import java.io.*;
import java.util.* ;

/*
	Following is the structure of the Singly Linked List.	
	class LinkedListNode<T> 
    {
    	T data;
    	LinkedListNode<T> next;
    	public LinkedListNode(T data) 
        {
        	this.data = data;
    	}
	}

*/
public class Solution 
{
      public static LinkedListNode<Integer> reverseLinkedList(LinkedListNode<Integer> head) 

    {

        // Write your code here!

        LinkedListNode temp = head;  // temp points to the head of the original linked list

        LinkedListNode prev = null;  // prev initially points to null as there's no node before head yet

 

    while (temp != null) {

        LinkedListNode front = temp.next;  // front points to the next node in the original order

        temp.next = prev;        // reverse the next pointer of temp to point to the previous node

        prev = temp;             // update prev to the current node

        temp = front;            // move temp to the next node in the original order

    }

 

    return prev;

    }

}