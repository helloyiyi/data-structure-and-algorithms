public class HashFunction{
    String[] array;
    int size;
    int itemsInArray = 0;

    public static void main(String[] args){
        HashFunction hf = new HashFunction(30);
        String[] add = {"31","35", "60", "72"};

        //hf.hashFunction1(add, hf.array);

        hf.hashFunction2(add, hf.array);

        hf.display();
        hf.findKey("60");
    }

    public void hashFunction1(String[] stringsForArray, String[] array){
        for(int i=0; i< stringsForArray.length; i++){
            String newElementVal = stringsForArray[i];
            array[Integer.parseInt(newElementVal)] = newElementVal;
        }
    }

    public void hashFunction2(String[] stringsForArray, String[] array){
        for(int i=0; i< stringsForArray.length; i++){
            String newElementVal = stringsForArray[i];
            
            int arrayIndex = Integer.parseInt(newElementVal)%29;

            System.out.println("Modules Index=" + arrayIndex + "for value"+ newElementVal);

            while(array[arrayIndex]!=null){
                ++arrayIndex;
                System.out.println("Collision Try " + arrayIndex+" Instead");
                arrayIndex %= size;
            }

            array[arrayIndex] = newElementVal;
        }
    }

    // use the same index calculation rule to find it 
    public String findKey(String key){
        int arrayIndexHash = Integer.parseInt(key) % 29;
        while(array[arrayIndexHash]!=null){
            if(array[arrayIndexHash]==key){
                System.out.println(key + "was found in Index "+arrayIndexHash);

                return array[arrayIndexHash];
            }
            arrayIndexHash++;
        }
        return null;
    }


    HashFunction(int s){
        size = s;
        array = new String[s];
    }

    public void display(){
        for(int i = 0; i<size; i++){
            System.out.print( array[i] + ">>");
        }

    }


} 