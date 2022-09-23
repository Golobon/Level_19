package Lecture_4;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution_5 {
    public static void main(String[] args) throws IOException {
        FileInputStream fIS = new FileInputStream(new Scanner(System.in).nextLine());
        BufferedReader bR = new BufferedReader(new InputStreamReader(fIS));
        while (bR.ready()) {
            System.out.println(bR.readLine());
        }
        bR.close();
    }
}

