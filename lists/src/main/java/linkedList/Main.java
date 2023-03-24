package linkedList;
import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
        LinkedListIteration lists = new LinkedListIteration();
        LinkedList<String> list = new LinkedList();
        LinkedList<Integer> list1 = new LinkedList();
        list.add("BMW");
        list.add("Mercedes");
        lists.likedListIterator(list);
        list1.add(3);
        list1.add(5);
        list1.add(44);
        System.out.println(list1);
        lists.reverseLinkedList(list1);
        lists.addFirstAddLast(list1,3,4);
        lists.copyList(list,list1);
        lists.removeFirstAndLast(list1);
        System.out.println(lists.isListEmpty(list1));
    }
}
