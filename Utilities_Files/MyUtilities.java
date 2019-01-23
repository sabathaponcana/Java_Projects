/*
  In this class, we have provided you with method stubs that need to be filled out.
  For each method, fill in the arguments it takes and the code it needs to produce
  the desired output.
 */


/* DON'T FORGET TO IMPORT THINGS YOU NEED HERE */

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Scanner;

public class MyUtilities{

    /*
      Write a method that takes an array of chars as an argument. The method should then convert the char array into a String
      and return a string consisting of the built string, the string in uppercase, the string in lower case, and the length
      of the string, separated by the ':' character.
     */
    public String StringThings(char[] arr){
        String word= "";
        for (int i = 0; i <arr.length; i++)
        {
            if (i%2== 0) {
                word = word + Character.toString(arr[i]).toUpperCase();
            }else
            {
                word = word + arr[i];
            }
        }
        return  word + ":" + word.toUpperCase()+":" + word.toLowerCase() + ":" + arr.length;
    }



    /*
      Write a method that takes a single String as an argument. It should split the string on the ',' character, and return
      the resulting String[] with trailing and leading whitespace trimmed from every element.
     */
    public String[] StringCleanAndSplit(String word){
        word = word.trim().replace(" ","");
        String[] arr = word.split(",");
        return arr;
    }



    /*
      Write a method that takes a String as an argument, and returns a reversed version of the string.
     */
    public String ReverseString(String word){
        char[]arr =  word.toCharArray();
        String newWord = "";
        for (int i = arr.length-1;i >= 0 ;i--)
        {
            newWord = newWord + arr[i];
        }
        return newWord;
    }



    /*
      Write a method that returns a String of today's date in the format: yyyy-mm-dd
     */
    public String WhatDayIsIt(){
       LocalDate day = LocalDate.now();
        return day.toString();
    }



    /*
      Write a method that takes six integers: year1, month1, day1, year2, month2, and day2
      The first three integers should be used to create one date object, and the second
      three should be used to create a second date object.

      Your program should then return, as a String, the period of time between these two dates in
      the format that looks like this:

          P[years]Y[months]M[days]D

      where the elements in square brackets are replaced with the number of years, months, and days
      between the two dates.
     */
    public String TimeBetween(int year1, int month1, int day1, int year2, int month2, int day2){
        LocalDate date1 = LocalDate.of(year1,month1,day1);
        LocalDate date2 = LocalDate.of(year2,month2,day2);

        LocalDate behindDay = date2.minusDays(day1);
        Period period = Period.between(date1,behindDay);
        int diff = period.getDays();

        LocalDate behindMonth = date2.minusMonths(month1);
        Period periodMonth = Period.between(date1,behindMonth);
        int diffMonth = period.getMonths();

        LocalDate behindYear = date2.minusYears(year1);
        Period periodYear = Period.between(date1,behindYear);
        int diffYear = period.getYears();


       return  "P"+diffYear+"Y"+diffMonth+"M"+diff+"D";


    }




    /*
      Write a method that prompts the user to enter Strings, storing them all, until the user enters the string "DONE".
      The program should then print out a String version of the list that the user entered that looks like this:

          [element 1, element 2,..., element n]

      where elements 1-n are the items entered by the user.

      Use the String "What is next on yourlist?" to prompt the user.
     */
    public String ListMaker(){
        Scanner in = new Scanner(System.in);

        ArrayList<String> myList = new ArrayList<>();

        //System.out.println("What is next on your list?");
        //String word = in.next();


        while (true){
            System.out.println("What is next on your list?");
            String word = in.next();

            if (word.equals("DONE")){
                break;
            }
            else {
                myList.add(word);
            }
        }
        return myList.toString();

    }
}
