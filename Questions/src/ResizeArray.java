public class ResizeArray{
    int size = 0;
    String[] array;
    int top = 0;

    public ResizeArray(int size){
        this.size = size;
        array = new String[size];
    }

    public void push(String s){
        if(array.length==0){
            String[] newArray = new String[1];
            array = newArray;
        }
        if(top == array.length){
            resizeArray( 2*array.length);
        }
        System.out.printf("top: %d, pushed string: %s\n", top, s);
        array[top] = s;
        top++;
    }

    public void resizeArray(int newSize){
        String[] newArray = new String[newSize];
        System.out.printf("new Array size %d\n", newArray.length);
        for(int i = 0; i<array.length; i++){
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public void printAll(){
        for(int i = 0; i<array.length; i++){
            System.out.println("when i = " + i + ";" + "value = "+array[i]);
        }
    }

}