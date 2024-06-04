package HashMap;

public class LinkedList {
    Node head;
    int num = 0;

    public LinkedList() {

    }

    public LinkedList(Object data) {
        this.head = new Node(data);
    }

    public boolean addFirst(Object data) {
        if (head == null){
            head = new Node(data);
            num++;
            return true;
        }
        Node newNode = new Node(data);
        newNode.setNext(head);
        head = newNode;
        num++;
        return true;
    }

    public boolean addLast(Object data) {
        if (head == null){
            head = new Node(data);
            num++;
            return true;
        }
        Node w = new Node(data);

        Node temp = head;

        while(temp.getNext() != null){
            temp = temp.getNext();
        }

        temp.setNext(w);
        num++;
        return true;
    }

    public boolean addLast(Object data,Object key) {
        if (head == null){
            head = new Node(data,key);
            num++;
            return true;
        }
        Node w = new Node(data,key);
        Node temp = head;

        while(temp.getNext() != null){
            temp = temp.getNext();
        }

        temp.setNext(w);
        num++;
        return true;
    }

    public boolean addByIndex(Object data, int index){
        Node newNode = new Node(data);
        if (head == null){
            if(index==0){head=newNode;
                head.next=null;
                num++;
                return true;
            }
            else
                return false;
        }
        if(index==0){
            num++;
            newNode.next=head;
            head=newNode;
            return true;
        }
        Node temp = head;
        while(index > 1 && temp != null){
            temp = temp.getNext();
            index--;
        }
        if (index != 1){
            return false;
        }

        newNode.setNext(temp.getNext());
        temp.setNext(newNode);
        num++;
        return true;
    }

    public Object removeFirst(){
        if(head == null){
            return null;
        }
        Node temp = head;
        head.setNext(head.getNext());
        num--;
        return temp.getData();
    }

    public Object removeLast(){
        if(head == null){
            return null;
        }
        Node temp = head;
        while (temp.getNext().getNext() != null){
            temp = temp.getNext();
        }
        Node tD = temp.getNext();
        temp.setNext(null);
        num--;
        return tD.getData();
    }

    public Object removeByIndex(int index){
        if(head == null){
            return null;
        }
        Node temp = head;
        Node tempPre = null;

        while (index > 0 && temp != null){
            tempPre = temp;
            temp = temp.getNext();
            index--;
        }
        if (index != 0){
            return null;
        }
        tempPre.setNext(temp.getNext());
        num--;
        return temp.getData();
    }

    public int size(){
        int count =0;
        Node temp = head;
        while(temp != null){
            temp = temp.getNext();
            count++;
        }
        return count;
    }

    public Object get(int index){
        Node temp = head;
        while(index > 0 && temp != null){
            temp = temp.getNext();
            index--;
        }
        if(index != 0){
            return null;
        }
        return  temp.getData();
    }

    public Object getKey(int index){
        Node temp = head;
        while(index > 0 && temp != null){
            temp = temp.getNext();
            index--;
        }
        if(index != 0){
            return null;
        }
        return  temp.getKey();
    }

    public void printList(){
        System.out.print("[ ");
        for (int i = 0; i < size(); i++){
            System.out.print(get(i) + " ");
        }
        System.out.println("]");
    }


}

