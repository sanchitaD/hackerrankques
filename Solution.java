package com.sanchitacodes.InvoiceManagement.controller;
import java.io.*;
import java.util.*;

import static java.util.stream.Collectors.joining;


class Result {

    /*
     * Complete the 'winner' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING erica
     *  2. STRING bob
     */

    public static String winner(String erica, String bob) {

        int ericaTotal = ericaTotalCount(erica);
        int bobTotal = bobTotalCount(bob);
        String winner = null;
        if(ericaTotal>bobTotal)
            winner = "Erica";
        else if(bobTotal>ericaTotal)
            winner = "Bob";
        else if(ericaTotal == bobTotal)
            winner = "Tie";
        return winner;
    }

    public static int ericaTotalCount(String erica){

        int counterErica = 0;
        int totalErica = 0;
        char[] ericaArray = erica.toCharArray();
        for (char diffLev : ericaArray) {
            if(diffLev == 'E'){
                counterErica+=1;
                totalErica+=counterErica;
            }
            if(diffLev == 'M'){
                counterErica+=3;
                totalErica+=counterErica;
            }
            if(diffLev == 'H'){
                counterErica+=5;
                totalErica+=counterErica;
            }

        }
        return totalErica;
    }

    public static int bobTotalCount(String bob){

        int counterBob = 0;
        int totalBob = 0;
        char[] bobArray = bob.toCharArray();
        for (char diffLevBob : bobArray) {
            if(diffLevBob == 'E'){
                counterBob+=1;
                totalBob+=counterBob;
            }
            if(diffLevBob == 'M'){
                counterBob+=3;
                totalBob+=counterBob;
            }
            if(diffLevBob == 'H'){
                counterBob+=5;
                totalBob+=counterBob;
            }

        }
        return totalBob;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String erica = bufferedReader.readLine();
//
//        String bob = bufferedReader.readLine();
        String erica = "EH";
        String bob = "EM";
        String result = Result.winner(erica,bob);
        System.out.println(result);
//        bufferedWriter.write(result);
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}

