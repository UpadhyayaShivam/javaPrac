package linkedlist;

public class doublyLinkedList {
    Node Head ;

    class Node{
        String data;
        Node next;
        Node back;


        Node(){};

        Node(String data){
            this.data = data;
            this.next = null;
            this.back = null;
        }

    }

    void createHead(String data){
        if(Head == null){
            Node newNode = new Node(data);
            Head = newNode;
            return;
        }
        add(data);
    }

    void print(){
        System.out.println("printing linkedList ....");
        Node dummyNode = Head;

         while(dummyNode!=null){
            System.out.print(dummyNode.data + " <-> ");
            dummyNode = dummyNode.next;
        }
        System.out.println("null");

    }

    void DeleteNode(String data){
        
    }


    void add(String data){
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
        newNode.back = dummyNode;
    }


    public static void main(String[] args) {
     
        doublyLinkedList dbL1 = new doublyLinkedList();

        dbL1.add("Shivam");
        dbL1.add("Simran");
        dbL1.add("Isha");
        dbL1.add("Tanishqa");

        dbL1.print();



    }
    
}
