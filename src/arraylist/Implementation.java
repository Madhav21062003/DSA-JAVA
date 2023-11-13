package arraylist;
import java.util.ArrayList;

public class Implementation {
    public static void main(String[] args) {

        // Wrapper classes
        Integer i = Integer.valueOf(4);
        System.out.println(i);

        Float j = Float.valueOf(4.55f);
        System.out.println(j);

        // ArrayList

        // Declaring ArrayList
        ArrayList<Integer> l1 = new ArrayList<>();

        // General Method of ArrayList

        // 1. Adding New Element
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);

        // Accessing element of Arraylist by passing a particular Index
        System.out.println(l1.get(1));

        // Accessing element of Arraylist by using loops
        System.out.println("The element contains by array list are: ");
        for (int k = 0; k < l1.size(); k++) {
            System.out.print(l1.get(k)+" ");
        }

        // printing all element of arraylist directly
        System.out.println(l1);

        // adding particular element at some particular index
        l1.add(1, 100);
        System.out.println(l1);

        // modifying element at some particular index
        l1.set(1,10);
        System.out.println(l1);

        // remove element by using index value
        l1.remove(1);
        System.out.println(l1);

        // remove element by using index element value
        l1.remove(Integer.valueOf(7));
        System.out.println(l1.remove(Integer.valueOf(17)));
        System.out.println(l1);


        // Dynamic Array list - if you don't Specify class, you can put anything inside ArrayList
        ArrayList l2 = new ArrayList<>();
        l2.add("abb");
        l2.add(4.22);
        l2.add(12);
        l2.add(true);
        l2.add('a');
        System.out.println(l2);
    }
}
