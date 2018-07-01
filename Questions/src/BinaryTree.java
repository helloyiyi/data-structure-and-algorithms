public class BinaryTree{
    private Node root;
    public static void main(String[] args){
        BinaryTree bt = new BinaryTree();
        Node root = bt.createTree();
        bt.printSubTreeOfThisNode(1);
        bt.printSubTreeOfThisNode(2);
        bt.printSubTreeOfThisNode(3);

        System.out.println("depth is "+ bt.getDepth());
        System.out.println("sum is "+bt.getSumAtDepth(root, 2));
    }

    public Node createTree(){
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        Node node8 = new Node(8);


        //      1
        //     / \
        //    2   3
        //   / \ / \
        //  4  6 7  8
        // /
        //5
        root = node1;
        node1.leftChild = node2;
        node1.rightChild = node3;
        node2.leftChild = node4;
        node2.rightChild = node6;
        node3.leftChild = node7;
        node3.rightChild = node8;
        node4.leftChild = node5;
        return node1;
    }

    public boolean printSubTreeOfThisNode(int nodeValue){
        if(root.value==nodeValue){
            String leftChild = root.leftChild==null?null:String.valueOf(root.leftChild.value);
            String rightChild = root.rightChild==null?null:String.valueOf(root.rightChild.value);  
            System.out.println("I am "+nodeValue +", my left child is "+leftChild+ ", my right child is "+rightChild);
            return true;
        }else{
            Node leftTemp = root;
            while(leftTemp.leftChild!=null){
                leftTemp = leftTemp.leftChild;
                if(leftTemp.value == nodeValue){          
                    String leftChild = leftTemp.leftChild==null?null:String.valueOf(leftTemp.leftChild.value);
                    String rightChild = leftTemp.rightChild==null?null:String.valueOf(leftTemp.rightChild.value);         
                    System.out.println("I am "+nodeValue +", my left child is "+ leftChild+ ", my right child is "+rightChild);
                    return true;
                }
            }
            Node rightTemp = root;
            while(rightTemp.rightChild!=null){
                rightTemp = rightTemp.rightChild;
                if(rightTemp.value == nodeValue){
                    String leftChild = rightTemp.leftChild==null?null:String.valueOf(rightTemp.leftChild.value);
                    String rightChild = rightTemp.rightChild==null?null:String.valueOf(rightTemp.rightChild.value);    
                    System.out.println("I am "+nodeValue +", my left child is "+ leftChild + ", my right child is "+rightChild);
                    return true;
                }
            }
            System.out.println("I am " + nodeValue +" and I am not in this tree");
            return false;
        }
    }

    public int getDepth(){
        if(root==null){
            return 0;
        }
        int depth = 1;
        while(root.leftChild!=null||root.rightChild!=null){
            root = root.leftChild==null?root.rightChild:root.leftChild;
            depth++;
        }
        return depth;
    }

    public int getSumAtDepth(Node n, int d){
        if(n==null){
            return 0;
        }
        if(d==0){
            return n.value;
        }else{
            return getSumAtDepth(n.leftChild, d-1)+getSumAtDepth(n.rightChild, d-1);
        }
    }
    

    private class Node{
        int value = 0;
        Node leftChild;
        Node rightChild;

        public Node(int value){
            this.value = value;
        }
    }
}