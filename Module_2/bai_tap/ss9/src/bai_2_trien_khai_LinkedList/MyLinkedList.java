package bai_2_trien_khai_LinkedList;

import java.util.NoSuchElementException;

public class MyLinkedList<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private int numNodes;
    private Node<E> head;

    public MyLinkedList() {
        numNodes = 0;
        head = null;
    }

    private static class Node<E> {
        private E data;
        private Node<E> next;

        public Node(E data) {
            this.data = data;
            next = null;
        }

        public E getData() {
            return data;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }

    public void add(E data) {
        Node<E> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<E> currentNode = head;
            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(newNode);
        }
        numNodes++;
    }

    public void addFirst(E data) {
        Node<E> newNode = new Node<>(data);
        newNode.setNext(head);
        head = newNode;
        numNodes++;
    }

    public void addLast(E data) {
        add(data);
    }

    public void remove(int index) {
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            head = head.getNext();
        } else {
            Node<E> previousNode = getNode(index - 1);
            Node<E> currentNode = previousNode.getNext();
            previousNode.setNext(currentNode.getNext());
        }
        numNodes--;
    }

    public void remove(E data) {
        Node<E> previousNode = null;
        Node<E> currentNode = head;

        while (currentNode != null) {
            if (currentNode.getData().equals(data)) {
                if (previousNode == null) {
                    // Node to be removed is the head
                    head = currentNode.getNext();
                } else {
                    previousNode.setNext(currentNode.getNext());
                }
                numNodes--;
                return;
            }
            previousNode = currentNode;
            currentNode = currentNode.getNext();
        }
    }

    public E get(int index) {
        Node<E> node = getNode(index);
        return node.getData();
    }

    public int size() {
        return numNodes;
    }

    public void printList() {
        Node<E> currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.getData() + " ");
            currentNode = currentNode.getNext();
        }
        System.out.println();
    }

    public MyLinkedList<E> clone() {
        MyLinkedList<E> newList = new MyLinkedList<>();
        Node<E> currentNode = head;
        while (currentNode != null) {
            newList.addLast(currentNode.getData());
            currentNode = currentNode.getNext();
        }
        return newList;
    }

    public boolean contains(E data) {
        Node<E> currentNode = head;
        while (currentNode != null) {
            if (currentNode.getData().equals(data)) {
                return true;
            }
            currentNode = currentNode.getNext();
        }
        return false;
    }

    public int indexOf(E data) {
        Node<E> currentNode = head;
        int index = 0;
        while (currentNode != null) {
            if (currentNode.getData().equals(data)) {
                return index;
            }
            currentNode = currentNode.getNext();
            index++;
        }
        return -1;
    }

    private Node<E> getNode(int index) {
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException();
        }

        Node<E> currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.getNext();
        }
        return currentNode;
    }
    public void ensureCapacity(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be greater than zero");
        }

        if (capacity > numNodes) {
            Node<E> currentNode = head;
            while (currentNode != null && numNodes < capacity) {
                if (currentNode.getNext() == null) {
                    int nodesToAdd = capacity - numNodes;
                    for (int i = 0; i < nodesToAdd; i++) {
                        addLast(null); // Thêm các node mới với giá trị null
                    }
                    break;
                }
                currentNode = currentNode.getNext();
            }
        }
    }
    public E getFirst() {
        if (head == null) {
            throw new NoSuchElementException("The list is empty");
        }
        return head.getData();
    }

    public E getLast() {
        if (head == null) {
            throw new NoSuchElementException("The list is empty");
        }

        Node<E> currentNode = head;
        while (currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
        }
        return currentNode.getData();
    }
    public void clear() {
        head = null;
        numNodes = 0;
    }
}
