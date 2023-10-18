package stack;


// stack implementation using array
public class stack01 {

    private int arr[] ;
    private int capacity;
    private int Top;

    // creating stack 
    stack01(int size){
        arr = new int[size];
        capacity = size;
        Top=-1;
    }

    // adding elements
    public void push(int x){
        if(isFull()){
            System.out.println("stack overflow .... ");
        }else{
        System.out.println("inserting " + x + " in stack ....");
        arr[++Top] = x;}
    }

    // deleting element from stack
    public int pop(){
        if(isEmpty()){
            System.out.println("stack is empty ....");
        }
            System.out.println("deleting element ....");
            return arr[Top--];
    }

    public int size(){
        return Top+1;
    }

    public boolean isFull(){
        return Top == capacity-1;
    }

    public boolean isEmpty(){
        return Top == -1;
    }

    public void printStack(){
        System.out.println("printing stack ..");
        for (int i = 0; i <=Top; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        stack01 st = new stack01(5);

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        st.printStack();

    }

}
