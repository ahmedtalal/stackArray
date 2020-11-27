package com.company;

public class Stack {
    private int capacity ;
    private int top ;
    private int arr[]  ;

    public Stack(int size ) {
        this.capacity = size ;
        this.top = -1 ;
        this.arr = new int[size] ;
    }


    public boolean isFull(){
        return top == capacity - 1 ;
    }

    public boolean isEmpty(){
        return top == -1 ;
    }

    public void push(int value){
        if (isFull()){
            System.out.println("the stack is full");
        }else {
            arr[++top] = value ;
        }
    }

    public int pop(){
        if (isEmpty()){
            return 0 ;
        }
        return arr[top--] ;
    }
}
