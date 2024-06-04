package BST;

public class BST {
    Node root;

    public BST() {
        this.root = null;
    }

    public void insert(Object data){
        if (root == null){
            this.root = new Node(data);
        } else{
            Node temp = root;
            if(data instanceof String){
                insert(data+"",temp);
            } else{
                insert(data,temp);
            }
        }
    }
    private void insert(Object data, Node temp){
        double x = Double.parseDouble(data +"");
        double y = Double.parseDouble(temp.getData() +"");
        if(x > y){
            if(temp.getRight() == null){
                temp.setRight(new Node(data));
                return;
            } else {
                insert(data, temp.getRight());
            }
        } else{
            if(temp.getLeft() == null) {
                temp.setLeft(new Node(data));
                return;
            } else {
                insert(data, temp.getLeft());
            }
        }
    }
    private void insert(String data, Node temp){
        String y = temp.getData() +"";
        if(y.compareTo(data) < 0){
            if(temp.getRight() == null){
                temp.setRight(new Node(data));
                return;
            } else {
                insert(data, temp.getRight());
            }
        } else{
            if(temp.getLeft() == null) {
                temp.setLeft(new Node(data));
                return;
            } else {
                insert(data, temp.getLeft());
            }
        }
    }

    public boolean search(Object data){
        if (root == null){
            return false;
        } else{
            Node temp = root;
            if(data instanceof String){
                return search(data+"", temp);
            } else{
                return search(data, temp);
            }
        }
    }

    private boolean search(String data, Node temp) {
        if (temp == null) {
            return false;
        } else {
            String y = temp.getData() + "";
            if (y.compareTo(data) == 0) {
                return true;
            } else if (y.compareTo(data) < 0) {
                return search(data, temp.getRight());
            } else {
                return search(data, temp.getLeft());
            }
        }
    }
    private boolean search(Object data, Node temp) {
        if (temp == null) {
            return false;
        } else {
            double y = Double.parseDouble(temp.getData() + "");
            double x = Double.parseDouble(data + "");
            if (x == y) {
                return true;
            } else if (y < x) {
                return search(data, temp.getRight());
            } else {
                return search(data, temp.getLeft());
            }
        }
    }

    public boolean remove(Object data){
        if (root == null){
            return false;
        } else{
            Node temp = root;
            if(data instanceof String){
                return remove(data+"", temp, null);
            } else{
                return remove(data, temp, null);
            }
        }
    }

    private boolean remove(String data, Node temp, Node parent) {
        if (temp == null) {
            return false;
        } else {
            String y = temp.getData() + "";
            if (y.compareTo(data) == 0) {

                if(temp.getLeft() == null && temp.getRight() == null){ //بحالة كانleaf
                    removeLeaf(temp, parent);
                } else{
                    if (temp.getRight() != null){
                        Node right = temp.getRight();
                        if(right.getLeft() == null){
                            temp.setData(right.getData());
                            temp.setRight(right.getRight());
                            right.setRight(null);
                            right = null;
                        } else{
                            Node parRight = right;
                            while (right.getLeft() != null){
                                parRight = right;
                                right = right.getLeft();
                            }
                            temp.setData(right.getData());
                            removeLeaf(right,parRight);
                        }
                    } else{
                        if(parent.getRight() == temp){
                            parent.setRight(temp.getLeft());
                        } else{
                            parent.setLeft(temp.getLeft());
                        }
                        temp.setLeft(null);
                        temp = null;
                    }
                }
                return true;
            } else if (y.compareTo(data) < 0) {
                return remove(data, temp.getRight(), temp);
            } else {
                return remove(data, temp.getLeft(), temp);
            }
        }
    }
    private boolean remove(Object data, Node temp, Node parent) {
        if (temp == null) {
            return false;
        } else {
            double y = Double.parseDouble(temp.getData() + "");
            double x = Double.parseDouble(data + "");
            if (y == x) {
                if(temp.getLeft() == null && temp.getRight() == null){ //بحالة كانleaf
                    removeLeaf(temp, parent);
                }else {
                    if (temp.getRight() != null){
                        Node right = temp.getRight();
                        if(right.getLeft() == null){
                            temp.setData(right.getData());
                            temp.setRight(right.getRight());
                            right.setRight(null);
                            right = null;
                        } else{
                            Node parRight = right;
                            while (right.getLeft() != null){
                                parRight = right;
                                right = right.getLeft();
                            }
                            temp.setData(right.getData());
                            removeLeaf(right,parRight);
                        }
                    } else{
                        if(parent.getRight() == temp){
                            parent.setRight(temp.getLeft());
                        } else{
                            parent.setLeft(temp.getLeft());
                        }
                        temp.setLeft(null);
                        temp = null;
                    }
                }
                return true;
            } else if (y < x) {
                return remove(data, temp.getRight(), temp);
            } else {
                return remove(data, temp.getLeft(), temp);
            }
        }
    }
    private void removeLeaf(Node temp, Node parent){
        if(parent.getRight() == temp){
            parent.setRight(null);
            temp = null;
        } else{
            parent.setLeft(null);
            temp = null;
        }
    }

    public void PrintInorder(){
        PrintInorder(root);
    }

    private void PrintInorder(Node temp) {
        if(temp == null){
            return;
        } else{
            PrintInorder(temp.getLeft());
            System.out.println(temp.getData()+"");
            PrintInorder(temp.getRight());
        }
    }

    public void PrintPreorder(){
        PrintPreorder(root);
    }

    private void PrintPreorder(Node temp) {
        if(temp == null){
            return;
        } else{
            System.out.println(temp.getData()+"");
            PrintPreorder(temp.getLeft());
            PrintPreorder(temp.getRight());
        }
    }

    public void PrintPostorder(){
        PrintPostorder(root);
    }

    private void PrintPostorder(Node temp) {
        if(temp == null){
            return;
        } else{
            PrintPostorder(temp.getLeft());
            PrintPostorder(temp.getRight());
            System.out.println(temp.getData()+"");
        }
    }

}

