package com.company.week2;

public class SecretMap {
    public String[] getSecretMap(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < arr1.length; i++) {
            int firstValue = arr1[i];
            int secondValue = arr2[i];
            int firstValueBinaryArrays[] = new int[n];
            int secondValueBinaryArrays[] = new int[n];
            String binaryValue = "";
            for (int j = n - 1; j >= 1; j--) {
                if (j == 1) {
                    firstValueBinaryArrays[j - 1] = firstValue / 2;
                    firstValueBinaryArrays[j] = firstValue % 2;
                    secondValueBinaryArrays[j - 1] = secondValue / 2;
                    secondValueBinaryArrays[j] = secondValue % 2;
                } else {
                    firstValueBinaryArrays[j] = firstValue % 2;
                    secondValueBinaryArrays[j] = secondValue % 2;
                    firstValue = firstValue / 2;
                    secondValue = secondValue / 2;
                }
            }

            for (int k = 0; k < n; k++) {
                if (firstValueBinaryArrays[k] == 1 || secondValueBinaryArrays[k] == 1)
                    binaryValue += "#";
                else
                    binaryValue += " ";
            }
            answer[i] = binaryValue;
        }
        return answer;
    }

}
