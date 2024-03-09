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
        LinkedListNode temp = head;
        LinkedListNode prev = null;  
 

    while (temp != null) {

        LinkedListNode front = temp.next;  
        temp.next = prev;        
        prev = temp;             
        temp = front;         
    }
    return prev;

    }

}

