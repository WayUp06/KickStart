/*package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

public class RoundH_A2019H_Index {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        byte t = in.nextByte();

        for (byte i = 1; i <= t; i++) {
            int N = in.nextInt();
            String result = "";
            Integer x;
            int y ;
            int max = 0;
            HashMap<Integer,Integer> map= new HashMap<>();
            for(int n = 1;n<=N;n++){
                y = 0;
                x = in.nextInt();
                if(x >max) max = x;
                for(int d = 1; d<= x;d++){
                    map.merge(d,1,(prev,one)->prev+one);
                }
                for(int q = 1; q <= max;q++){
                    if(q >= map.get(q)){
                        if(map.get(q) > y){y = map.get(q);}
                    }}
                result += y + " ";
            }
            System.out.println("Case #" + i + ": " + result);
        }
    }
}*/
