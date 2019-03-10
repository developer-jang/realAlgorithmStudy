package com.company.week3;

import java.util.Arrays;

public class UnfinishedPlayer {
    public String getUnfinishedPlayer(String[] participant, String[] completion) {
        String answer = "";
        int participantCount = participant.length;
        int completionCount = completion.length;

        if (participantCount < 1 || participantCount > 100000)
            return "0";
        else if (completionCount < 1 || completionCount > 99999)
            return "0";
        else if (participantCount - completionCount != 1)
            return "0";
        else {
            Arrays.sort(participant);
            Arrays.sort(completion);

            for (int i = 0; i < completionCount; i++) {
                if (!participant[i].equals(completion[i])) {
                    answer = participant[i];
                    break;
                }
            }

            if (answer.equals(""))
                answer = participant[participantCount - 1];

            System.out.println(answer);
        }
        return answer;
    }
}