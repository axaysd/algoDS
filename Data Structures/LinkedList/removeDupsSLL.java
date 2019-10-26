class Node
{
    int data;
    Node next;
    Node(int val)
    {
        data = val;
        next = null;
    }
}

class removeDupsSLL
{
    removeDupsSLL()
    {
        int length=0;
    }
    private int length=0;
    Node head;
    
    void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
        length++;
    }

    void insertAfter(int new_data, int position)
    {
        Node temp = head;
        Node new_node = new Node(new_data);
        for(int i=1; i<position&&temp!=null; i++)
        {
            temp = temp.next;
        }
        new_node.next = temp.next;
        temp.next = new_node;
        length++;
    }
    
    void append(int new_data)
    {
        Node new_node = new Node(new_data);
        Node temp = head;
        while(temp.next!=null)
        {
            temp = temp.next;
        }
        temp.next = new_node;
        length++;
    }

    void deleteMatching(int val)
    {
        if(head.data == val)
        {
            head = head.next;
        }
        Node temp = head;
        while(temp!=null)
        {
            while(temp.next.data!=val&&temp!=null)
            {
                temp = temp.next;
            }
            if(temp==null)
            {
                return;
            }
            else
            {
                temp.next = temp.next.next;
                length--;
            }
            temp = temp.next;
        }
    }

    void deleteDups()
    {
        Node current = head;
        while(current!=null)
        {
            Node runner = current;
            while(runner.next!=null)
            {
                if(runner.next.data==current.data)
                {
                    runner.next = runner.next.next;
                    length--;
                }
                else
                {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }

    int getLength()
    {
        return length;
    }

    void printList()
    {
        Node temp = head;
        System.out.println("\nThe Linked List: ");
        while(temp!=null)
        {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("\nThe length of the SLL: " + getLength());
    }

    public static void main(String[] args)
    {
        removeDupsSLL rd = new removeDupsSLL();
        rd.push(3);
        rd.push(2);
        rd.push(1);
        rd.append(5);
        rd.append(6);
        rd.append(7);
        rd.insertAfter(4, 3);
        rd.insertAfter(2, 7);
        rd.insertAfter(2, 4);
        rd.printList();
        rd.deleteDups();
        rd.printList();
    }
}