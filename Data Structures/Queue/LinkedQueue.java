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

class LinkedQueue
{
    Node front, rear;
    private int size=0;
    LinkedQueue()
    {
        front=rear=null;
        size=0;
    }

    boolean isEmpty()
    {
        return (front==null);
    }

    int getSize()
    {
        return size;
    }

    void enqueue(int new_data)
    {
        Node new_node = new Node(new_data);
        if(isEmpty())
        {
            rear = front = new_node;
        }
        else
        {
            rear.next = new_node;
            rear = new_node;
        }
        size++;
    }
    
    int dequeue()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty!");
            return -1;
        }
        else
        {
            int popped = front.data;
            front = front.next;
            size--;
            return popped;
        }
    }

    void printQueue()
    {
        Node temp = front;
        System.out.println("The Queue is: ");
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("The size of the Queue is: " + getSize());
    }

    public static void main(String[] args)
    {
        LinkedQueue lq = new LinkedQueue();
        lq.enqueue(1);
        lq.enqueue(2);
        lq.enqueue(3);
        lq.enqueue(4);
        lq.enqueue(5);
        lq.dequeue();
        lq.dequeue();
        lq.printQueue();
    }
}