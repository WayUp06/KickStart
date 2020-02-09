/*package com.company;
import java.io.*;
import java.util.*;
import java.lang.System;


public class Round {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        byte t = in.nextByte();
        for(int i=1; i <= t;i++){
            byte N = in.nextByte();
            int R = in.nextInt();
            int C = in.nextInt();
            int CR = in.nextInt() - 1;
            int CC = in.nextInt() - 1;
            int[][] arr = new int[C][R];
            String useless = in.nextLine();
            String s = in.nextLine();
            arr[CC][CR] = 1;
            for(int n = 0; n < N; n++){
                switch(s.charAt(n)){
                    case 'N':
                        while(true){
                            CR -= 1;
                            if(arr[CC][CR] == 0){
                                arr[CC][CR] = 1;
                                break;
                            }
                        }
                        break;
                    case 'S':
                        while(true){
                            CR += 1;
                            if(arr[CC][CR] == 0){
                                arr[CC][CR] = 1;
                                break;
                            }
                        }
                        break;

                    case 'E':
                        while(true){
                            CC += 1;
                            if(arr[CC][CR] == 0){
                                arr[CC][CR] = 1;
                                break;
                            }
                        }
                        break;

                    case 'W':
                        while(true){
                            CC -= 1;
                            if(arr[CC][CR] == 0){
                                arr[CC][CR] = 1;
                                break;
                            }
                        }
                        break;
                }
            }
            CC +=1;
            CR +=1;
            System.out.println("Case #" + i + ": " + CR + " " + CC);
        }






    }
}*/