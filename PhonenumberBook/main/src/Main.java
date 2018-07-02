public class Main{
    public static void main(String[] args){
        Trie t = new Trie();
        t.insert("6138888888", "yiyi");
        t.insert("6132222222", "xiaoxi");
        t.insert("61328","yiyi");

        System.out.println(t.search("6138888888"));
        System.out.println(t.getNumbers("yiyi"));
        System.out.println(t.getName("61328"));
    }
}