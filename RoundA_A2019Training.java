/*import java.io.*;
import java.util.*;
import java.lang.System;

public class Solution {
    public static void main(String [] args){
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        byte t = in.nextByte();
        String s;
        String [] arrs;

        for(byte i = 1; i<=t;i++){
            int N = in.nextInt();
            int P = in.nextInt();
            int xi = 0;
            Short [] arr = new Short[N];   //short array of talents
            String useless = in.nextLine();
            s = in.nextLine();
            s = s.trim();
            arrs = s.split(" ");   //String array of talents
            for(String de:arrs){

                arr[xi] = Short.parseShort(de);
                xi++;
            }


            Arrays.sort(arr,Collections.reverseOrder());

            int result,first = 0;
            result = arr[0]*P;
            for(short count = 0; count <= N - P;count++){
                for(short k = 0;k < P-1; k++){
                    first += arr[count] - arr[count + k+1];
                }
                if(first < result) result = first;
                first = 0;
            }
            System.out.println("Case #" + i + ": " + result);



        }
    }
}*/