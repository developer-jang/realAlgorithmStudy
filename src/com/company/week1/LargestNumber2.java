package com.company.week1;

public class LargestNumber2 {

    public String getLargestNumber(int numbers[]) {
        String answer = "";
//        {3, 30, 34, 5, 9}
        for (int i = 0; i < numbers.length; i++) {

            for (int j = i + 1; j < numbers.length; j++) {


                int iNumerator = 0;
                int iRemainder = 0;
                int iValue = numbers[i];
                if (iValue > 0 && iValue < 10) {
                    iNumerator = iValue;
                    iRemainder = 0;
                } else if (iValue >= 10 && iValue < 100) {
                    iNumerator = iValue / 10;
                    iRemainder = iValue % 10;
                } else if (iValue >= 100 && iValue < 1000) {
                    iNumerator = iValue / 100;
                    iRemainder = iValue % 100;
                } else {
                    iNumerator = iValue / 1000;
                    iRemainder = 0;
                }

                int jNumerator = 0;
                int jRemainder = 0;
                int jValue = numbers[j];
                if (jValue > 0 && jValue < 10) {
                    jNumerator = jValue;
                    jRemainder = 0;
                } else if (jValue >= 10 && jValue < 100) {
                    jNumerator = jValue / 10;
                    jRemainder = jValue % 10;
                } else if (jValue >= 100 && jValue < 1000) {
                    jNumerator = jValue / 100;
                    jRemainder = jValue % 100;
                } else {
                    jNumerator = jValue / 1000;
                    jRemainder = 0;
                }

                if (iNumerator == jNumerator) {
                    if (iRemainder == jRemainder) {
                        if (numbers[i] > numbers[j]) {
                            int temp = numbers[j];
                            numbers[j] = numbers[i];
                            numbers[i] = temp;
                        }
                    }

                    if (iRemainder < jRemainder) {
                        int temp = numbers[j];
                        numbers[j] = numbers[i];
                        numbers[i] = temp;
                    }
                }

                if (iNumerator < jNumerator) {
                    int temp = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = temp;
                }
            }
        }

        for (int k = 0; k < numbers.length; k++) {
            answer += String.valueOf(numbers[k]);
        }
        return answer;
    }
}
