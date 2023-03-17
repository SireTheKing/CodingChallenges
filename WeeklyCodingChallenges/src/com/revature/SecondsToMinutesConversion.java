package com.revature;

import java.util.Scanner;

/* Write a function that takes an integer minutes and converts it to seconds.



Examples
convert(5) ➞ 300



convert(3) ➞ 180



convert(2) ➞ 120
Notes
Don't forget to return the result. */
public class SecondsToMinutesConversion
{
    public static int secondsToMinutes(int min)
    {
        int seconds = min * 60;
        return seconds;
    }

    public static void main(String[] args)
    {
        System.out.print("Enter minutes for conversion: ");
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        System.out.println("Result: " + secondsToMinutes(min));





    }



}
