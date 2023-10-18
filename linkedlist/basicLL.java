package linkedlist;
public class basicLL{

    Node Head;
    int cnt=0;
    class Node{
        int data ;
        Node next;

        Node(){};

        Node(int data){
            this.data = data;
            this.next = null;
        };

        Node(int data, Node next){
           this.data = data;
           this.next = next; 
        }
    }

    void createHead(int data){
        if(Head == null){

            Node newNode = new Node(data);
            Head = newNode;
            cnt++;
            return;
        }
        add(data);

    }

    void insertInBetween (int data,int n ){
        if(n>cnt){
            System.out.println("list isn't of that size");
            return;
        }
        if(Head == null ){
            createHead(data);
            return;
        }
        Node newNode = new Node(data);
        Node dummNode = Head;
        for (int i=1; i<n; i++) {
           dummNode = dummNode.next;
        }
        Node tempNode = dummNode.next;
        dummNode.next= newNode;
        newNode.next = tempNode;
        cnt++;
    }

    void insertAtHead(int data){
        System.out.println("inserting node at head ....");
        if(Head == null){
            createHead(data);
            return;
        }
        Node newNode = new Node(data,Head);
        Head = newNode;
        cnt++;
    }

    void print(){
        System.out.println("printing linkedList ....");
        Node dummyNode = Head;

         while(dummyNode!=null){
            System.out.print(dummyNode.data + "->");
            dummyNode = dummyNode.next;
        }
        System.out.println("null");

    }

    void add(int data){

        if(Head == null){
            createHead(data);
            return;
        }
        Node newNode = new Node(data);
        Node dummyNode = Head;

        while(dummyNode.next!=null){
            dummyNode = dummyNode.next;
        }

        dummyNode.next = newNode;
        cnt++;
    }



    public static void main(String[] args) {
        basicLL L1 = new basicLL();
        L1.add(0);       
        L1.add(1);
        L1.add(2);
        L1.add(3);
        L1.add(4);

        L1.print();

        L1.insertAtHead(-1);
        L1.print();
        System.out.println(L1.cnt);

        L1.insertInBetween(5, 3);
        L1.print();
        System.out.println(L1.cnt);

    }
}