class Node
{
    int data;
    Node next;
    Node(int val)
    {
        data = val;
    }
}

class deleteMiddleNode
{
    private int length = 0;
    Node head = null;
    deleteMiddleNode()
    {
        int length = 0;
    }

    void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
        length++;
    }

    void insertAfter(int new_data, int position)
    {
        Node prev = head, temp = head;
        for(int i=1; i<=position&&temp!=null; i++)
        {
            prev = temp;
            temp = temp.next;
        }
        Node new_node = new Node(new_data);
        prev.next = new_node;
        new_node.next = temp;
        length++;
    }

    void append(int new_data)
    {
        Node temp = head;
        while(temp.next!=null)
        {
            temp = temp.next;
        }
        Node new_node = new Node(new_data);
        temp.next = new_node;
        length++;
    }

    void deleteMatching(int val)
    {
        Node prev=head, temp=head;
        if(head.data==val)
        {
            head = head.next;
        }
        while(temp!=null)
        {
            while(temp!=null&&temp.data!=val)
            {
                prev = temp;
                temp = temp.next;
            }
            if(temp==null){return;}
            prev.next = temp.next;
            temp = prev.next;
            length--;
        }
    }

    void deleteMiddleN0de()
    {
        
    }

    int getLength()
    {
        return length;
    }

    void printList()
    {
        Node temp = head;
        System.out.print("\nThe Linked List is: ");
        while(temp!=null)
        {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("\nThe length of the Linked List is: " + getLength());
    }

    public static void main(String[] args)
    {
        deleteMiddleNode dm = new deleteMiddleNode();
        dm.push(3);
        dm.push(2);
        dm.push(1);
        dm.insertAfter(4, 3);
        dm.append(5);
        dm.insertAfter(5, 2);
        dm.printList();
        dm.deleteMatching(5);
        dm.printList();
    }
}