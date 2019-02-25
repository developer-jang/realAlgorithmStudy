package com.company;

import com.company.week1.NumberBaseBall;

public class Main {

    public static void main(String[] args) {
        int baseball [][] = {
                {123, 1, 1}, {356, 1, 0}, {327, 2, 0}, {489, 0, 1}
        };
        NumberBaseBall numberBaseBall = new NumberBaseBall();
        numberBaseBall.numberBaseBall(baseball);
    }
}
