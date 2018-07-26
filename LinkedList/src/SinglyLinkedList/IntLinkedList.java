public class IntLinkedList{
    public Node head;

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
            System.out.print(z.value +" >> ");
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

    
    public boolean deleteItemNotBubble(int item){
        if(head.value == item){
            head = head.link;
            return true;
        }else{
            Node temp = head;
            while(temp.link!=null){
                if(temp.value==item){
                    temp.value = temp.link.value;
                    temp.link = temp.link.link;
                    return true;
                }
                if(temp.link.link==null){
                    if(temp.link.value == item){
                        temp.link = null;
                        return true;
                    }
                }
                temp = temp.link;
            }
        }
        return false;
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

    public boolean isInThisList(Node n, int value){
        while(n!=null){
            if (n.value == value){
                return true;
            }
            n = n.link;
        }
        return false;
    }


    public IntLinkedList getIntersection(Node head1, Node head2)
    {
        IntLinkedList result = new IntLinkedList();
        result.printList();
        Node t1 = head1;
 
        // Traverse list1 and search each element of it in list2.
        // If the element is present in list 2, then insert the
        // element to result
        while (t1 != null)
        {
            if (isInThisList(head2, t1.value)){
                System.out.println("lalalalala "+t1.value);
                result.insertItemFirst(t1.value);
            }
            t1 = t1.link;
        }
        return result;
    }

    class Node{
        private int value;
        private Node link;
    }
}