public class HashTable{
    private StdList[] arr;
    private int size;
    private int totalStds;

    public HashTable(){
        size = 1000; // default size
        arr = new StdList[size];
    }

    public int toHashCode(String rollno){
        int addAsciis = 0;
        int codeValue = 0;
        for(int i=0; i < rollno.length(); i++){
            addAsciis = addAsciis + (int)rollno.charAt(i);
        }
        codeValue = addAsciis % arr.length;
        return codeValue;
    }

    public boolean insert(int key, Student data){
        if(arr[key]==null){
            arr[key] = new StdList();
        }
        arr[key].insertStd(data);
        totalStds++;
        return true;
    }

    public int getTotal(){
        return totalStds;
    }

    public Student fetchStdInfo(String rollno){
        int key = toHashCode(rollno);
        if(arr[key] == null){
            return null;
        }
        else{
            Student q = arr[key].fetchData(rollno);
            if(q!=null){
                return q;
            }else{
                return null;
            }
        }
    }

    public boolean deleteStd(String rollno){
        boolean have = arr[toHashCode(rollno)].haveRollno(rollno);
        if(have){
            int key = toHashCode(rollno);
            arr[key].deleteStudent(rollno);
            totalStds--;
            return true;
        }
        return false;
    }

    public void showData(){
        for(int i = 0; i < arr.length; i++){
            if(arr[i]!=null){
                arr[i].showAll();
            }
        }
    }
}