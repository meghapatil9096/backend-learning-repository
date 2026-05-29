package collection;

import java.util.*;

public class Set_Interface {
    public static void main(String[] args) {
//        Remove duplicates from ArrayList using Set
//        Find unique elements in an array
        List<Integer> li = new ArrayList<>();
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(1);
        li.add(1);
        li.add(5);
        li.add(4);
        li.add(2);

        Set<Integer> remove_Duplicate = new HashSet<>(li);
        System.out.println(remove_Duplicate);

//      Check if duplicates exist using HashSet
        List<Integer> l1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 3, 6, 5));
        Set<Integer> check_duplicate = new HashSet<>();
        for (Integer i : l1) {
            if (!check_duplicate.add(i)) {
                System.out.println("Duplicate exists");
            }
        }

//        Count distinct elements in array (values that are unique different from one another)
//        Find intersection using HashSet
        List<Integer> l2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 3, 4, 5));
        Set<Integer> count_distinct = new HashSet<>(l2);
        System.out.println("Count distinct element in array : " + count_distinct.size());

//        Print elements in sorted order using TreeSet
        Set<Integer> st = new TreeSet<>(l2);
        System.out.println("Sorted order using treeset: " + st);

//        Find common elements between two arrays using Set
//        input : A = [1,2,3,4]  B = [3,4,5,6]
//        output : 3,4
        List<Integer> l3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> l4 = new ArrayList<>(Arrays.asList(3, 4, 5, 6));
        Set<Integer> s1 = new HashSet<>(l4);

        System.out.println("common element from two arrays is : ");
        for (Integer i : l3) {
            if (!s1.add(i)) {
                System.out.println(i);
            }
        }

//        Find union of two arrays using Set
        l4.addAll(l3);
        Set<Integer> s2 = new HashSet<>(l4);
        System.out.println("Union element of two arrays is : " + s2);

//      Find first duplicate element
        List<Integer> l5 = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 4, 5, 3));
        Set<Integer> s3 = new HashSet<>();
        for (Integer i : l5) {
            if (!s3.add(i)) {
                System.out.println("first duplicate element is : " + i);
                break;
            }
        }

//      Remove duplicate words from sentence
        List<String> l6 = new ArrayList<>(Arrays.asList("Java", "is", "good", "Java", "is", "powerful"));
        Set<String> s4 = new LinkedHashSet<>(l6);
        System.out.println("Remove duplicate word from array : " + s4);
    }
}
