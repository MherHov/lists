package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ListIteration {
    /**
     * this method iterates through all elements in a array list.
     * @param list
     */
    public void allElements(ArrayList<String> list){
        for (String item : list) {
            System.out.println(item);
        }
    }

    /**
     * this method insert an element into the array list at the first position
     * @param list
     */
    public void addFirst(ArrayList<String> list){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String element: ");
        String element = scanner.nextLine();
        list.add(0, element);
        System.out.println("Updated ArrayList: " + list);
    }

    /**
     * this method updates specific array element by given element.
     * @param arr
     * @param oldElement
     * @param newElement
     */
    public void updateArrayElement(String[] arr, String oldElement, String newElement) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(oldElement)) {
                arr[i] = newElement;
                break;
            }
        }
    }

    /**
     * this method find an element in an array list
     * @param list
     * @param element
     * @return
     */
    public String searchArrayList(ArrayList<String> list, String element) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(element)) {
                return list.get(i);
            }
        }
        return "nothing found";
    }

    /**
     * this method copy one array list into another.
     * @param origin
     * @param copy
     */
    public void copyList(ArrayList<String> origin,ArrayList<String> copy){
        origin.clear();
        origin.addAll(copy);
        System.out.println(copy);
    }

    /**
     * this method reverse elements in an array list
     * @param list
     */
    public void reverseArrayList(ArrayList<Integer> list) {
        for(int i = 0; i < list.size()/2; i++) {
            int temporary = list.get(i);
            list.set(i, list.get(list.size()-1-i));
            list.set(list.size()-1-i, temporary);
        }
        System.out.println(list);
    }

    /**
     * this method swap two elements in an array list
     * @param list
     * @param index1
     * @param index2
     */
    public  void swapElements(ArrayList<String> list, int index1, int index2) {
        String temporary = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temporary);
        System.out.println(list);
    }

    /**
     * this method tests an array list is empty or not
     * @param arrayList
     * @return
     */
    public String isArrayListEmpty(ArrayList<String> arrayList) {
        if (arrayList == null || arrayList.size() == 0) {
            return "it's empty";
        } else {
            return "it's not empty";
        }
    }

    /**
     * this method increase the size of the list
     * @param list
     * @param size
     */
    public void changeSize(ArrayList<String> list,int size){
        ArrayList<String> newList = new ArrayList<>(size);
        for (int i = 0; i < list.size(); i++) {
            newList.set(i, list.get(i));
        }
        System.out.println(newList);
    }
}