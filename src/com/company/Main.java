package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {

    //region Main Method
    public static void main(String[] args) {

        //region Preparation
        ArrayList<Integer> arLst = new ArrayList<>();
        Random rand = new Random();
        rand.setSeed(1000);//getting same values every time
        for (int i=0; i<100; i++) {//adding randomly 100 values to ArrayList
            int r = 100+rand.nextInt()%100;
            arLst.add(r);
        }
        Collections.sort(arLst);//sorting arLst
        //endregion

        fnPrint(arLst);//printing ArrayList to console

        //region Removing Duplicate Algorithm
        for (int x = 0; x < arLst.size(); x++) {
            int y = x + 1;
            if (y < arLst.size()) {
                System.out.println("o-o-o");
                System.out.println("x: " + x + " value (x): " + arLst.get(x));
                System.out.println("y: " + y + " value (y): " + arLst.get(y));
                if (arLst.get(x) == arLst.get(y)) {
                    System.out.println("Removed: " + arLst.get(y));
//                  values.remove(y);
                    System.out.println("Size :" + arLst.size());
//                  x--;
                }
            }
        }
        //endregion

        fnPrint(arLst);//printing ArrayList to console
    }
    //endregion

    //region Printing Method
    public static void fnPrint(ArrayList<Integer> arLSt){
        for(int i = 0; i < arLSt.size(); i++){
            System.out.print(arLSt.get(i));
            System.out.print(" ");
        }
    }
    //endregion
}
