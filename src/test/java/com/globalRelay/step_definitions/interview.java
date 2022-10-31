package com.globalRelay.step_definitions;

import com.globalRelay.utilities.Driver;
import io.cucumber.java.it.Ma;

import java.util.*;

import static org.bouncycastle.pqc.math.linearalgebra.IntegerFunctions.isPrime;

public class interview {

    public static int getLength(String text){
        int max =0;

        if (text.length()>0) {
            String[] allSentences = text.split("[.?!]"); // To separate given text by ". ? !" and store them in allSentencesArray.
            for (int i = 0; i < allSentences.length; i++) {          // To loop thru each sentences.
                int countSpace = 0;
                for (int j = 0; j < allSentences[i].length(); j++) {   // inner loop to check each words in each sentences

                    if (allSentences[i].substring(j,j+1).contains(" ")) {   //To checking space in each sentences
                        countSpace++;
                    }
                }
                if (countSpace>max){
                    max = countSpace + 1 ;         // space + 1 = words in each sentences
                }
            }
        }
        return max;
    }

    public static int getSumFromString(String str){
        int result = 0;
        String number = "";

        for (int i = 1; i <= str.length(); i++) {
            if (Character.isDigit(str.charAt(i-1))){
                number += str.charAt(i-1) +"";
                if (i != str.length()){
                    if (Character.isDigit(str.charAt(i))){
                        number += (str.charAt(i)) +"";
                        i++;
                }


                }
            }
            else {
                continue;
            }
           result += Integer.parseInt(number);
            number ="";
        }

       return  result;
    }

    public static boolean isAnagrams(String str1, String str2){

        if (str1.length()==str2.length()){
            for (int i = 0; i < str1.length(); i++) {
                str2 = str2.replaceFirst(str1.charAt(i) + "","");
            }
            if (str2.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public static int[] sortAscendingOrder(int[] arr){
        int[] result = new int[arr.length];


        return result;
    }



    public static void main(String[] args) {
        System.out.println(getLength("a naa a a a a a a a aaa a a a a a a a aaaa aa aa.aa aa aa a."));

        System.out.println(getSumFromString("jav45ai15sgre1at82"));

        System.out.println(isAnagrams("listen", "tensli"));

        System.out.println(Arrays.toString(sortAscendingOrder(new int[]{9, 4, 23, 6, 78, 4})));

        System.out.println(Driver.getDriver());
    }


    }
