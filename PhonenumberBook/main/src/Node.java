import java.util.Collection;
import java.util.LinkedList;

public class Node {
    char content;
    boolean endOfPhoneNumber;
    Node parent;
    Collection<Node> child;
    
    public Node(){ }
    
    /**
     * Constructor to create a Node
     * @param c is the character to be stored in the Node
     * @param current is the parent node to the Node that is going to be created
     */
    public Node(char c, Node current){
        child = new LinkedList<Node>();
        endOfPhoneNumber = false;
        parent = current;
        content = c;
    }
    /**
     * Method that returns the corresponding sub node of the current node
     * @param c is the content value of the sub node
     * @return null if the node is not found or returns the corresponding sub node
     */
    public Node findSubNode(char c){
        if(child!=null){
            for(Node eachChild:child){
                if(eachChild.content == c){
                    return eachChild;
                }
            }
        }
        return null;
    }
    /**
     * 
     * @param child
     * @return 
     */
    public Node findParent(Node child){
        if(child!=null){
            return child.parent;
        }
        return null;
    }
}