package Collection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTest {

        // Main driver method
        public static void main(String[] args)
        {

//            // Creating an object of List interface
//            // implemented by the ArrayList class
//            List<Integer> l1 = new ArrayList<Integer>();

//            //Different way of defining a list
//                //Method-1
//                List<Integer> l1 = new ArrayList<>();
//                l1.add(23);
//                l1.add(645);
//
//                //Method-2
//                List<Integer> l2 = List.of(2,5,23,54,72,16);                           //.of method was introduced in java 9
//
//                //Method-3
//                List<Integer> l3 = Arrays.asList(324,52,21);

//            // Adding elements to object of List interface
//            // Custom inputs
//            l1.add(0, 1);
//            l1.add(1, 2);
//
//            // Print the elements inside the object
//            System.out.println(l1);
//
//            // Now creating another object of the List
//            // interface implemented ArrayList class
//            // Declaring object of integer type
//            List<Integer> l2 = new ArrayList<Integer>();
//
//            // Again adding elements to object of List interface
//            // Custom inputs
//            l2.add(1);
//            l2.add(2);
//            l2.add(3);
//
//            // Will add list l2 from 1 index
//            l1.addAll(1, l2);
//
//            System.out.println(l1);
//
//            // Removes element from index 1
//            l1.remove(1);
//
//            // Printing the updated List 1
//            System.out.println(l1);
//
//            // Prints element at index 3 in list 1
//            // using get() method
//            System.out.println(l1.get(3));
//
//            // Replace 0th element with 5
//            // in List 1
//            l1.set(0, 5);
//
//            // Again printing the updated List 1
//            System.out.println(l1);


            List l1 = new ArrayList();

//            l1=method;
            l1.add(1);
            l1.add("sarma");

            System.out.println((l1.get(1)).getClass().getSimpleName());         //it is saying String class
//            System.out.println(Integer.parseInt(l1.get(1)));

        }

}
