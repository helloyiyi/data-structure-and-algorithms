public class Main{
    public static void main(String[] args){
        Person person1 = new Person("22", "18");
        Person person2 = new Person("1", "20");
        Person person3 = new Person("333", "30");
        Person person4 = new Person("444", "25");
        Person person5 = new Person("555", "19");

        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(person1);
        bst.insert(person2);
        bst.insert(person3);
        bst.insert(person4);
        bst.insert(person5);
        bst.showAll(bst.findNode("22"));

        //System.out.println(bst.getData( bst.findParent("1")));
        //System.out.println(bst.getData( bst.findParent("22")));
        // System.out.println(bst.getData( bst.findParent("333")));
        System.out.println(bst.getData( bst.findParent("333")));
        // System.out.println(bst.getData( bst.findParent("55555")));
       


    }
}