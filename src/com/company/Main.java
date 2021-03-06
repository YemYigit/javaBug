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
//    rand.setSeed(1000);//getting same values every time
    for (int i = 0; i < 50; i++) {//adding randomly 100 values to ArrayList
      int r = 100 + rand.nextInt() % 100;
      arLst.add(r);
    }
    Collections.sort(arLst);//sorting arLst
    //endregion

    fnPrint(arLst);//printing ArrayList to console

    //region Algorithm Main
    for (int x = 0; x < arLst.size(); x++) {
      int y = x + 1;
      if (y < arLst.size()) {
        System.out.println("o-o-o");
        System.out.println("x: " + x + " - Type(Class):" + arLst.get(x).getClass().getSimpleName() + " - value (x): " + arLst.get(x));
        System.out.println("y: " + y + " - Type(Class):" + arLst.get(y).getClass().getSimpleName() + " - value (y): " + arLst.get(y));

        //region Debug

        //region ==
        if (arLst.get(x) == arLst.get(y)) {
          System.out.println("Found with '=='");
        }
        //endregion

        //region PreDefined Variables
        if (arLst.get(x).equals(arLst.get(y))) {
          System.out.println("Found with '.equal()'");
        }
        //endregion

        //region .equal()
        int tempX, tempY;
        tempX = arLst.get(x);
        tempY = arLst.get(y);
        if (tempX == tempY) {
          System.out.println("Found with Predefined Variables");
        }
        //endregion

        //endregion

      }
    }
    //endregion

    fnPrint(arLst);//printing ArrayList to console
  }
  //endregion

  //region Printing Method
  public static void fnPrint(ArrayList<Integer> arLSt) {
    for (int i = 0; i < arLSt.size(); i++) {
      System.out.print(arLSt.get(i));
      System.out.print(" ");
    }
  }
  //endregion
}