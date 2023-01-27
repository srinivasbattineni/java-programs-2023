package com.java.CoreJavaPrograms;
public class FinalReverseWithoutUsingInbuiltFunction {
    public static void main(String[] args) {
        String str = "SrinivaS";
        char chars[] = str.toCharArray();  // converted to character array and printed in reverse order
        for(int i= chars.length-1; i>=0; i--) {
        //	str+=
            System.out.print(chars[i]);
        }
    }
}