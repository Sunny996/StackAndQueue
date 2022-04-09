package main;

import org.junit.Assert;
import org.junit.Test;

public class MyQueueTest {
    @Test
    public void given3NumbersWhenAddedToQueueShouldHaveFirstAddedNode() {
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyQueue myQueue = new MyQueue();
        myQueue.enQueue(myFirstNode);
        myQueue.enQueue(mySecondNode);
        myQueue.enQueue(myThirdNode);
        INode<Integer> myNode = myQueue.peak();
        Assert.assertEquals(myFirstNode, myNode);
    }
}
