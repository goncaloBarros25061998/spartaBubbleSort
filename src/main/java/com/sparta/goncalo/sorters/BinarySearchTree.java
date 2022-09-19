package com.sparta.goncalo.sorters;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree<Integer extends Comparable<Integer>> implements Tree<Integer> {

    class Node<Integer> {
        private Integer element;
        private Node<Integer> left;
        private Node<Integer> right;


        public Node(Integer element, Node<Integer> left, Node<Integer> rigth) {
            this.element = element;
            this.left = left;
            this.right = rigth;

        }

        public Integer getElement() {
            return element;
        }

        public void setElement(Integer element) {
            this.element = element;
        }

        public Node<Integer> getLeft() {
            return left;
        }

        public void setLeft(Node<Integer> left) {
            this.left = left;
        }

        public Node<Integer> getRight() {
            return right;
        }

        public void setRight(Node<Integer> right) {
            this.right = right;
        }
    }

    private Node<Integer> root;

    @Override
    public boolean isEmpty() {
        return this.root == null;
    }

    @Override
    public void remove(Integer element) {

    }

    public void insert(Integer element) {

            root = this.insert(element, root);

    }

    private Node<Integer> insert(Integer element, Node<Integer> node) {
        if (node == null) {
            return new Node<>(element, null, null);
        }
        if (element.compareTo(node.getElement()) < 0) {
            node.setLeft(insert(element, node.getLeft()));
        } else if (element.compareTo(node.getElement()) > 0) {
            node.setRight(insert(element, node.getRight()));
        } else {
            node.setElement(element);
        }
        return node;
    }

    @Override
    public int size() {
        return this.size(this.root);
    }

    private int size(Node<Integer> node) {
        if (node == null) {
            return 0;

        }
        return this.size(node.getLeft()) + 1 + this.size(node.getRight());
    }

    @Override
    public int height() {
        return this.height(this.root);
    }

    private int height(Node<Integer> node) {
        if(node == null){
            return -1;

        }
        int rightDepth = this.height(node.getRight());
        int leftDepth = this.height(node.getLeft());
        if (leftDepth>rightDepth){
            return leftDepth+1;
        }
        return rightDepth+1;
    }
    public int[] treeSort(Integer[] elements){
        for (int i = 0; i< elements.length; i++){
            this.insert(elements[i]);
        }
        List<Integer> orderList = this.inOrder();
        int[] orderArray = new int[elements.length];
        System.out.println(orderArray.length);
        for(int i=0; i<elements.length-2; i++){
            String number = String.valueOf(orderList.get(i));
            int element = java.lang.Integer.parseInt(number);
            orderArray[i] = element;
        }
        return orderArray;
    }
    public List<Integer> inOrder(){
       List<Integer> orderList = new ArrayList<>();
       if(this.root != null){
           this.inOrderSubtree(this.root, orderList);
       }
       return orderList;
    }

    private void inOrderSubtree(Node<Integer> node, List<Integer> orderList) {
        if (node == null){
            return;
        }
        this.inOrderSubtree(node.getLeft(), orderList);
        orderList.add(node.getElement());
        this.inOrderSubtree(node.getRight(), orderList);

    }
}
