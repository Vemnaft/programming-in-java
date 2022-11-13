package agh.ii.prinjava.proj1.impl;

public class DLinkList<E> {
    private Node<E> node = null;

    private static class Node<T> {
        T elem;
        Node<T> next;
        Node<T> prev;

        /**
         * Constructor for Node with T in parameters
         * @param elem
         */
        public Node(T elem){
            this.elem = elem;
        }

        /**
         * Method to get the value of element in a Node (useful for 'remove' methods)
         * @return
         */
        public T getElement(){
            return elem;
        }
    }

    /**
     * Method to add a Node at the beginning of the link list
     * @param n
     */
    public void addFirst(E n){
        /**
         * We verify that the link list isn't empty
         */
        if(this.node == null){
            /**
             * If null, we simply create a Node in the list
             */
            this.node = new Node<>(n);
        }
        else{
            /**
             * We create a temporary Node 'a'
             */
            Node<E> a = this.node;
            /**
             * The following lines links the node to the list
             */
            a.prev = new Node<>(n);
            a.prev.next = a;
            this.node = a.prev;
        }
    }

    /**
     * Method to add a Node at the end of the link list
     * @param n
     */
    public void addLast(E n){
        /**
         * We verify that the link list isn't empty
         */
        if(this.node == null){
            /**
             * If null, we simply create a Node in the list
             */
            this.node = new Node<>(n);
        }
        else{
            /**
             * We create a temporary Node 'a'
             */
            Node<E> a = this.node;
            while(a.next != null){
                /**
                 * We travel to the end of the list...
                 */
                a = a.next;
            }
            /**
             * ...and we link the node to the list
             */
            a.next = new Node<>(n);
            a.next.prev = a;
        }
    }

    /**
     * Method to remove a Node at the beginning of the link list and return its value
     * @return
     */
    public E removeFirst(){
        /**
         * We verify that the link list isn't empty
         */
        if(this.node == null){
            /**
             * If null, there is nothing to return, so we return null
             */
            return null;
        }
        else{
            /**
             * We create a temporary Node 'a' and use it to get the value of the first node (to return it at the end)
             */
            E a = node.getElement();
            /**
             * We go in the next node to detach the previous one
             */
            this.node = this.node.next;
            if(this.node != null){
                this.node.prev = null;
            }
            return a;
        }
    }

    /**
     * Method to remove a Node at the end of the link list and return its value
     * @return
     */
    public E removeLast(){
        /**
         * We verify that the link list isn't empty
         */
        if(this.node == null){
            return null;
        }
        else{
            /**
             * We create a temporary Node 'a'...
             */
            Node<E> a = this.node;
            while(a.next != null){
                /**
                 * ...and use it to go at the end of the list
                 */
                a = a.next;
            }
            /**
             * We create a temporary Node 'end' and use it to get the value of the last node (to return it at the end)
             */
            E end = a.getElement();
            if(a.prev != null){
                /**
                 * We detach the node from the previous one
                 */
                a.prev.next = null;
            }
            else{
                /**
                 * It's the only node in the list, so it's set to null
                 */
                this.node = null;
            }
            return end;
        }

    }

    /**
     * Method to count the number of nodes in the link list
     * @return
     */
    public int counting(){
        int num = 0;
        if(this.node == null){
            return num;
        }
        else{
            Node<E> a = this.node;
            while(a != null){
                num += 1;
                a = a.next;
            }
            return num;
        }
    }

    /**
     * Make a link list a string
     * @return
     */
    @Override
    public String toString(){
        /**
         * We verify that the link list isn't empty
         */
        if(this.node == null){
            return null;
        }
        else{
            String text = "";
            /**
             * We create a temporary Node 'a' to travel through the list
             */
            Node<E> a = this.node;
            while (a != null){
                /**
                 * We get every value of the list and put them in a string
                 */
                text += a.getElement().toString() +",";
                a = a.next;
            }
            return text;
        }
    }
}
