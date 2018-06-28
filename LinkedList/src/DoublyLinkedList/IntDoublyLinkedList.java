public class IntDoublyLinkedList{
    private Node head;

    public IntDoublyLinkedList(int item){
        head = new Node();
        head.value = item;
        head.prev = null;
        head.next = null;
    }

    public boolean insertItemFirst(int item){
        Node n = new Node();
        n.value = item;
        n.prev = null;
        n.next = head;
        head.prev = n;
        head = n;
        return true;
    }

    public boolean insertItemLast(int item){
        Node n = new Node();
        n.value = item;
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = n;
        n.prev = temp;
        n.next = null;

        return true;
    }


    public void printList(){
        Node z = head;
        while(z!=null){
            System.out.println(z.value);
            z = z.next;
        }
    }

    public boolean deleteItem(int item){
        if(head.value == item){
            head = head.next;
            return true;
        }else{
            Node x = head;
            Node y = head.next;
            while(true){
                if(y == null || y.value == item){
                    break;
                }else{
                    x = y;
                    y = y.next;
                }
            }
            if(y!=null){
                x.next = y.next;
                return true;
            }else{
                return false;
            }
        }
    }


    class Node{
        private Node prev;
        private int value;
        private Node next;
    }
}