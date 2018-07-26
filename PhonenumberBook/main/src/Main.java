import java.util.*;
import java.util.regex.*;

public class Main{
    public static final String TEXT = "Hi, my name is yiyi, my phone number is 6138888888 and 6139999999";
   
    public static void main(String[] args){

        Trie t = new Trie();
        ArrayList<String> numbers  =  retrievePhoneNumber(TEXT);
        for(String number:numbers){
            t.insert(number, "yiyi");
        }
        t.insert("6132222222", "xiaoxi");
        t.insert("61328","yiyi");

        System.out.println(t.search("6138888888"));   
        System.out.println(t.getNumbers("yiyi"));
        System.out.println(t.getName("61328"));
    }

    public static ArrayList<String> retrievePhoneNumber(String text){
        ArrayList<String> finds = new ArrayList<String>();
        String number = "[0-9]{10}";
        Pattern pattern = Pattern.compile(number);
        Matcher matcher = pattern.matcher(text);
        while(matcher.find()){
            String find = matcher.group();
            finds.add(find);
        }
        return finds;
    }
}