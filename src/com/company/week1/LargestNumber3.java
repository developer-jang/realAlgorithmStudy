package com.company.week1;

public class LargestNumber3 {

    public String getLargestNumber(int numbers[]) {
        String answer = "";
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                String firstValue = String.valueOf(numbers[i]) + String.valueOf(numbers[j]);
                String secondValue = String.valueOf(numbers[j]) + String.valueOf(numbers[i]);
                if (secondValue.compareTo(firstValue) > 0) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        if (numbers[0] == 0) return "0";
        for (int i = 0; i < numbers.length; i++)
            answer += numbers[i];
        return answer;
    }
}
