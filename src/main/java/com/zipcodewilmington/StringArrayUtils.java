package com.zipcodewilmington;

import org.apache.maven.shared.utils.StringUtils;

import java.util.*;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {

        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {

        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {

        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {

        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        String container = Arrays.toString(array);
        if (container.contains(value)) {
            return true;
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        Collections.reverse(Arrays.asList(array));
        return array;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        String[] rev = Arrays.copyOf(array, array.length); //copy of array String[] array into string[] rev
        for (int i = 0; i < array.length / 2; i++){ //iterates thru half the array example string array [c,o,d,e]
            String temp = array[i];//stores index i into a temp string ie: code is now stored as String = c
            array[i] = array[array.length - i -1];//storing index i into array to beginning of index: [e,-,-,-]
            array[array.length - i - 1] = temp;//storing temp value in i position of array: [e,-,-,c]
        }

        if (Arrays.equals(array,rev)) { //checks if both changed array and rev is equal
            return true;
        }
        return false;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String pan = Arrays.toString(array);
        boolean panagram = false;
        for (char i = 'a';i <= 'z'; i++) {
            if (!pan.contains(String.valueOf(i))) {
                panagram = false;
            } else {
                panagram = true;
            }
        }
        return panagram;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        String number = Arrays.toString(array);
        return StringUtils.countMatches(number, value);
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        String[] removed = new String[array.length - 1];
        int count = 0;
        for (String i: array){
            if (!i.equals(valueToRemove)){
                removed[count++] = i;
            }
        }
        return removed;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                sb.append(array[i]);
            } else if (array[i] != array[i+1]) {
                sb.append(array[i] + ",");
            }
        }
        String[] result = sb.toString().split(",");
        return result;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++){
            if (i == array.length - 1){ // adds index i if its at the last index
                sb.append(array[i]);//of the array
            } else if (array[i] == (array[i+1])){ //adds char to sb if its same
                sb.append(array[i]);
            } else if (array[i] != array[i+1]){//adds , if char is not same
                sb.append(array[i] + ",");
            }
        }
        String[] result = sb.toString().split(",");
        return result;
    }


}
