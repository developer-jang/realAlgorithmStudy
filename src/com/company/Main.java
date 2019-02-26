package com.company;

import com.company.week1.LargestNumber3;

public class Main {

    public static void main(String[] args) {
//        int baseball [][] = {
//                {123, 1, 1}, {356, 1, 0}, {327, 2, 0}, {489, 0, 1}
//        };
//        NumberBaseBall numberBaseBall = new NumberBaseBall();
//        numberBaseBall.numberBaseBall(baseball);

        int numbers[] = {3, 29, 7, 9, 90};
//        LargestNumber largestNumber = new LargestNumber();
//        String largeNumber = largestNumber.getLargestNumber(numbers);
//        System.out.println(largeNumber);

//        LargestNumber2 largestNumber2 = new LargestNumber2();
//        String largeNumber2 = largestNumber2.getLargestNumber(numbers);
//        System.out.println(largeNumber2);

        LargestNumber3 largestNumber3 = new LargestNumber3();
        String largeNumber3 = largestNumber3.getLargestNumber(numbers);
        System.out.println(largeNumber3);
    }
}
