public class BinarySearchTree{

    private Node root;

    public BinarySearchTree(){
        root = null;
    }

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
        while(c!=null){
            p = c;
            if(person.getName().compareTo(c.data.getName())<0){   
                c = c.lc;             
            }else{
                c = c.rc;
            }
        }

        if(person.getName().compareTo(p.data.getName())<0){
            p.lc = n;
        }else{
            p.rc = n;
        }

        return true;
    }

    public Node findNode(String key){
        Node c  = root;
        while(c!=null){
            if(key.compareTo(c.data.getName()) == 0){
                break;
            }if(key.compareTo(c.data.getName())<0){
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
            if(childKey.compareTo(c.data.getName())==0){
                break;
            }
            p = c;
            if(childKey.compareTo(c.data.getName())<0){
                c = c.lc;
            }else{
                c = c.rc;
            }
        } while (c!=null);
        System.out.println(">>"+p.data.getName());
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