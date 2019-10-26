class Node
{
    int data;
    Node left, right;
    Node(int val)
    {
        data = val;
        left = right = null;
    }
}

class BinarySearchTree
{
    Node root;
    BinarySearchTree()
    {
        root = null;
    }

    Node search(int new_data)
    {
        Node temp = searchBST(root, new_data);
        return temp;
    }

    Node searchBST(Node root, int new_data)
    {
        if(root == null || root.data == new_data)
        {
            return root;
        }
        if(new_data<root.data)
        {
            return searchBST(root.left, new_data);
        }
        return searchBST(root.right, new_data);
    }

    void insert(int new_data)
    {
        root = insertBST(root, new_data);
    }

    Node insertBST(Node root, int new_data)
    {
        if(root == null)
        {
            root = new Node(new_data);
            return root;
        }
        if(new_data<root.data)
        {
            root.left = insertBST(root.left, new_data);
        }
        else if(new_data>root.data)
        {
            root.right = insertBST(root.right, new_data);
        }
        return root;
    }

    void printPreOrder(Node root)
    {
        if(root == null)
        {
            return;
        }
        Node temp = root;
        System.out.print(temp.data + " ");
        printPreOrder(temp.left);
        printPreOrder(temp.right);
    }

    void printInOrder(Node root)
    {
        if(root == null)
        {
            return;
        }
        Node temp = root;
        printInOrder(temp.left);
        System.out.print(temp.data + " ");
        printInOrder(temp.right);
    }

    void printPostOrder(Node root)
    {
        if(root == null)
        {
            return;
        }
        Node temp = root;
        printPostOrder(temp.left);
        printPostOrder(temp.right);
        System.out.print(temp.data + " ");
    }

    void printPreOrder(){printPreOrder(root);}
    void printInOrder(){printInOrder(root);}
    void printPostOrder(){printPostOrder(root);}

    public static void main(String[] args)
    {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(3);
        bst.insert(1);
        bst.insert(2);
        bst.insert(4);
        bst.insert(5);
        System.out.println("BST in PreOrder: ");
        bst.printPreOrder();
        System.out.println("\nBST in InOrder: ");
        bst.printInOrder();
        System.out.println("\nBST in PostOrder: ");
        bst.printPostOrder();
        if(bst.search(3)!=null)
        {
            System.out.println("\nYes, the key exists!");
        }
        else
        {
            System.out.println("\nNo, the key doesn't exist!");
        }
    }
}