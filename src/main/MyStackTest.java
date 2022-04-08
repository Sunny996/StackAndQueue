package main;

import org.junit.Assert;
import org.junit.Test;

public class MyStackTest {
    @Test
    public void given3NumbersWhenAddedToQueueShouldHaveFirstAddedNode() {
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyStack myStack = new MyStack();
        myStack.enQueue(myFirstNode);
        myStack.enQueue(mySecondNode);
        myStack.enQueue(myThirdNode);
        INode<Integer> myNode=myStack.peak();
        myStack.printStack();
        Assert.assertEquals(myFirstNode,myNode);
    }
}
