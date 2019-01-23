/**
   Use this class to test your MyUtilities.java class.

   Feel free to comment out the calls to the functions you are not currently working on so that you
   can focus on one thing at a time.
 **/
import java.util.Arrays;
public class Runner{
    public static void main(String[]args){

        MyUtilities myUtils = new MyUtilities();

        // Test the StringThings method.
        char[] arr = {'A','b','C','d','E','f','G'};
        System.out.println(myUtils.StringThings(arr));

        // Test the StringCleanAndSplit method.
        String[] test = myUtils.StringCleanAndSplit("            the  , quick     ,  brown      ,fox,jumps   ,over   ,      the,lazy,         dog     ");
        System.out.println(Arrays.toString(test));

        // Test the flipThis method.
        String flipThis = myUtils.ReverseString("Do not multiply entities beyond necessity.");
        System.out.println(flipThis);

        // Test the WhatDayIsIt method.
        System.out.println("Today's date is: " + myUtils.WhatDayIsIt());

       // Test the TimeBetween method.
        System.out.println(myUtils.TimeBetween(1991, 1, 27, 2018, 12, 18));

        // Test the ListMaker method.
        String myList = myUtils.ListMaker();
        System.out.println(myList);
    }
}
