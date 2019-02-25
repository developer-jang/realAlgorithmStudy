package com.company.week1;

public class NumberBaseBall {
    public int numberBaseBall(int[][] baseball) {
        int answer = 0;
        int count = 0;
        int[] availableArray = new int[988 - 123];
        for(int i = 123; i <= 987; i ++) {
            availableArray[count] = i;
            count ++;
        }

        for(int a = 0; a < baseball.length; a ++) {
            for(int b = 0; b < availableArray.length; b++) {
                int strike = 0; int ball = 0;
                for(int c = 0; c < 3; c++) {
                    for(int d = 0; d < 3; d++) {
                        if(availableArray[b] != 0 &&
                                String.valueOf(baseball[a][0]).charAt(c) == String.valueOf(availableArray[b]).charAt(d)) {
                            if(c == d)
                                strike ++;
                            else ball ++;
                        }
                    }
                }

                if(!(strike == baseball[a][1] && ball == baseball[a][2])) {
                    availableArray[b] = 0;
                }
            }
        }
        for(int e = 0; e < availableArray.length; e++) {
            if(availableArray[e] > 0 && isUnique(availableArray[e])) {
                answer ++;
            }
        }
        return answer;
    }

    private boolean isUnique(int value) {
        char firstValue = String.valueOf(value).charAt(0);
        char secondValue = String.valueOf(value).charAt(1);
        char thirdValue = String.valueOf(value).charAt(2);
        return firstValue != '0' && secondValue != '0' && thirdValue != '0'
                && firstValue != secondValue && firstValue != thirdValue  && secondValue != thirdValue ;
    }
}
