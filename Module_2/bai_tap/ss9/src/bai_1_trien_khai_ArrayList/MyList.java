package bai_1_trien_khai_ArrayList;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int initialCapacity) {
        elements = new Object[initialCapacity];
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) elements[i];
    }

    public int size() {
        return size;
    }

    public E set(int index, E newElement) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size());
        }
        E oldElement = (E) elements[index];
        elements[index] = newElement;
        return oldElement;
    }

    public E remove(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size());
        }
        E removedElement = (E) elements[index];
        for (int i = index; i < size() - 1; i++) {
            set(i, get(i + 1));
        }
        size--;
        return removedElement;
    }

    public boolean contains(E targetElement) {
        // Check for equality, handling null values
        for (Object element : elements)
            if ((targetElement == null && element == null) ||
                    (targetElement != null && targetElement.equals(element))) {
                return true;
            }
        return false;
    }

    public int indexOf(E targetElement) {
        for (int i = 0; i < size(); i++) {
            E element = get(i);
            if ((targetElement == null && element == null) ||
                    (targetElement != null && targetElement.equals(element))) {
                return i;
            }
        }
        return -1;
    }
    public void clear(){
        size=0 ;
    }
    public Object clone() {
        try {
            MyList<E> clonedList = (MyList<E>) super.clone();
            return clonedList;
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e);
        }
    }
}
