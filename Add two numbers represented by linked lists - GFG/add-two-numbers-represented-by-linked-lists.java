//{ Driver Code Starts
// driver

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GfG{
    
    static void printList(Node n){
        while(n!=null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            
            int n = sc.nextInt();
            int val = sc.nextInt();
            
            Node first = new Node(val);
            Node tail = first;
            for(int i=0; i<n-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            int m = sc.nextInt();
            val = sc.nextInt();
            
            Node second = new Node(val);
            tail = second;
            for(int i=0; i<m-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            Solution g = new Solution();
            Node res = g.addTwoLists(first, second);
            printList(res);
        }
    }
}

// } Driver Code Ends


/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution{
    //Function to add two numbers represented by linked list.
    public static Node reverse(Node head){
        
        Node pre = null;
        
        Node curr = head;
        
        while(curr!=null){
            Node next = curr.next;
            
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        
        return pre;
        
        
    }
    static Node addTwoLists(Node first, Node second){
        // code here
        // return head of sum list
        
        // reverse both linked list
        Node head1 = reverse(first);
        Node head2 = reverse(second);
        
        
        int carry = 0;
        
        Node dummy = new Node(0);
        Node temp = dummy;
        
        while(head1!=null || head2!=null || carry!=0){
            
            int sum = 0;
            
            if(head1!=null){
                sum += head1.data;
                head1 = head1.next;
            }
            
            if(head2!=null){
                sum += head2.data;
                head2 = head2.next;
            }
            
            
            sum = sum + carry;
            
            carry = sum/10;
            
            Node newNode = new Node(sum%10);
            
            temp.next = newNode;
            temp = temp.next;
            
            
        }
        
        Node ans = reverse(dummy.next);
        
        return ans;
        
        
    
        
    }
}