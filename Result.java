/**
* Link to the question from Hackerrank
* https://www.hackerrank.com/challenges/java-date-and-time/problem?isFullScreen=true
*/

package demo;

import java.io.*;
import java.time.*;
import java.time.DayOfWeek;

class Result {

    public static String findDay(int month, int day, int year) {
        LocalDate localDate = LocalDate.of(year, month, day);
        DayOfWeek dayOfWeek = DayOfWeek.from(localDate);
        return dayOfWeek.name();
    }


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(12, 22, 1989);
        System.out.print(res);
    }
}
