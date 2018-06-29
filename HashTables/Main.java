public class Main{
    public static void main(String[] args){
        HashTable hashtable = new HashTable();

        Student std1 = new Student("yiyi", "15-123", 5.0);
        Student std2 = new Student("xiaoxi", "15-453", 4.0);
        Student std3 = new Student("sree", "15-333", 3.8);
        Student std4 = new Student("ethan", "15-321", 2.0); // the hashcode will be the same as std1

        int std1key = hashtable.toHashCode(std1.getRollno());
        hashtable.insert(std1key, std1);

        int std2key = hashtable.toHashCode(std2.getRollno());
        hashtable.insert(std2key, std2);

        int std3key = hashtable.toHashCode(std3.getRollno());
        hashtable.insert(std3key, std3);

        int std4key = hashtable.toHashCode(std4.getRollno());
        hashtable.insert(std4key, std4);

        hashtable.showData();

        Student new_std2 = hashtable.fetchStdInfo(std2.getRollno());
        if(new_std2.getName().equals(std2.getName())){
            System.out.println("Equal");
        }

        hashtable.deleteStd(std4.getRollno());

        hashtable.showData();
    }
}