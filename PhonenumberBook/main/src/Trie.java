import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Trie {
    private Node root;
    private NameNumberMap contactDetails;
    /**
     Constructor for the Trie class.
     */
    public Trie(){
        root = new Node(' ',null);
        contactDetails = new NameNumberMap();
    }
    /**
     * Method to insert phone number into the Trie DS.
     * @param number is the phone number to be stored
     * @param name is the name of the person
     */
    public void insert(String number,String name){
        Node current = root;
        int length = number.length();
        if(length == 0){
            current.endOfPhoneNumber = true;   
        }
        // search from the trie to see if this phone number already exists
        if(!search(number)){        
            for(int i =0;i<length;i++){
                Node child = current.findSubNode(number.charAt(i));
                if(child!=null){
                    current = child;
                }else{ 
                    // if this character hasn't existed, add it as a child node                   
                    current.child.add(new Node(number.charAt(i), current));                    
                    current = current.findSubNode(number.charAt(i));
                }
            
                // set the last charactor node endOfPhoneNumber boolean to true
                if(i==length-1){
                    current.endOfPhoneNumber = true;
                    // set name with the last node
                    contactDetails.setDetails(current, name);
                }
            }
        }
    }
    /**
     * Method to search a phone number in the Trie. 
     * @param number is the phone number to be searched
     * @return true if phone number is found else returns false
     */
    public boolean search(String number){
        Node current = root;
        int length = number.length();
        while(current != null){
            for(int i=0;i<length;i++){
                if(current.findSubNode(number.charAt(i)) == null){
                    return false;
                }else{
                    current = current.findSubNode(number.charAt(i));
                }
            }
            
            if(current.endOfPhoneNumber == true){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
    
    /**
     * Method to get the name of the person if a phone number is given
     * @param number is the phone number for which the name is to be found
     * @return null if no name is there or the name of the person
     */
    public String getName(String number){
        Node current = root;
        int length = number.length();
        while(current != null){
            for(int i=0;i<length;i++){
                if(current.endOfPhoneNumber == true){
                   return contactDetails.getName(current);
                }
                current = current.findSubNode(number.charAt(i));
            }
        }
        return null;
    }

    /**
     * Method to get the phone number if name is given
     * @param name is the name for which the phone number is to be found
     * @return null if no number is found or the corresponding number
     */
    public ArrayList<String> getNumbers(String name){
        ArrayList<Node> result = contactDetails.getNodes(name);
        ArrayList<String> numbers = new ArrayList<String>();
        if(result.size()>0){
            for(Node node:result){
                    String reversedPhoneNumber = "";
                    while(node.parent!=null){
                        reversedPhoneNumber += node.content;
                        node = node.parent;
                    }
                    String phoneNumber = new StringBuffer(reversedPhoneNumber).reverse().toString();
                    numbers.add(phoneNumber);               
                }
            }
        return numbers;
    }
}