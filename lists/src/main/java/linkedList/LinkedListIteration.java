package linkedList;
import java.util.LinkedList;
public class LinkedListIteration<T> {
    /**
     * This method iterate through all elements in a linked list
     * @param list
     */
    public void likedListIterator(LinkedList<T> list) {
        for (T element : list) {
            System.out.println(element);
        }
    }

    /**
     * this method is to iterate a linked list in reverse order
     * @param list
     */
    public void reverseLinkedList(LinkedList<T> list) {
        LinkedList<T> newList = new LinkedList<>();
        for(int i = list.size()-1; i > -1; i--) {
            newList.add(list.get(i));
        }
        System.out.println(newList);
    }

    /**
     *  this method inserts elements into the linked list at the first and last
     * position.
     * @param list
     * @param first
     * @param last
     */
    public void addFirstAddLast(LinkedList<T> list, T first, T last) {
        list.set(0, first);
        list.set(list.size() - 1, last);
        System.out.println(list);
    }

    /**
     * this method removes first and last element from a linked list.
     * @param list
     */
    public  void removeFirstAndLast(LinkedList<Integer> list) {
        if (list.isEmpty()) {
            System.out.println("empty list");;
        }
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
    }

    /**
     * this method clones an linked list to another linked list.
     * @param list
     * @param copy
     */
    public void copyList(LinkedList<T> list,LinkedList<T> copy) {
        copy = new LinkedList<>();
        for (int i = 0; i < list.size(); i++) {
            copy.add(list.get(i));
        }
        System.out.println(copy);
    }
    public boolean isListEmpty(LinkedList<Integer> list) {
        return list.size() == 0;
    }
}
