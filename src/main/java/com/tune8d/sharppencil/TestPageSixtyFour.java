package com.tune8d.sharppencil;

public class TestPageSixtyFour {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;

        while(x < 5){
            y += 2;
            if(y > 4){ // (4 > 4) == false
                y--;
            }
            System.out.print(x + "" + y + " ");
            x++;
        }
    }
}
