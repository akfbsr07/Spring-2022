package lambda_functional_programming;

/*
 1)Lambda is Functional Programming, we started to use Lambda in Java 8
 2)In Functional Programming we focus on "What to do?",
  but in Structured Programming we focus on "How to do?"
 3)Functional Programming can be used just with Arrays and Collections
 4)By using "entrySet()" method, you can convert Map to Set, then you can use Functional Programming in Maps as well
 */

import java.io.FilterOutputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp01 {

    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();
        l.add(8);
        l.add(9);
        l.add(131);
        l.add(10);
        l.add(9);
        l.add(10);
        l.add(2);
        l.add(8);

        System.out.print(l);
        System.out.println();
        printElementsStructured(l);
        System.out.println();
        printTheElementsFunctional(l);
        System.out.println();
        printTheEvenElementsStructured(l);
        System.out.println();
        printTheEvenElementsFunctional(l);
        System.out.println();
        printSquareOfOddElements(l);
        System.out.println();
        printCubeOfOddDistinctElements(l);
        System.out.println();
        sumOfSquareOfDistinctEvenElements(l);
        multiplicationOfCubesOfDistinctEvenElements(l);
        getMaxElement01(l);
        getMaxElement02(l);
        getMinGreaterThan7andEven(l);
        getMinGreaterThan7andEven02(l);
        getMinGreaterThan7andEven03(l);
        halfOfEachElementWhichAreDistinctAndGreaterThan5ReverseOrder(l);
        findMinElement(l);
        findMinElement02(l);
    }

//1)Create a method to print the list elements on the console in the same line with a space,
//  between two consecutive elements.(Structured)

public static void printElementsStructured(List<Integer> list){

    for (Integer w: list) {
        System.out.print(w + " ");
    }}


    //1)Create a method to print the list elements on the console in the same line with a space,
//  between two consecutive elements.(Functional)

    public static void printTheElementsFunctional(List<Integer> list){list.stream().forEach(t-> System.out.print(t + " "));}


    //2)Create a method to print the even list elements on the console in the same line with a space
    //  between two consecutive elements.(Structured)

    public static void printTheEvenElementsStructured(List<Integer> list){
        for (Integer w : list) {
            if(w%2==0) {System.out.print(w+" ");}
        }

    }

    //2)Create a method to print the even list elements on the console in the same line with a space
    //  between two consecutive elements.(Functional)

    public static void printTheEvenElementsFunctional(List<Integer> list){
          list.stream().filter(t->t%2==0).forEach(t-> System.out.print(t+" "));
    }

    //3)Create a method to print the square of odd list elements on the console in the same line with a
    //  space between two consecutive elements.(Functional)

    public static void printSquareOfOddElements (List<Integer> list){
        list.stream().filter(t-> t%2!=0).map(t->t*t).forEach(t-> System.out.print(t + " "));
    }

    //4)Create a method to print the cube of distinct odd list elements on the console in the same line
    //  with a space between two consecutive elements.

    public static void printCubeOfOddDistinctElements(List<Integer> list){
        list.stream().distinct().filter(t-> t%2!=0).map(t->t*t*t).forEach(t-> System.out.print(t + " "));
    }

    //5)Create a method to calculate the sum of the squares of distinct even elements

    public static void sumOfSquareOfDistinctEvenElements(List<Integer> list){
        Integer sum = list.stream().distinct().filter(t-> t%2==0).map(t-> t*t).reduce(0, (t, u)->t+u);
        System.out.println(sum);
    }

    //6)Create a method to calculate the multiplication of the cubes of distinct even elements

    public static void multiplicationOfCubesOfDistinctEvenElements(List<Integer> list){
        Integer multiplication = list.stream().distinct().filter(t-> t%2==0).map(t-> t*t*t).reduce(1, (t, u)-> t*u);
        System.out.println(multiplication);
    }

    //7)Create a method to find the maximum value from the list elements

    //1st Way
    public static void getMaxElement01(List<Integer> list){
        Integer max = list.stream().distinct().reduce(Integer.MIN_VALUE, (t, u)-> t>u ? t : u);
        System.out.println(max);
    }

    //2nd Way
    public static void getMaxElement02(List<Integer> list){
        Integer max2 = list.stream().distinct().sorted().reduce(Integer.MIN_VALUE, (t, u)-> u);
        System.out.println(max2);
    }

    //Homework
    //8)Create a method to find the minimum value from the list elements(In 2 ways)

    //1st Way
    public static void findMinElement(List<Integer> list){
        Integer minVal = list.stream().distinct().reduce(Integer.MAX_VALUE, (t,u)-> t<u ? t : u);
        System.out.println("Minimum element= " + minVal);
    }

    //2nd Way
    public static void findMinElement02(List<Integer> list){
        Integer minVal02 = list.stream().distinct().sorted().findFirst().get();
        System.out.println("Minimum element= " + minVal02);
    }


    //9)Create a method to find the minimum value which is greater than 7 and even from the list
    //1st Way
    public static void getMinGreaterThan7andEven(List<Integer> list){
        Integer min1 = list.stream().distinct().filter(t-> t>7).filter(t-> t%2==0).reduce(Integer.MAX_VALUE, (t, u)-> t<u ? t : u );
        System.out.println(min1);
    }

    //2nd Way
    public static void getMinGreaterThan7andEven02(List<Integer> list){
        Integer min2 = list.
                stream().
                distinct().
                filter(t-> t>7).
                filter(t-> t%2==0).
                sorted(Comparator.reverseOrder()).
                reduce(Integer.MAX_VALUE, (t, u)-> u);
        System.out.println(min2);
    }

    //3rd Way
    public static void getMinGreaterThan7andEven03(List<Integer> list){
      Integer min3 =  list.stream().filter(t-> t%2 ==0).filter(t-> t>7).sorted().findFirst().get();
        System.out.println(min3);
    }

    //10)Create a method to find the half of each element which are distinct and greater than 5 in reverse order in the list.
    public static void halfOfEachElementWhichAreDistinctAndGreaterThan5ReverseOrder(List<Integer> list){
        List<Double> result = list.
                stream().
                distinct().
                filter(t-> t>5).
                map(t-> t/2.0).
                sorted(Comparator.reverseOrder()).
                collect(Collectors.toList());
        System.out.println(result);
    }


















}
