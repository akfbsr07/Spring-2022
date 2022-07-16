package lambda_functional_programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class Fp03 {

    public static void main(String[] args) {

        List<String> l = new ArrayList<>();
        l.add("Ali");
        l.add("Ali");
        l.add("Mark");
        l.add("Amanda");
        l.add("Christopher");
        l.add("Jackson");
        l.add("Mariano");
        l.add("Alberto");
        l.add("Tucker");
        l.add("Benjamin");
        //l.add("Xavier");

        printInUpperCase01(l);
        System.out.println();
        //printInUpperCase02(l);
        printElementsSortedByLength(l);
        System.out.println();
        printElementsSortedByLengthReversed(l);
        System.out.println();
        printDistinctSortedElementsByLastCharacters(l);
        System.out.println();
        printElementsSortedByLengthThenInitial(l);
        System.out.println();
        // removeIfLengthIsGreaterThanFive(l);
        // printRemoveIfStartingWithAEndingWithN01(l);
        // printRemoveIfStartingWithAEndingWithN02(l);
        //removeIfLengthBetween8and10OrEndsWithO(l);
        System.out.println(checkLengthToBeLessThenTwelve(l));
        System.out.println(checkNotToStartWithX(l));
        System.out.println(checkIfAnyElementEndWithR(l));

    }

    //1) Create a method to print all list elements in uppercase
    //1st Way
    public static void printInUpperCase01(List<String > list){
        list.stream().map(String::toUpperCase).forEach(UtilsNt::printTheSameLineWithSpace);
    }

    /* 2ndWay
       public static void printInUpperCase02(List<String > list){
        list.replaceAll(String::toUpperCase);
        System.out.println(list);}
                                                                   */


    //2) Create a method to print the elements after ordering according to their lengths
    public static void printElementsSortedByLength(List<String> list){
        list.stream().sorted(Comparator.comparing(String::length)).forEach(UtilsNt::printTheSameLineWithSpace);
    }

    //3) Create a method to print the elements after ordering according to their lengths (In reverse order)
    public static void printElementsSortedByLengthReversed(List<String> list){
        list.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(UtilsNt::printTheSameLineWithSpace);
    }

    //4) Create a method to sort the distinct elements by using their last characters
    public static void printDistinctSortedElementsByLastCharacters(List<String> list){
        list.stream().distinct().sorted(Comparator.comparing(UtilsNt::getLastChar)).forEach(UtilsNt::printTheSameLineWithSpace);
    }

    //5) Create a method to sort the elements according to their lengths then according to their first character
    public static void printElementsSortedByLengthThenInitial(List<String> list){
        list.stream().sorted(Comparator.comparing(String::length).thenComparing(UtilsNt::getFirstChar)).forEach(UtilsNt::printTheSameLineWithSpace);
    }

    /*
       6) Remove the elements if the length of the element is greater than 5
           public static void removeIfLengthIsGreaterThanFive(List<String> list){
           list.removeIf(t-> t.length()>5);
           System.out.println(list);
                                              */


    /*7) Remove the elements if the element is starting with ‘A’, ‘a’ or ending with ‘N’, ‘n’
    public static void printRemoveIfStartingWithAEndingWithN01(List<String> list){
        list.removeIf(t-> t.startsWith("A") || t.startsWith("a") || t.endsWith("N") || t.endsWith("n") );
        System.out.println(list);

    }*/

    /* public static void printRemoveIfStartingWithAEndingWithN02(List<String> list){
        list.removeIf(t-> t.charAt(0)=='A' || t.charAt(0)=='a' || t.charAt(t.length()-1)=='N' || t.charAt(t.length()-1)=='n' );
        System.out.println(list);
    } */



    //8) Remove the elements if the length is between 8 and 10 or ending with 'o'
    /*public static void removeIfLengthBetween8and10OrEndsWithO(List<String> list){

        Predicate<String> checkCondition = t-> (t.length()>7 && t.length()<11) || t.endsWith("o");

        list.removeIf(t-> checkCondition.test(t));
        System.out.println(list);
    }*/



    //9) Create a method to check if the lengths of all elements are less than 12
    public static boolean checkLengthToBeLessThenTwelve(List<String> list){
        return list.stream().allMatch(t-> t.length()<12);
    }



    //10) Create a method to check if the initial of any element is not ‘X’
    public static boolean checkNotToStartWithX(List<String > list){
        return list.stream().noneMatch(t-> t.startsWith("X"));
    }



    //11) Create a method to check if at least one of the elements ending with “r”
    public static boolean checkIfAnyElementEndWithR(List<String > list){
        return list.stream().anyMatch(t-> t.endsWith("r"));
    }

















}
