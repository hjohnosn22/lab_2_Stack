public class StackNode<T> {
    private T data;
    private StackNode parent;
    private StackNode child;
    public StackNode(){
    }
    public StackNode(T data){
        this.data = data;
    }
    public StackNode(T data, StackNode parent, StackNode child){
        this.data = data;
        this.parent = parent;
        this.child = child;
    }
    public void setData(T data){
        this.data = data;
    }
    public void setParent(StackNode parent){
        this.parent = parent;
    }
    public void setChild(StackNode child){
        this.child = child;
    }
    public T getData(){
        return data;
    }
    public StackNode getParent(){
        return parent;
    }
    public StackNode getChild(){
        return child;
    }
    public String toString(){
        return "Node: "+data.toString();
    }
    public boolean equals(StackNode n) {
        return this.data.equals(n.getData());
    }

}
