public class BinarySearchTree{

    private Node root;

    public BinarySearchTree(){
        root = null;
    }

    // I defined the rule to be the length of person name string
    public boolean insert(Person person){
        Node n = new Node();
        n.data = person;
        n.lc = null;
        n.rc = null;
        if(root == null){
            root = n;
            return true;
        }

        Node p = root;
        Node c = root;
        // find the node to add new node to 
        while(c!=null){
            p = c;
            if(person.getName().length()<=c.data.getName().length()){   
                c = c.lc;             
            }else{
                c = c.rc;
            }
        }

        // determine add to be left or right child of this node
        if(person.getName().length() <= p.data.getName().length()){
            p.lc = n;
        }else{
            p.rc = n;
        }

        return true;
    }

    public Node findNode(String key){
        Node c  = root;
        while(c!=null){
            if(key.length() == c.data.getName().length()){
                while(!key.equals(c.data.getName())){
                    c = c.lc;
                }
                break;
            }if(key.length() < c.data.getName().length()){
                c = c.lc;
            }else{
                c = c.rc;
            }
        }

        return c;
    }

    public Node findParent(String childKey){
        Node p = root;
        Node c = root;
        do {
            if(childKey.length()== c.data.getName().length()){
                // since support the same length of string to be added as left child, 
                //then when the length is the same, compare with the real string, 
                //if not the same, the parent should be current c
                while(c!=null){                   
                    if(!childKey.equals(c.data.getName())){
                        c = c.lc;
                        System.out.println("current c = "+c.data.getName());
                    } 
                    p = c;
                    break;                 
                }
                break; 

            }
            p = c;
            if(childKey.length()<c.data.getName().length()){
                c = c.lc;
            }else{
                c = c.rc;
            }
        } while (c!=null);
        if(c!=null){
            return p;
        }else{
            return null;
        }
    }

    public Person getData(Node n){
        return n.data;
    }

    public void showAll(Node n){
        Node p = n;
        if(p!=null){
            System.out.println(" "+p.data);
            showAll(p.lc);
            showAll(p.rc);
        }
    }


    public class Node{
        private Node lc;
        private Person data;
        private Node rc;
    }
}