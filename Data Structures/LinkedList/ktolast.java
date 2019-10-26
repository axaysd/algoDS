import java.util.Scanner;
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

class ktolast
{
    ktolast()
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
            temp.next = temp.next.next;
            length--;
        }
        temp = temp.next;
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

    Node kthtolast(int k)
    {
        Node current = head;
        while(current!=null)
        {
            Node runner = current;
            for(int i=1; i<=k; i++)
            {
                runner = runner.next;
            }
            if(runner==null)
            {
                return current;
            }
            current = current.next;
        }
        return null;
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
        Scanner sc = new Scanner(System.in);
        int k;
        ktolast kl = new ktolast();
        kl.push(3);
        kl.push(2);
        kl.push(1);
        kl.append(5);
        kl.append(6);
        kl.append(7);
        kl.insertAfter(4, 3);
        kl.insertAfter(2, 7);
        kl.insertAfter(2, 4);
        kl.printList();
        kl.deleteDups();
        kl.printList();
        k = sc.nextInt();
        Node kthnode = kl.kthtolast(k);
        System.out.print("\n" + k + "th to last element is: " + kthnode.data + "\n");
    }
}