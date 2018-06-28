public class Main{
    public static void main(String[] args){
        IntDoublyLinkedList l = new IntDoublyLinkedList(2);
        l.insertItemFirst(3);
        l.insertItemFirst(5);
        l.insertItemLast(7);
        //l.deleteItem(3);
        l.printList();
    }
}