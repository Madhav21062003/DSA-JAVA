package arraylist;

import java.util.ArrayList;

import java.util.Collections;


public class ReverseArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(0);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);
        System.out.println(10);
        System.out.println("Original lis: "+list);

        reverseArrayList(list);
        System.out.println("Reversed List: "+list);

        // reverse using Collections
        Collections.reverse(list);
        System.out.println("Reversed List Using Collections: "+list);

        Collections.sort(list);
        System.out.println("Ascending List: "+list);
        reverseArrayList(list);
        System.out.println("Descending Array List: "+list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Descending Order "+list);



    }

// Function to reverse the list

    static void reverseArrayList(ArrayList<Integer> list){
            int i = 0;
            int j = list.size()-1;

            while (i < j){
                Integer temp = Integer.valueOf(list.get(i));
                list.set(i, list.get(j));
                list.set(j, temp);
                i++;
                j--;
            }
    }
}
