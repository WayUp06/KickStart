/*package com.company;

import java.io.*;
import java.util.*;

public class RoundF_B2019TeachMe {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    byte t = in.nextByte();
    for(int i = 1; i <= t; i++){
        int employee = in.nextInt();
        int skills = in.nextInt();
        int ci,result = 0;
        Integer emp;
        String skil;
        String [] sa;

        Map<Integer, String> skillsMap = new HashMap<Integer, String>();




        for(int e = 1; e <= employee; e++){
            emp = in.nextInt();
            skil = in.nextLine();
            skillsMap.put(emp,skil);
        }


        for(Integer xi1:skillsMap.keySet()){
            skil = skillsMap.get(xi1);
            sa = skil.split(" ");
            for(String pip:sa){
                System.out.println(pip);}
            for(Integer xi2:skillsMap.keySet()){
                if(xi1 == xi2) continue;
                for(String ski:sa){
                    if (skillsMap.get(xi2).contains(ski)) result ++;
                }
            }


        }
         /*   for (Integer key : skillsMap.keySet()) {
                System.out.println("Strategy " + key + ", Count  = " + skillsMap.get(key));}*/

 /*       System.out.println("Case #" + i + ": " + result);
    }
}
}
*/