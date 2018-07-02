import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class NameNumberMap {
    
    /* a map of phone number node and name */
    HashMap<Node, String> details;
    
    public NameNumberMap(){
        details = new HashMap<Node, String>();
    }
    
    public void setDetails(Node node, String name){
        if(!details.containsKey(node)){
            details.put(node, name);
        }
    }
    
    public String getName(Node node){
        if(details.containsKey(node)){
            return details.get(node);
        }
        return null;
    }
    
    public ArrayList<Node> getNodes(String name){
        ArrayList<Node> result = new ArrayList<Node>();
        for(Iterator<Node> it = details.keySet().iterator();it.hasNext();){
            Node temp = it.next();
            String nm = details.get(temp);
            if(nm.equals(name)){
                result.add(temp);
            }
        }
        return result;
    }
}