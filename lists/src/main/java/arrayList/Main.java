package arrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<Integer> listInt = new ArrayList<>();
        listInt.add(2);
        listInt.add(5);
        list.add("tandz");
        list.add("xndzor");
        list.add("mandarin");
        ListIteration lists = new ListIteration();
        lists.allElements(list);
        lists.addFirst(list);
        System.out.println(lists.searchArrayList(list,"mandarin"));
        lists.reverseArrayList(listInt);
        lists.swapElements(list,1,2);
        System.out.println(lists.isArrayListEmpty(list));
    }
}
