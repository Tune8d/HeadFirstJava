package com.tune8d.chapter6;

import java.util.ArrayList;

public class StartUp {

    private ArrayList<String> locationCells;
    private int numOfHits;

    public void setLocationsCells(ArrayList<String> locs) {
        locationCells = locs;
    }

    public String checkYourself(String userInput){
        String result = "miss";
        int index = locationCells.indexOf(userInput);

        if(index >= 0){
            locationCells.remove(index);

            if(locationCells.isEmpty()){
                result = "kill";
            }else{
                result = "hit";
            }
        }
        return result;
    }

}
