package main;

import org.junit.Assert;
import org.junit.Test;

public class MyStackTest {
    @Test
    public void given3NumbersInStackWhenPoppedShouldMatchWithLastAddedNode() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyStack myStack = new MyStack();
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        INode<Integer> poppedNode = myStack.pop();
        myStack.printStack();
        Assert.assertEquals(myThirdNode, poppedNode);
    }

    @Test
    public void given3NumbersWhenAddedToStackShouldHaveLastAddedNode() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyStack myStack = new MyStack();
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        INode<Integer> myNode = myStack.peak();
        myStack.printStack();
        Assert.assertEquals(myThirdNode, myNode);
    }
}