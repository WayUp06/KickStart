/*package com.company;

import java.util.*;
import java.io.*;
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        ArrayList<Integer> arrTorn = new ArrayList<>();
        ArrayList<Integer> arrRead = new ArrayList<>();
        int t = in.nextInt(); // Scanner has functions to read ints, longs, strings, chars, etc.
        long start = System.currentTimeMillis();
        for (int i = 1; i <= t; i++) {
            int n = in.nextInt();//count pages
            int M = in.nextInt();//count torn pages
            int Q = in.nextInt();//count readers
            for(int q = 1;q <= M; q++){
                arrTorn.add(in.nextInt());
            }

            for(int a = 1; a <= Q; a++){
                int b = 1;
                int z = in.nextInt();
                while(b*z <= n){
                    arrRead.add(b*z);
                    b++;
                }

            }

            arrRead.removeAll(arrTorn);
            int si = arrRead.size();
            System.out.println("Case #" + i + ": " + si);
            arrRead.clear();
            arrTorn.clear();




        }
        long finish = System.currentTimeMillis();
        long timeConsumedMillis = finish - start;
        System.out.println(timeConsumedMillis);
    }
}*/