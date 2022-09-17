package com.sparta.goncalo.sorters;

public class BinarySearchTree<E extends Comparable<E>> implements  Tree<E>{

    class Node<E>{
        private E element;
        private Node<E> left;
        private Node<E> right;


        public Node(E element, Node<E> left, Node<E> rigth){
            this.element= element;
            this.left=left;
            this.right=rigth;

        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getLeft() {
            return left;
        }

        public void setLeft(Node<E> left) {
            this.left = left;
        }

        public Node<E> getRight() {
            return right;
        }

        public void setRight(Node<E> right) {
            this.right = right;
        }
    }
    private Node<E> root;

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void remove(E element) {

    }

    @Override
    public void insert(E element) {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public int height() {
        return 0;
    }
}
