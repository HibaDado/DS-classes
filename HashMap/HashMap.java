package HashMap;

public class HashMap {
  LinkedList [] arr = new LinkedList[10];

    public int hashFun(long key){
        return (int)(key % arr.length);
    }

    public void put(long key, String value){
        int hashValue = hashFun(key);
        if (arr[hashValue] == null){
            arr[hashValue] = new LinkedList();
            arr[hashValue].addLast(value,key);
        }
        arr[hashValue].addLast(value, key);
    }

    public Object get(long key){
        int hashValue = hashFun(key);
        int flag = 0;
        for (int i = 0; i < arr[hashValue].size(); i++) {
            if(arr[hashValue].getKey(i).equals(key)){
                return arr[hashValue].get(i);
            }
        }
        return "not found";
    }
}
