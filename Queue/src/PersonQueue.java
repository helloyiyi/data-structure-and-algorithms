public class PersonQueue{
    private Person [] q;
    private int size;
    private int total;
    private int front;
    private int rear;

    public PersonQueue(){
        size = 4;
        total = 0;
        front = 0;
        rear = 0;
        q = new Person[size];
    }

    public PersonQueue(int size){
        this.size = size;
        total = 0;
        front = 0;
        rear = 0;
        q = new Person[this.size];
    }

    public boolean enqueue(Person item){
        if(isFull()){
            return false;
        } else{
            total++;
            q[rear] = item;
            rear = (rear +1) % size;
            return true;
        }
    }

    public boolean isFull(){
        if(size == total){
            return true;
        }else{
            return false;
        }
    }

    public Person dequeue(){
        Person item = q[front];
        total--;
        front = (front +1) % size;
        return item;
    }

    public void showAll(){
        int f = front;
        if(total != 0){
            for(int i=0;i<total;i++){
                System.out.print("front="+f);
                System.out.println("value=" + q[f]);
                f = (f+1)%size;
            }
        }   
     }
}