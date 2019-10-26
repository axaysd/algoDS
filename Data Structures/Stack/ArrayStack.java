class ArrayStack
{
    final int max = 1000;
    int top;
    int arr[] = new int[max];
    ArrayStack()
    {
        top = -1;
    }

    boolean isEmpty()
    {
        return (top<0);
    }

    int getSize()
    {
        return top+1;
    }

    void push(int new_data)
    {
        if(top>=1000)
        {
            System.out.println("Stack Overflow!");
            return;
        }
        arr[++top] = new_data;
    }
    
    int pop()
    {
        if(top<0)
        {
            System.out.println("Stack Underflow!");
        }
        int popped = arr[top--];
        return popped;
    }

    void printStack()
    {
        if(top<0)
        {
            System.out.println("Stack Underflow!");
            return;
        }
        int idx = top;
        System.out.println("The Stack is: ");
        for(int i=idx; i>=0; i--)
        {
            System.out.println(arr[i] + " ");
        }
        System.out.println("The size of the Stack is: " + getSize());
    }

    public static void main(String[] args)
    {
        ArrayStack as = new ArrayStack();
        as.push(1);
        as.push(2);
        as.push(3);
        as.push(4);
        as.push(5);
        as.pop();
        as.pop();
        as.printStack();
    }
}