public class PersonLinkedList{
    private Node head;

    public PersonLinkedList(Person person){
        head = new Node();
        head.person = person;
        head.link = null;
    }

    public boolean insertItemFirst(Person person){
        Node n = new Node();
        n.person = person;
        n.link = head;
        head = n;
        return true;
    }

    public boolean insertItemLast(Person person){
        Node n = new Node();
        Node temp = head;
        while(temp.link!=null){
            temp = temp.link;
        }
        n.person = person;
        n.link = null;
        temp.link = n;
        return true;
    }

    public void printList(){
        Node z = head;
        while(z!=null){
            System.out.println(z.person);
            z = z.link;
        }
    }

    public boolean deleteItem(String name){
        if(name.equals(head.person.getName())){
            head = head.link;
            return true;
        }else{
            Node x = head;
            Node y = head.link;
            while(y!=null && !(y.person.getName().equals(name))){
                x = y;
                y = y.link;
            }
            if(y!=null){
                x.link = y.link;
                return true;
            }else{
                return false;
            }
        }
    }



    class Node{
        private Person person;
        private Node link;
    }
}