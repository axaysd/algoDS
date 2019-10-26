class SinglyLinkedList
{
    public SinglyLinkedList()
    {
        int length=0;
    }
    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    Node head;
    private int length=0;

    public void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
        length++;
    }

    public void insertAfter(int new_data, int position)
    {
        int i;
        Node temp = head;
        Node new_node = new Node(new_data);
        for(i=1; i<position&&temp!=null; i++)
        {
            temp = temp.next;
        }
        new_node.next = temp.next;
        temp.next = new_node;
        length++;
    }

    public void append(int new_data)
    {
        Node temp = head;
        Node new_node = new Node(new_data);
        while(temp.next!=null)
        {
            temp = temp.next;
        }
        temp.next = new_node;
        length++;
    }

    public void deleteAtPos(int position)
    {
        Node temp = head;
        if(position==1)
        {
            head = temp.next;
        }
        for(int i=1; i<position-1&&temp!=null; i++)
        {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        length--;
    }

    public void deleteMatching(int val)
    {
        if(head.data==val)
        {
            head = head.next;
        }
        Node temp = head.next;
        Node prev = head;
        while(temp!=null&&prev!=null)
        {
            if(temp.data==val)
            {
                prev.next = prev.next.next;
                length--;
            }
            temp = temp.next;
            prev = prev.next;
        }
    }

    public int getLength()
    {
        return length;
    }

    public void printList()
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        SinglyLinkedList ll = new SinglyLinkedList();
        System.out.println("\nLength of the Linked List is: " + ll.getLength());
        for(int i=1; i<=5; i++)
        {
            ll.push(i);
        }
        System.out.println("\nLength of the Linked List is: " + ll.getLength());
        ll.insertAfter(9,5);
        ll.printList();
        ll.append(10);
        ll.printList();
        ll.deleteAtPos(3);
        ll.printList();
        System.out.println("\nLength of the Linked List is: " + ll.getLength());
        ll.insertAfter(5, 3);
        ll.printList();
        ll.deleteMatching(5);
        ll.printList();
        ll.deleteMatching(10);
        ll.printList();
        System.out.println("\nLength of the Linked List is: " + ll.getLength());
    }
}