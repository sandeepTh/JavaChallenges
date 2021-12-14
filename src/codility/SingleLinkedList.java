package codility;

public class SingleLinkedList {

    Node head = null;


    public static SingleLinkedList insetData(int data, SingleLinkedList list){

        Node newNode = new Node(data);
        if(list.head==null) {
            list.head = newNode;
        }
            else{

                Node tail = list.head;
                while (tail.next!= null){
                    tail = tail.next;
                }

                tail.next = newNode;
            }

        return list;
    }

    public static void main(String[] args){

        SingleLinkedList list = new SingleLinkedList();
        list =  insetData(8,list);
        list =  insetData(4,list);
        list =  insetData(5,list);
    }





}


class Node{

    Node next;
    int data;

    public Node( int data) {
        this.next = next;
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
