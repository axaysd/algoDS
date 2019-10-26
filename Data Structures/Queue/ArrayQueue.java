class ArrayQueue
{
    final int max=1000;
    int arr[] = new int[max];
    int front=0, rear=0;
    ArrayQueue()
    {
        front=rear=-1;
    }

    boolean isEmpty()
    {
        return (front<0);
    }

    void enqueue(int new_data)
    {
        if(rear>=1000)
        {
            System.out.println("Queue too large!");
            return;
        }
        if(isEmpty())
        {
            front++;
        }
        arr[++rear] = new_data;
    }

    int dequeue()
    {
        if(rear<0)
        {
            return -1;
        }
        int popped = arr[rear];
        rear = rear-1;
        return popped;
    }

    void printQueue()
    {
        System.out.println("The Queue is: ");
        for(int i=0; i<=rear; i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("The size of the Queue is: " + (rear+1));
        System.out.println("The front element is: " + arr[front]);
        System.out.println("The rear element is: " + arr[rear]);
    }

    public static void main(String[] args)
    {
        ArrayQueue aq = new ArrayQueue();
        aq.enqueue(1);
        aq.enqueue(2);
        aq.enqueue(3);
        aq.enqueue(4);
        aq.enqueue(5);
        aq.printQueue();
        aq.dequeue();
        aq.dequeue();
        aq.printQueue();
    }
}