package stactandsort;
public class ArrayListADT {
    private int[] array;
    private int size;

    // Constructor to initialize the array with a default capacity
    public ArrayListADT() {
        array = new int[10];
        size = 0;
    }

    // Method to add an element to the end of the array
    public void add(int element) {
        if (size == array.length) {
            resize();
        }
        array[size++] = element;
    }

    // Method to insert an element at a specified index
    public void insert(int index, int element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        if (size == array.length) {
            resize();
        }
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = element;
        size++;
    }

    // Method to remove the element at a specified index
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[--size] = 0;
    }

    // Method to get the element at a specified index
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return array[index];
    }

    // Method to return the number of elements in the array
    public int size() {
        return size;
    }

    // Method to check if the array is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Method to display all elements in the array
    public void display() {
        if (size == 0) {
            System.out.println("The list is empty.");
        } else {
            System.out.print("Elements in the list: ");
            for (int i = 0; i < size; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }

    // Helper method to resize the array when it's full
    private void resize() {
        int[] newArray = new int[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }
}
