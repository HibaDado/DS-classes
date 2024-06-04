package HashMap;

public class Node {
    Object data;
    private Object key;
    Node next;

    public Node(Object data) {
        this.data = data;
    }


    public Node(Object data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node(Object data, Object key) {
        this.data = data;
        this.key = key;
    }

    public Object getKey() {
        return key;
    }

    public void setKey(Object key) {
        this.key = key;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}

