package lambda_functional_programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp02 {

    /*
       1) "variable or variables or no variable" -> "logic" t-> t+5
          The structure is called "Lambda Expression"
       2) In Functional Programming, we can use "Lambda Expression", it is allowed but not recommended
          Instead of "Lambda Expression", we prefer to use "Method Reference"
       3) "Method Reference" is "Class Name :: Method Name"
          For example: "String :: length" (Do not type method parenthesis, type just method name)
                       "Arrays :: toString"
          You can use your own class as well, for example you created Animal Class and you have eat() method in Animal Class,
          "Anımal :: eat"
     */

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
        System.out.println(l);

        printTheElementsFunctional(l);
        System.out.println();
        printTheEvenElementsFunctional(l);
        System.out.println();
        printSquareOfOddElements(l);
        System.out.println();
        printCubeOfOddDistinctElements(l);
        System.out.println();
        sumOfSquareOfDistinctEvenElements(l);
        sumOfSquareOfDistinctEvenElements02(l);
        multiplicationOfCubesOfDistinctEvenElements(l);
        getMaxElement01(l);
        getMinGreaterThan7andEven(l);
        halfOfEachElementWhichAreDistinctAndGreaterThan5ReverseOrder(l);
        getMinElement(l);

    }

    //1)Create a method to print the list elements on the console in the same line with a space,
//  between two consecutive elements.(Functional with method reference)

    public static void printTheElementsFunctional(List<Integer> list){
        list.stream().forEach(UtilsNt ::printTheSameLineWithSpace);
    }

    //2)Create a method to print the even list elements on the console in the same line with a space
    //  between two consecutive elements.(Functional with method reference)

    public static void printTheEvenElementsFunctional(List<Integer> list){
        list.stream().filter(UtilsNt::checkToBeEven).forEach(UtilsNt::printTheSameLineWithSpace);
    }

    //3)Create a method to print the square of odd list elements on the console in the same line with a
    //  space between two consecutive elements.(Functional with method reference)

    public static void printSquareOfOddElements (List<Integer> list){
        list.stream().filter(UtilsNt::checkToBeOdd).map(UtilsNt::getSquare).forEach(UtilsNt::printTheSameLineWithSpace);
    }

    //4)Create a method to print the cube of distinct odd list elements on the console in the same line
    //  with a space between two consecutive elements.(Functional with method reference)

    public static void printCubeOfOddDistinctElements(List<Integer> list){
        list.stream().distinct().filter(UtilsNt::checkToBeOdd).map(UtilsNt::getCube).forEach(UtilsNt::printTheSameLineWithSpace);
    }

    //5)Create a method to calculate the sum of the squares of distinct even elements(Functional with method reference)

    public static void sumOfSquareOfDistinctEvenElements(List<Integer> list){
        Integer sum = list.stream().distinct().filter(UtilsNt::checkToBeEven).map(UtilsNt::getSquare).reduce(0,Math::addExact);
        System.out.println(sum);
    }

    public static void sumOfSquareOfDistinctEvenElements02(List<Integer> list){
        Integer sum = list.stream().distinct().filter(UtilsNt::checkToBeEven).map(UtilsNt::getSquare).reduce(0, Integer::sum);
        System.out.println(sum);
    }

    //6)Create a method to calculate the multiplication of the cubes of distinct even elements(Functional with method reference)

    public static void multiplicationOfCubesOfDistinctEvenElements(List<Integer> list){
        Integer multip =  list.stream().distinct().filter(UtilsNt::checkToBeEven).map(UtilsNt::getCube).reduce(1, Math::multiplyExact);
        System.out.println(multip);
    }

    //7)Create a method to find the maximum value from the list elements(Functional with method reference)

    public static void getMaxElement01(List<Integer> list){
        Integer max =list.stream().distinct().reduce(Integer.MIN_VALUE,Math::max);
        System.out.println(max);
    }

    //Homework
    //8)Create a method to find the minimum value from the list elements(Functional Method Reference)

    public static void getMinElement(List<Integer> list){
        Integer minimum = list.stream().distinct().reduce(Integer.MAX_VALUE, Math::min);
        System.out.println("Minimum element is= " + minimum);
    }



    //9)Create a method to find the minimum value which is greater than 7 and even from the list(Functional with method reference)

    public static void getMinGreaterThan7andEven(List<Integer> list){
        Integer min = list.
                stream().
                distinct().
                filter(t-> t>7).
                filter(UtilsNt::checkToBeEven).
                reduce(Integer.MAX_VALUE, Math::min);
        System.out.println(min);
    }

    //10)Create a method to find the half of each element which are distinct and greater than 5 in reverse order in the list(Functional with method reference)
    public static void halfOfEachElementWhichAreDistinctAndGreaterThan5ReverseOrder(List<Integer> list){
     List<Double> result =   list.
             stream().
             filter(t-> t>5).
             distinct().
             map(UtilsNt::calculateHalf).
             sorted(Comparator.reverseOrder()).
             collect(Collectors.toList());
        System.out.println(result);
    }
}
