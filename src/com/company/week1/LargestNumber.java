package com.company.week1;

public class LargestNumber {

    public String getLargestNumber(int numbers[]) {
        String answer = "";
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int firstNumberLength = String.valueOf(numbers[i]).length();
                int secondNumberLength = String.valueOf(numbers[j]).length();

                if (firstNumberLength == secondNumberLength) {
                    if (numbers[i] < numbers[j]) {
                        int temp = numbers[j];
                        numbers[j] = numbers[i];
                        numbers[i] = temp;
                    }
                } else if (firstNumberLength > secondNumberLength) {
                    int diff = firstNumberLength - secondNumberLength;
                    if (numbers[i] <= numbers[j] * Math.pow(10, diff)) {
                        int temp = numbers[j];
                        numbers[j] = numbers[i];
                        numbers[i] = temp;
                    }
                } else {
                    int diff = secondNumberLength - firstNumberLength;
                    if (numbers[i] * Math.pow(10, diff) < numbers[j]) {
                        int temp = numbers[j];
                        numbers[j] = numbers[i];
                        numbers[i] = temp;
                    }
                }

            }
        }

        for (int k = 0; k < numbers.length; k++) {
            answer += String.valueOf(numbers[k]);
        }
        return answer;
    }
}
