import java.util.*;
public class Trie{
    private class TrieNode{
        Map<Character, TrieNode> children;
        boolean endOfWord;
        public TrieNode(){
            children = new HashMap<Character,TrieNode>();
            endOfWord = false;
        }
    }

    private TrieNode root;

    public Trie(){
        root  = new TrieNode();
    }

    public void insert(String word){
        TrieNode current = root;
        for(int i = 0; i<word.length();i++){
            char ch = word.charAt(i);
            TrieNode node = current.children.get(ch);
            if(node == null){
                node = new TrieNode();
                current.children.put(ch, node);
            }
            current = node;
        }
        current.endOfWord = true;
    }

    public boolean search(String word){
        TrieNode current = root;
        for(int i = 0; i< word.length();i++){
            char ch = word.charAt(i);
            TrieNode node = current.children.get(ch);
            if(node == null){
                return false;
            }
            current = node;
        }
        return current.endOfWord;
    }

    public boolean delete(String word){
        return delete(root, word, 0);
    }

    public boolean delete(TrieNode current, String word, int index){
        // when word length matches the index, check the endOfWord boolean, 
        // if it's true, then check if there are any other children after this one, 
        // if so, do not delete all the reference, just flip the endOfWord to be false
        // otherwise, return true then delete the whole word.
        if(index == word.length()){
            if(!current.endOfWord){
                return false;
            }
            current.endOfWord = false;
            return current.children.size() == 0;
        }

        char ch = word.charAt(index);
        TrieNode node = current.children.get(ch);
        if(node == null){
            return false;
        }

        boolean shouldDeleteALlWord = delete(node, word, index +1);

        if(shouldDeleteALlWord){
            current.children.remove(ch);
            // If the last character of this word has no child after it, it will be deleted totally
            return current.children.size() == 0;
        }

        return false;

    }

}