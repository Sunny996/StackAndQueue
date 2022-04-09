package main;

public class MyQueue<K> {
    private final MyLinkedList<K> myLinkedList;

    public MyQueue() {
        this.myLinkedList = new MyLinkedList();
    }

    public void enQueue(INode element) {
        myLinkedList.appendNode(element);
    }

    public INode<K> deQueue() {
        return myLinkedList.pop();
    }

    public boolean isEmpty() {
        return myLinkedList.size() == 0;
    }

    public int size() {
        return myLinkedList.size();
    }

    public void printStack() {
        myLinkedList.print();
    }

    public INode<K> peak() {
        return myLinkedList.getHead();
    }
}
