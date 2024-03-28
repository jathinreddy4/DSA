import java.util.*;

class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
public class LLtohashset
{
    public static HashSet<Integer>  lltohash(Node head)
    {
        HashSet<Integer> st = new HashSet<>();
        Node temp = head;
        while(temp != null)
        {
            st.add(temp.data);
            temp = temp.next;

        }
        return st;
    }
    public static void main(String args[])
    {
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = new Node(7);
        head.next.next.next.next = new Node(1);
        head.next.next.next.next.next = new Node(2);
        head.next.next.next.next.next.next= new Node(6);

        HashSet<Integer> st = lltohash(head);
        System.out.println(st);

    }
}