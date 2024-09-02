package com.mahesh.algorithms;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    public static void main(String[] args) {

        StackedQueue stackedQueue = new StackedQueue();
        stackedQueue.push(1);
        stackedQueue.push(2);
        stackedQueue.push(3);
        stackedQueue.push(4);
        stackedQueue.display();
        stackedQueue.pop();
        stackedQueue.pop();
        stackedQueue.display();
        stackedQueue.push(5);
        stackedQueue.push(6);
        stackedQueue.display();
    }
}


class StackedQueue {
    Queue<Integer> queue;

    public StackedQueue() {
       queue = new LinkedList<>();
    }

    void push(int i) {
        if(queue.size() > 10) {
            System.out.println("Stack overflow");
        } else {
            queue.add(i);
        }

    }


    void pop() {
        if(queue.size() < 0){
            System.out.println("Stack underflow");
        } else {
            int queueSize = queue.size();
            queue.remove(queueSize--);
        }
    }

    void display() {
        System.out.println("");
        for(int i: queue) {
            System.out.print(i+"\t");
        }
    }
}