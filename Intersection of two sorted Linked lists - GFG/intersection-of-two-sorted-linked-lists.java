//{ Driver Code Starts
import java.io.*;
import java.util.*;
class Node 
{
    int data;
    Node next;
    
    Node(int a)
        {
            data = a;
            next = null;
        }
}
class GfG
{
    static Scanner sc = new Scanner(System.in);
    public static Node inputList(int size)
    {
        Node head, tail;
        int val;
        
        val = sc.nextInt();
        
        head = tail = new Node(val);
        
        size--;
        
        while(size-->0)
        {
            val = sc.nextInt();
            tail.next = new Node(val);
            tail = tail.next;
        }
        
        return head;
    }
    
    public static void printList(Node n)
    {
        while(n!=null)
        {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
    
    public static void main(String args[])
        {
            
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n , m;
                    
                    n = sc.nextInt();
                    m = sc.nextInt();
                    
                    Node head1 = inputList(n);
                    Node head2 = inputList(m);
                    
                    Solution obj = new Solution();
                    
                    Node result = obj.findIntersection(head1, head2);
	    
	                printList(result);
	                System.out.println();
                }
        }
}
// } Driver Code Ends


/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution
{
   public static Node findIntersection(Node head1, Node head2)
    {
        Node head3 = null;
        Node curr3 = null;
        while(head1 != null && head2 != null) {
            
            //System.out.println(head1.data + ", " + head2.data);
            
            if (head1.data > head2.data) {
                head2 = head2.next;
            }
            
            else if (head2.data > head1.data) {
                head1 = head1.next;
            }
            
            else {
                Node node = new Node(head1.data);
                if (head3 == null) {
                    head3 = node;
                    curr3 = node;
                }
                else {
                    curr3.next = node;
                    curr3 = curr3.next;
                }
                
                head1 = head1.next;
                head2 = head2.next;
            }
        }
        
        return head3;
    }
}