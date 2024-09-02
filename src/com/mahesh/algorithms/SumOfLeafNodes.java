package com.mahesh.algorithms;

public class SumOfLeafNodes {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.right = new Node(7);
        root.right.left = new Node(6);
        root.right.left.right = new Node(8);

        sum = 0;
        leafSum(root);
        System.out.println(sum);
    }

    static int sum = 0;
    static int leafSum(Node root){
        if(root == null){
            return 0;
        }

        if(root.left == null && root.right == null) {
            sum += root.data;
        }
        leafSum(root.left);
        leafSum(root.right);
        return sum;
    }
}


class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}