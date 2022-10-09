package agh.ii.prinjava.proj1.impl;

public class DLinkList<E> {
    private Node<E> node = null;

    private static class Node<T> {
        T elem;
        Node<T> next;
        Node<T> prev;

        public Node(T elem){
            this.elem = elem;
        }

        public T getElement(){
            return elem;
        }
    }

    public void addFirst(E n){
        if(this.node == null){
            this.node = new Node<>(n);
        }
        else{
            Node<E> a = this.node;
            a.prev = new Node<>(n);
            a.prev.next = a;
            this.node = a.prev;
        }
    }

    public void addLast(E n){
        if(this.node == null){
            this.node = new Node<>(n);
        }
        else{
            Node<E> a = this.node;
            while(a.next != null){
                a = a.next;
            }
            a.next = new Node<>(n);
            a.next.prev = a;
        }
    }

    public E removeFirst(){
        if(this.node == null){
            return null;
        }
        else{
            E a = node.getElement();
            this.node = this.node.next;
            if(this.node != null){
                this.node.prev = null;
            }
            return a;
        }
    }

    void removeLast(DLinkList<E>){
        if(DLinkList<E>.next == null){

        }
        if(DlinkList<E>.next.next != null){
            return addLast(DLinkList<E>.next);
        }
    }
}
