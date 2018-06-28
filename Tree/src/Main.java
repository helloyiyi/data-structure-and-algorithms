public class Main{
    public static void main(String[] args){
        Person person1 = new Person("yiyi", "18");
        Person person2 = new Person("xiaoxi", "20");
        Person person3 = new Person("andy", "30");
        Person person4 = new Person("rachel", "25");
        Person person5 = new Person("sree", "19");

        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(person1);
        bst.insert(person2);
        bst.insert(person3);
        bst.insert(person4);
        bst.insert(person5);
        bst.showAll(bst.findNode("yiyi"));

        System.out.print(bst.getData( bst.findParent("rachel")));
       


    }
}