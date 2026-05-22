package collection.Questions;

import java.util.*;

public class List_Q {
    public  static void main(String[] args){
//  Add 5 student marks into ArrayList and print them.
        List<Integer> li = new ArrayList<>(Arrays.asList(27,35,66,43,24));
        System.out.println(li);
        System.out.println(li.size());

//  Sort ArrayList in ascending order.
        li.sort(Comparator.naturalOrder());
        System.out.println("Ascending order : "+li);
        li.sort(Comparator.reverseOrder());
        System.out.println("Descending order : "+li);

//  Find duplicate elements in ArrayList.
        li.add(27);
        li.add(24);
        Set<Integer> set_list = new HashSet<>();
        List<Integer> duplicate = new ArrayList<>();
        for(Integer i : li){    //for each loop
            if(!set_list.add(i)){
                duplicate.add(i);
            }
        }
        System.out.println("Duplicate element list from Array : "+duplicate);

//  Find maximum and minimum number.
        int max = li.get(0);
        int min = li.get(0);
        for(Integer i : li){
            if(i>max){
                max=i;
            }
            if(i<min){
                min=i;
            }
        }
        System.out.println("Maximum number from list : "+max);
        System.out.println("Minimum number from list : "+min);

//  second way to find max/min with collections
        int Max = Collections.max(li);
        int Min = Collections.min(li);
        System.out.println("Maximum number from list : "+Max);
        System.out.println("Minimum number from list : "+Min);
    }
}
