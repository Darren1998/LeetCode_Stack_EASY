package com.solutions;

/**
 * @author : Darren
 * @date : 2019-03-24 13:11
 * @description:
 */
public class Solution_39Steps {

    private int solution(int remainStep, int prevStep) {
        if (remainStep == 1) {
            if (prevStep % 2 == 0)
                return 0;
            return 1;
        }
        if (remainStep == 2)
            return 1;
        return solution(remainStep - 1, prevStep + 1) + solution(remainStep - 2, prevStep + 1);
    }

}
