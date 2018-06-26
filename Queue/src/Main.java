public class Main{
    public static void main(String[] args){

        Person person1 = new Person("jason", "123");
        Person person2 = new Person("tim", "321");


        Intq q = new Intq();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        //System.out.println(q.dequeue());
        q.enqueue(5);
        q.enqueue(6);
        q.enqueue(7);
        q.enqueue(8);
        q.enqueue(9);
        q.enqueue(10);

        // System.out.println(q.dequeue());
        // System.out.println(q.dequeue());
        // System.out.println(q.dequeue());
        // System.out.println(q.dequeue());
        // System.out.println(q.dequeue());
        // System.out.println(q.dequeue());
        // System.out.println(q.dequeue());
        // System.out.println(q.dequeue());
        // System.out.println(q.dequeue());

        //q.showAll();

        PersonQueue personq = new PersonQueue();
        personq.enqueue(person1);
        personq.showAll();
    }
}