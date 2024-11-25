package com.tune8d.sharppencil;

public class TestLoop {
    public static void main(String[] args) {
        int x = 0;
        int y = 30;
        int counterInner = 0;
        int counterOuter = 0;

        outerLoop:
        for (int outer = 0; outer < 3; outer++) {
            for (int inner = 4; inner > 1; inner--) {
                x = x + 6;
                counterInner++;
                System.out.println("inner x looped " + counterInner + " times. x = " + x);
                y = y - 2;
                System.out.println("inner y looped " + counterInner + " times. y = " + y);
                if (x == 6) {
                    break outerLoop;
                }
                x = x + 3;
                System.out.println("inner x looped " + counterInner + " times. x = " + x);
                System.out.println();

            }
            y = y - 2;
            counterOuter++;
            System.out.println("outer y looped " + counterOuter + " times. y = " + y);
            System.out.println();


        }
        System.out.println(x + " " + y);
    }
}
