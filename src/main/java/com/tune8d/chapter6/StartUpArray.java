package com.tune8d.chapter6;

public class StartUpArray {

    private int[] locationCells;
    private int numOfHits = 0;

    public void setLocationsCells(int[] locs) {
        locationCells = locs;
    }

    public String checkYourself(int guess){
        String result = "miss";
        for (int cell : locationCells){
            if(guess == cell){
                result = "hit";
                numOfHits++;

                break;
            }
        }

        if(numOfHits == locationCells.length){
            result = "kill";
        }
        System.out.println(result);
        return result;
    }

}
