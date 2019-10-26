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
class LinkedStack
{
    Node top;
    private int size=0;
    LinkedStack()
    {
        int size=0;
        top = null;
    }

    boolean isEmpty()
    {
        if(top==null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    int getSize()
    {
        return size;
    }

    void push(int new_data)
    {
        Node new_node = new Node(new_data);
        if(top==null)
        {
            top = new_node;
        }
        else
        {
            new_node.next = top;
            top = new_node;
        }
        size++;
    }

    int pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack Underflow");
            return -1;
        }
        else
        {
            int popped = top.data;
            top = top.next;
            size--;
            return popped;
        }
    }

    int peek()
    {
        if(top==null)
        {
            System.out.println("Stack Underflow");
            return -1;
        }
        else
        {
            return top.data;
        }
    }

    void printStack()
    {
        Node temp = top;
        System.out.println("The Stack is: ");
        while(temp!=null)
        {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("The size of the stack is: " + getSize());
    }

    public static void main(String[] args)
    {
        LinkedStack st = new LinkedStack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.printStack();
        System.out.println("Top element: " + st.peek());
        st.pop();
        st.pop();
        st.printStack();
    }
}