/*
import java.io.*;
import java.util.*;
import java.lang.System;

public class Solution {
    public static void main(String [] args){
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        byte t = in.nextByte();
        for(byte i = 1; i<=t;i++){
            int N = in.nextInt();
            int Q = in.nextInt();
            String b = in.nextLine();
            String s = in.nextLine();
            String small;
            int index,result = 0;
            for (int x = 1;x<=Q;x++){
                int L = in.nextInt();
                int R = in.nextInt();
                small = s.substring(L-1,R);
                result += check(small);
            }


            System.out.println("Case #" + i + ": " + result);
        }}
    public static int check(String str) {
        if (str.length()  ==  1 || str.length() == 0) { return 1; }
        int a = str.length()%2;
        int count = 0;
        while(str.length() != 0){
            int x = str.length();
            str = str.replaceAll(Character.toString(str.charAt(0)),"");
            if( (x - str.length())%2 == 1) count ++;

        }
        if(count>a) return 0;
        return 1;
    }
}*/