package com.company.week2;

public class LargeNumber {
    public String getLargerNumber(String number, int k) {
        String answer = "";
        String header = "";
        int numberLength = number.length();
        int numbers[] = new int[numberLength - k];
        if (numberLength == k) {
            return "0";
        } else {
            for (int i = numberLength - 1; i >= numberLength - k + 1; i--) {
                answer = number.charAt(i) + answer;
            }

            for (int j = 0; j < numberLength - k; j++) {
                int value = (int) number.charAt(j) - 48;
                numbers[j] = value;
            }

        }

        for (int q = 0; q < numbers.length; q++) {
            for (int w = q + 1; w < numbers.length; w++) {
                if (numbers[q] < numbers[w]) {
                    int temp = numbers[q];
                    numbers[q] = numbers[w];
                    numbers[w] = temp;
                }
            }
        }

        for (int e = 0; e <= numbers.length - k; e++) {
            header += String.valueOf(numbers[e]);
        }
        answer = header + answer;
        return answer;
    }
}
