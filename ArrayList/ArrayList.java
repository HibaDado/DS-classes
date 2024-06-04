package ArrayList;

public class ArrayList {
    private Object [] arr;
    private int num;
    public ArrayList(int size){
        arr = new Object[size];
        num = 0;
    }

    public int getSize() {
        return num;
    }

    public boolean add(Object element){
        if(num == arr.length){
            growUp();
        }
        this.arr[num] = element;
        num++;
        return false;
    }

    private void  growUp(){
        Object [] arr2 = new Object[arr.length * 2];
        for (int i = 0; i < arr.length; i++){
            arr2[i] = arr[i];
        }
        this.arr = arr2;
    }

    private void  growUp(int index){
        Object [] arr2 = new Object[index * 2 /*or (index) */];
        for (int i = 0; i < arr.length; i++){
            arr2[i] = arr[i];
        }
        this.arr = arr2;
    }

    public Object get(int index) {
        if (index < arr.length) {
            return arr[index];
        } else{
            return null;
        }
    }

    public boolean set(Object item, int index) {
        if (index >= arr.length){
            growUp(index);}
        arr[index] = item;
        if(index > num)
            num = index + 1;

        return true;
    }

    public boolean addFirst(Object item){
        if (num == arr.length){
            growUp();
        }
        for (int i = num-1; i >= 0; i--){
            this.arr[i+1] = this.arr[i];
        }
        this.arr[0] = item;
        num++;
        return true;
    }

    public boolean addByIndex(Object item, int index){
        if (num == arr.length){
            growUp();
        }
        for (int i = num-1; i >= 0; i--){
            this.arr[i+1] = this.arr[i];
        }
        this.arr[index] = item;
        num++;
        return true;
    }

    public boolean removeLast(){
        if(num > 0){
            num--;
            arr[num] = null;
            return true;
        } else{
            return false;
        }
    }

    public boolean removeFirst(){
        if (num > 0) {
            for (int i = 1; i < num; i++) {
                arr[i - 1] = arr[i];
            }
            num--;
            arr[num] = null;
            return true;
        } else {
            return false;
        }
    }

    public boolean removeByIndex(int index){
        if (num > 0 && index < arr.length && index >= 0) {
            for (int i = index+1; i < num; i++) {
                arr[i - 1] = arr[i];
            }
            num--;
            arr[num] = null;
            return true;
        } else {
            return false;
        }

    }

    public void printData(){
        System.out.println("************");
        for (int i = 0; i < num; i++){
            System.out.println(this.arr[i]);
        }
        System.out.println("************");
    }
}
