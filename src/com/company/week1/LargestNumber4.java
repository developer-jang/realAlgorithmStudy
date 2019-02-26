package com.company.week1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LargestNumber4 {

    public String getLargestNumber(int numbers[]) {
        String answer = "";
        List<String> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++)
            list.add(Integer.toString(numbers[i]));

        Collections.sort(list, (num1, num2) -> (num2 + num1).compareTo(num1 + num2));

        if (list.get(0).equals("0")) return "0";

        for (int i = 0; i < numbers.length; i++)
            answer += list.get(i);

        return answer;
    }
}
