package com.ts.demo.controller;

import javax.validation.constraints.Max;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ttt {
    public static void main(String[] args) {
      //  int ff = ttt.ff();
       // System.out.println(ff);
//        List list = new ArrayList();
//        Collections.reverse(list);
        int a = -156;
        String s1 = Integer.toString(a);
        if (s1.startsWith("-"))
        {
            s1=s1.substring(1,s1.length()-1);
            Integer.parseInt("-" + ttt.reserver(s1));
        }else{
            Integer.parseInt(ttt.reserver(s1));
        }
    }

    static String reserver(String s){
        StringBuilder stringBuilder = new StringBuilder(s);
        return stringBuilder.reverse().toString();
    }
//    static int ff(){
//        int x = 1;
//        try
//        {
//            return x;
//        }
//        finally
//        {
//            ++x;
//        }
//    }
}
