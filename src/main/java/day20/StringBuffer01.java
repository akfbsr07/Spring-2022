package day20;

import jdk.swing.interop.SwingInterOpUtils;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class StringBuffer01 {

    /*
      1)String Class gives you "immutable" Strings.
        If you need "mutable" Strings you can use "StringBuilder" or "StringBuffer" classes.

      2)When Java was created, Java created "StringBuffer" class first. But then in Java 1.5 String Builder came to the stage.

      3)"String Buffer" Class is multi thread and synchronized but "String Builder" is not multi thread and synchronized.
        Java did that to provide faster mutable Strings to developers.

      4) When to use "String", "StringBuilder", "StringBuffer"?
         "String": if you want to operate with small amount of data.
         "StringBuilder": if you need single thread operations with large data in fast pace
         "StringBuffer": Multi thread operations with large amount of data
     */

    public static void main(String[] args) {

        String str = "Java";
        LocalDateTime time1 = LocalDateTime.now();
        performanceOfStringBuffer(str);
        LocalDateTime time2 = LocalDateTime.now();
        performanceOfStringBuilder(str);
        LocalDateTime time3 = LocalDateTime.now();

        System.out.println("String Buffer time: " + time1.until(time2, ChronoUnit.NANOS));
        System.out.println("String Builder time: " + time2.until(time3, ChronoUnit.NANOS));
    }

    public static StringBuffer performanceOfStringBuffer(String str) {
        StringBuffer strBuffer = new StringBuffer(str);
        for (int i = 0; i < 1000000; i++) {
            strBuffer.append("abc");
        }
        return strBuffer;
    }

        public static StringBuilder performanceOfStringBuilder (String str){
            StringBuilder strBuilder = new StringBuilder(str);
            for (int i = 0; i < 1000000; i++) {
                strBuilder.append("abc");
            }
            return strBuilder;
    }




}
