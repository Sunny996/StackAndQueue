package main;

public class MyStack<K> {
    private final MyLinkedList<K> myLinkedList;

    public MyStack() {
        this.myLinkedList = new MyLinkedList();
    }

    public void push(INode element) {
        myLinkedList.addNode(element);
    }

    public INode<K> peak() {
        return myLinkedList.getHead();
    }

    public INode<K> pop() {
        return myLinkedList.pop();
    }

    public void printStack() {
        myLinkedList.print();
    }
}


