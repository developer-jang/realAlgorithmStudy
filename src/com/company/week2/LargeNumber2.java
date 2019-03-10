package com.company.week2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LargeNumber2 {
    public String getLargerNumber(String number, int k) {
        String answer = "";
        String header = "";
        String[] largeNumber = number.split("");
        int size = number.length();
        if (number.length() == k) return "0";
        else {

            answer += number.substring(size - k + 1, size);

            List<String> list = new ArrayList<>();
            for (int i = 0; i < largeNumber.length - k + 1; i++)
                list.add(largeNumber[i]);

            Collections.sort(list);
            for (int i = list.size() - 1; i > list.size() - k; i--) {
                header = header + list.get(i);
            }
        }
        answer = header + answer;
        return answer;
    }
}
