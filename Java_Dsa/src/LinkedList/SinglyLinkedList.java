package LinkedList;

public class SinglyLinkedList {
    private class Node{
        int val;
        Node next;
        public Node(int val){
            this.val = val;
        }
    }
    private Node head;
    private Node tail;
    private int size;

//    O(1)
    public void addFirst(int item){
        Node nn = new Node(item);
        if(size == 0){
            head = nn;
            tail = nn;
            size++;
        }else{
            nn.next = head;
            head = nn;
            size++;
        }
    }
//    O(1)
    public void addLast(int item){
        if(size == 0){
           addFirst(item);
        }else{
            Node nn = new Node(item);
            tail.next = nn;
            tail = nn;
            size++;
        }
    }
//    O(N)
    public void addatindex(int item, int k){
        if(k== 0){
            addFirst(item);
        }
        if(k == size){
            addLast(item);
        }else{
            Node prev = getNode(k-1);
            Node nn = new Node(item);
            nn.next = prev.next;
            prev.next = nn;
            size++;
        }
    }
//    O(N)
    private Node getNode(int k){
        Node temp = head;
        for(int i = 0 ; i< k ;  i++){
            temp = temp.next;
        }
        return temp;
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.val + " ");
            temp = temp.next;
        }
        System.out.println(".");
    }
//    O(1)
    public int getfirst(){
        return head.val;
    }
//    O(1)
    public int getlast(){
        return tail.val;
    }
//    O(N)
    public int getatindex(int k){
        return getNode(k).val;
    }
//    O(1)
    public int removefirst(){
        Node curr = head;
        if(size == 1){
            head = null;
            tail = null;
        }else{
            head = head.next;
            curr.next = null;
        }
        size--;
        return curr.val;
    }
    public int removelast() {

        if (size == 1) {
            return removefirst();
        } else {
            Node prev = getNode(size - 2);
            tail = prev;
            tail.next = null;

            size--;
            return prev.val;
        }
    }
     public int removeatindex(int k){
         if(k == 0){
             return removefirst();
         }
         else if( k == size -1){
             return removelast();
         }else{
             Node prev = getNode(k-1);
             Node curr = prev.next;
             prev.next = curr.next;
             curr.next = null;
             size--;
             return curr.val;
         }
        }
    }
