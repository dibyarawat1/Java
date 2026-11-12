package LinkedList;

public class LinkedListClient {
    public static void main(String[] args){
        SinglyLinkedList sl = new SinglyLinkedList();
        sl.addFirst(10);
        sl.addFirst(20);
        sl.addFirst(30);
        sl.addLast(40);
        sl.addatindex(9,2);
        sl.display();
    }
}
