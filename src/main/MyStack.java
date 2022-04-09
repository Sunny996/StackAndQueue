package main;

public class MyQueue<K> {
    private final MyLinkedList<K> myLinkedList;

    public MyStack() {
        this.myLinkedList = new MyLinkedList();
    }

<<<<<<< HEAD
<<<<<<< HEAD
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
=======
    public void push(INode element) {
        myLinkedList.addNode(element);
>>>>>>> UC3_CreatedQueueAndAddedElementsUsingAppend
=======
    public void push(INode element) {
        myLinkedList.addNode(element);
>>>>>>> UC4_DeletedElementsFromQueueUsingPop
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


