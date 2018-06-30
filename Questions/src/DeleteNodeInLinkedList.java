public class DeleteNodeInLinkedList{
    public static void main(String[] args){
        LinkedList l = new LinkedList();
        
        l.pushInFront(5);
        l.pushInFront(2);
        l.pushInFront(4);
        l.pushInFront(8);

        l.deleteByPosition(0);
        l.deleteByData(4);

        l.printList();

    }


    public static class LinkedList{

        Node head;

        public void pushInFront(int newData){
            Node n = new Node(newData);
            n.next = head;
            head = n;
        }

        public void deleteByPosition(int p){
            // if linked list is empty
            if(head == null){
                return;
            }

            Node temp = head;

            // if needs to remove head
            if(p == 0){
                head = temp.next;
                return;
            }

            //Find previous node of the node needs to be delete
            for(int i = 0; i < p - 1 && temp!=null; i++){
                temp = temp.next;
                // if position is more than number of nodes
                if(temp == null || temp.next == null){
                    return;
                }
            }

            // Change the next node of the previous node of the note to be deleted to be the one after the one to be deleted
            Node next = temp.next.next;
            temp.next = next;

        }

        public void deleteByData(int d){
            if(head == null){
                return;
            }
            if(head.data == d){
                head = head.next;
                return;
            }
            Node temp = head;
            while(temp!=null){
                if(temp.next.data == d){
                    temp.next = temp.next.next;
                    return;
                }
                temp = temp.next;
            }
        }

        public void printList(){
            Node n = head;
            while(n!=null){
                System.out.print(n.data + " -> ");
                n = n.next;
            }
        }

        public class Node{
            int data;
            Node next;

            Node(int d){
                data = d;
                next = null;
            }
        }
    }
}