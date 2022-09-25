package com.globalRelay.API;

import java.util.*;

public class test {

    public static int[] removeDuplicate(int[] arr){
        Set<Integer> setOfNumbers = new LinkedHashSet<>();
        for (int i = 0; i < arr.length; i++) {
            setOfNumbers.add(arr[i]);
        }
        int[] result = new int[setOfNumbers.size()];

        int i =0;
        for (Integer each:setOfNumbers) {
            result[i] = each;
            i++;

        }

        return result;
    }

    public static void removeDuplicate1(int[] arr){







    }

    public static void main(String[] args) {





        Integer[] numbers = {1,290,20,20};

        List<Integer> list = new ArrayList<>(Arrays.asList(numbers));

        Set<Integer> set = new LinkedHashSet<>(list);

        list.clear();
        list.addAll(set);

        System.out.println(list);




    }
}
