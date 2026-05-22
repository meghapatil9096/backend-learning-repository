package collection.Questions;

import java.util.*;

public class Q1 {
    public static void main(String[] args){
//     Remove all even numbers from ArrayList.
        List<Integer> li = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        Iterator<Integer> itr = li.iterator();
        while(itr.hasNext()){
            Integer i = itr.next();
            if(i%2==0){
                itr.remove();
            }
        }
        System.out.println("Remove even number"+li);

//        remove all odd number
        List<Integer> l = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        Iterator<Integer> it = l.iterator();
        while(it.hasNext()){
            Integer i = it.next();
            if(i%2!=0){
                it.remove();
            }
        }
        System.out.println("Remove odd number"+l);

//        Convert Array to ArrayList.
        String[] arr = {"Java","React","OOPs"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println(list);

//        Find second-largest number.
        List<Integer> li1 = new ArrayList<>(Arrays.asList(2,43,5,64,67,23));
        li1.sort(Comparator.reverseOrder());
        if(li1.get(0)!= li1.get(1)){
            System.out.println("Second largest number is : "+li1.get(1));
        }

//       Count frequency of each element.
        List<String> li2 = new ArrayList<>(Arrays.asList("A","B","C","A","B"));
        Set<String> set = new HashSet<>(li2);
        for( String s : set){
            System.out.println(s+" --> "+Collections.frequency(li2,s));
        }
    }
}
