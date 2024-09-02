package com.mahesh.algorithms;

public class StackUsingArray {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack. push(1);
        stack. push(2);
        stack. push(3);
        stack. push(4);
        stack. push(5);
        stack.display();
        stack.pop();
        stack.pop();
        stack.display();
        stack.push(4);
        stack.push(6);
        stack.display();
    }


}


class Stack {
    int top;
    int[] nums;
    public Stack() {
       top = -1;
        nums = new int[10];
    }

    void push(int i) {
        if(top >= 10) {
            System.out.print("Overflow");
        } else if(top <10){
            nums[++top] = i;
        }
    }

    void display(){
        System.out.println("");
        for(int i=0;i<10;i++) {
            System.out.print(nums[i]+"\t");
        }
    }

    void pop() {
        if(top == -1) {
            System.out.print("Underflow");
        }else {
            nums[top--] = 0;
        }
    }
}