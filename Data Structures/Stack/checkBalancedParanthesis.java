import java.util.Scanner;
class Node
{
    char data;
    Node next;
    Node(char val)
    {
        data = val;
        next = null;
    }
}

class checkBalancedParanthesis
{
    Node top;
    private int size=0;
    checkBalancedParanthesis()
    {
        int size=0;
        top = null;
    }

    int getSize()
    {
        return size;
    }

    boolean isEmpty()
    {
        return (top==null);
    }

    void push(char new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = top;
        top = new_node;
        size++;
    }

    char pop()
    {
        if(isEmpty())
        {
            return '\0';
        }
        char popped = top.data;
        top = top.next;
        return popped;
    }
    
    void printStack()
    {
        if(isEmpty())
        {
            System.out.println("Stack Underflow!");
            return;
        }
        Node temp = top;
        System.out.println("The Stack is: ");
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("The size of the Stack is: " + getSize());
    }

    boolean areComplimentary(char ch1, char ch2)
    {
        if(ch1=='{'&&ch2=='}')
        {
            return true;
        }
        else if(ch1=='('&&ch2==')')
        {
            return true;
        }
        else if(ch1=='['&&ch2==']')
        {
            return true;
        }
        else
        {
            return false;
        }
    }


    boolean checkBalanced(String str)
    {
        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i)=='{'||str.charAt(i)=='('||str.charAt(i)=='[')
            {
                push(str.charAt(i));
            }
            else if(str.charAt(i)=='}'||str.charAt(i)==')'||str.charAt(i)==']')
            {
                return (areComplimentary(pop(), str.charAt(i)));
            }
        }
        return false;
    }

    public static void main(String[] args)
    {
        checkBalancedParanthesis cb = new checkBalancedParanthesis();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(cb.checkBalanced(str))
        {
            System.out.println("It is balanced!!");
        }
        else
        {
            System.out.println("It is not balanced!!");
        }
    }
}