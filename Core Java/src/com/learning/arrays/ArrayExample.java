package com.learning.arrays;

import java.util.Arrays;

public class ArrayExample
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
        // Array with duplicate elements
        Integer[] origArray = new Integer[] { 1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8, 3, 3 };
 
        // This array has duplicate elements
        System.out.println(Arrays.toString(origArray));
 
        Integer[] tempArray = removeDuplicates(origArray);
 
        // Verify the array content
        System.out.println(Arrays.toString(tempArray));
    }
 
    private static Integer[] removeDuplicates(Integer[] origArray) {
 
        for (int i = 0; i < origArray.length - 1; i++)
        {
            if (origArray[i] == origArray[i + 1]) {
                origArray[i] = null;
            }
        }
         
        return origArray;
    }
}
