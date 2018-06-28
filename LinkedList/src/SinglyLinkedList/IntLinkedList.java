public class IntLinkedList{
    private Node head;

    public IntLinkedList(){
        head = new Node();
        head.value = 0;
        head.link = null;
    }

    public boolean insertItemFirst(int item){
        Node n = new Node();
        n.value = item;
        n.link = head;
        head = n;
        return true;
    }

    public boolean insertItemLast(int item){
        Node n = new Node();
        Node temp = head;
        while(temp.link!=null){
            temp = temp.link;
        }
        n.value = item;
        n.link = null;
        temp.link = n;
        return true;
    }

    public void printList(){
        Node z = head;
        while(z!=null){
            System.out.println(z.value);
            z = z.link;
        }
    }

    public boolean deleteItem(int item){
        if(head.value == item){
            head = head.link;
            return true;
        }else{
            Node x = head;
            Node y = head.link;
            while(true){
                if(y == null || y.value == item){
                    break;
                }else{
                    x = y;
                    y = y.link;
                }
            }
            if(y!=null){
                x.link = y.link;
                return true;
            }else{
                return false;
            }
        }
    }

    // bubble sorting algorithm
    public void sortList(){
        int c = 0;
        Node a = head;
        while(a.link!=null){
            Node b = head;
            while(b.link !=null){
                if(b.value<b.link.value){
                    c = b.value;
                    b.value = b.link.value;
                    b.link.value = c;
                }
                b = b.link;
            }
            a = a.link;
        }
    }

    class Node{
        private int value;
        private Node link;
    }
}