package com.mahesh.algorithms;

public class QueueUsingArray {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.display();
        queue.enqueue();
        queue.enqueue();
        queue.display();
        queue.push(5);
        queue.push(6);
        queue.display();

    }
}

class Queue {
    int[] nums;
    int front;
    int rear;
    public Queue() {
        nums = new int[10];
        front=-1;
        rear=-1;
    }

    public void push(int i) {
        if(rear >= nums.length) {
            System.out.println("Queue is full");
        }else {
            nums[++rear] =i;
        }
    }

    public void enqueue() {
        if(front == rear) {
            System.out.println("Queue is empty");
        }else {
            for (int i = 0; i < rear; i++) {
                nums[i] = nums[i+1];
            }
        }
        if(rear < nums.length) {
            return;
        }
        rear--;

    }

    public void display() {
        System.out.println("");
        for(int i=0;i<nums.length;i++) {
            System.out.print(nums[i]+"\t");
        }
    }
}
