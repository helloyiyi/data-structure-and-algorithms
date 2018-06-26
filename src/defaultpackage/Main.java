public class Main{
    public static void main(String[] args){

        InStack inStack = new InStack();
        if(!inStack.isFull()){
            inStack.push(2);
            inStack.push(4);
            inStack.push(6);
            inStack.push(9);
        }

        // System.out.println(inStack.pop());
        // System.out.println(inStack.pop());
        // System.out.println(inStack.pop());
        // System.out.println(inStack.pop());

        Person person1 = new Person("jason", "123");
        Person person2 = new Person("tim", "321");

        PersonStack stack = new PersonStack();

        // stack.push(person1);
        // stack.push(person2);

        // // System.out.println(stack.pop().toString());
        // // System.out.println(stack.pop().toString());


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