package interview_questions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Question22 {

    public static void main(String[] args) {

        //Create an integer list, add 5 elements in it, remove the even elements, change the odd elements to 22
        //[12, 3, 7, 24, 11]

        List<Integer> list1 = new ArrayList<>();

        list1.add(12);
        list1.add(3);
        list1.add(7);
        list1.add(24);
        list1.add(11);
        System.out.println(list1);

        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i)%2==0)
            {list1.remove(i);
                i--;}
            else{list1.set(i,22);}
        }
        System.out.println(list1);


        //Create an integer list which has repeated elements then remove the duplicates
        //[2, 3, 2, 2, 4] ==> [2, 3, 4]

        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(3);
        list2.add(2);
        list2.add(2);
        list2.add(4);
        System.out.println(list2);

        List<Integer> uniqueList2 = new ArrayList<>();

        for (int i = 0; i <list2.size() ; i++) {
            if (!uniqueList2.contains(list2.get(i))) {
            uniqueList2.add(list2.get(i));}
            }
        System.out.println(uniqueList2);


        //Find the closest 2 integers in the given list.
        // [12, 15, 10, 11, 20] ==> 12-11, 10-11

        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(15);
        list.add(10);
        list.add(11);
        list.add(20);

        //Sort the list elements
        Collections.sort(list);
        System.out.println(list);

        //Select a min difference value
        int minDiff = list.get(1) - list.get(0);

        //Create a loop to compare all differences
        for(int i=2; i<list.size(); i++){
            minDiff = Math.min(minDiff, list.get(i)-list.get(i-1));
        }
        System.out.println(minDiff);

        for(int i=1; i< list.size(); i++){
            if(list.get(i) - list.get(i-1)==minDiff){
                System.out.println(list.get(i) + " - " + list.get(i-1));
            }
        }

        //From a given list find all pairs whose sum is a given number
        //{4, 6, 5, -10, 8, 5, 20} ==> 10
        //For example;  4+6=10, 5+5=10, -10+20=10

        List<Integer> myList = new ArrayList<>();
        myList.add(4);
        myList.add(6);
        myList.add(5);
        myList.add(-10);
        myList.add(8);
        myList.add(5);
        myList.add(20);
        Collections.sort(myList);


        for(int i=0; i< myList.size(); i++) {
            for (int j = 1; j < myList.size(); j++) {
                int sumPairs = myList.get(i) + myList.get(j);
                if (sumPairs == 10) {
                    System.out.println(myList.get(i) + "-" + myList.get(j));
                    myList.remove(i);
                }
            }
        }
    }
}

