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
        // System.out.println(stack.pop().toString());
        // System.out.println(stack.pop().toString());

    }
}