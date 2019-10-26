class Node
{
    int val;
    Node left, right;
    Node(int data)
    {
        val = data;
        left = right = null;
    }
}

class BinaryTree
{
    Node root;
    public BinaryTree()
    {
        root = null;
    }
    void printPreOrder(Node node)
    {
        if(node==null) return;
        System.out.print(node.val + " ");
        printPreOrder(node.left);
        printPreOrder(node.right);
    }
    void printInOrder(Node node)
    {
        if(node==null) return;
        printInOrder(node.left);
        System.out.print(node.val + " ");
        printInOrder(node.right);
    }
    void printPostOrder(Node node)
    {
        if(node==null) return;
        printPostOrder(node.left);
        printPostOrder(node.right);
        System.out.print(node.val + " ");
    }

    void printPreOrder() {printPreOrder(root);}
    void printInOrder() {printInOrder(root);}
    void printPostOrder() {printPostOrder(root);}

    public static void main(String[] args)
    {
        BinaryTree bt = new BinaryTree();
        bt.root = new Node(1);
        bt.root.left = new Node(2);
        bt.root.right = new Node(3);
        bt.root.left.left = new Node(4);
        bt.root.right.right = new Node(5);
        System.out.print("\nPre-Order: ");
        bt.printPreOrder();
        System.out.print("\nIn-Order: ");
        bt.printInOrder();
        System.out.print("\nPost-Order: ");
        bt.printPostOrder();
    }
}