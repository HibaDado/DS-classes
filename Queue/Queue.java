package Queue;

import java.util.LinkedList;
public class Queue {
    private LinkedList list;

    public Queue() {
        list = new LinkedList();
    }

    public void enQueue(Object data) {
        list.addLast(data);
    }

    public Object deQueue() {
        if (!isEmpty()) {
            return list.removeFirst();
        } else {
            return "can't remove : queue is empty";
        }
    }

    public Object front() {//برجعلي اول ايليمنت موجود بالكيو(اول واحد ضفته)
        if (!isEmpty()) {
            return list.get(0);
        } else {
            return "can't get : queue is empty";
        }
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.size() == 0 ? true : false;
    }
}
