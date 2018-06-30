public class RecursiveReplaceLetter{

    public static void main(String[] args){
        String example = "hello world, I am yiyi, I am happy to be here today.";
        char oldChar = 'o';
        char newChar = 'x';

        System.out.println(replace(example, oldChar, newChar));
    }

    public static String replace(String s, char o, char n){
        if(s.length()<1){
            return s;
        }else{
            char first = o;
            if(o == s.charAt(0)){
                first = n;
            }else{
                first = s.charAt(0);
            }

            return first + replace(s.substring(1), o, n);
        }
    }



}