public class Main{
    public static void main(String[] args){
        IntLinkedList list = new IntLinkedList();
        list.insertItemFirst(5);
        list.insertItemFirst(8);
        list.insertItemFirst(4);
        //list.printList();

        list.deleteItemNotBubble(5);
        list.printList();

        list.insertItemLast(9);
        //list.printList();

        list.sortList();

        Person person1 = new Person("yiyi","18");
        Person person2 = new Person("xiaoxi","20");
        Person person3 = new Person("abccc","30");
        PersonLinkedList personList = new PersonLinkedList(person1);
        personList.insertItemFirst(person2);
        personList.insertItemLast(person3);
        //personList.printList();


        IntLinkedList list1 = new IntLinkedList();
        list1.insertItemFirst(3);
        list1.insertItemFirst(8);
        list1.insertItemFirst(9);
        list1.insertItemFirst(4);

        IntLinkedList list2 = new IntLinkedList();
        list2.insertItemFirst(5);
        list2.insertItemFirst(8);
        list2.insertItemFirst(4);

        IntLinkedList i = new IntLinkedList();
        //i.getIntersection(list1.head, list2.head).printList();
    }


}