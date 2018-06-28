public class Person{
    private String name;
    private String age;

    public Person(String name, String age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public String toString(){
        return "Name: " + this.name + " Age: " + this.age;
    }
}