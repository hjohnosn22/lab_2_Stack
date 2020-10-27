public class Stack <T>{
    private StackNode<T> ancestorNode;
    private int size;
    public Stack(){
        size = 0;
        ancestorNode = new StackNode<T>();
    }
    public void push(T data){
        //moves to last node
        StackNode currNode = ancestorNode;
        for(int i = 0; i < size; i++){
            currNode = currNode.getChild();
        }
        //Creates a new node with data
        StackNode<T> newNode = new StackNode<T>(data);
        newNode.setParent(currNode);
        //adds 1 to size
        size++;
    }
    public StackNode pop(){
        //moves to last node
        StackNode currNode = ancestorNode;
        for(int i = 0; i < size; i++){
            currNode = currNode.getChild();
        }
        //removes currnode and saves the datatype
        StackNode parentNode = currNode.getParent();
        parentNode.setChild(currNode.getChild());
        size--;

        return (StackNode)currNode.getData();
    }
    public StackNode peek(){

    }
    public int size(){

    }
    public boolean isEmpty(){

    }
}
