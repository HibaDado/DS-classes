package Stack;

import java.util.ArrayList;

public class Stack {
    private ArrayList list;

    public Stack() {
        list = new ArrayList();
    }

    public void push(Object data) { // بدي أضيف عالاري
        list.add(data);
    }

    public Object pop() {
        if (!isEmpty()){
            return list.remove(list.size() - 1);
        }else{
            return "can't remove : stack is empty";
        }
    }

    public Object peek() {
        if (!isEmpty()){
            return list.get(list.size() - 1);
        }else{
            return "can't remove : stack is empty";
        }
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.size() == 0? true : false;
    }
}
