package Lecture_4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_6 {
    public static void main(String[] args) throws IOException {
        BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));
        String path = bR.readLine();
        FileInputStream fIS = new FileInputStream(path);
        InputStreamReader iSR = new InputStreamReader(fIS);
        BufferedReader bR2 = new BufferedReader(iSR);
        while (bR2.ready()) {
            System.out.print(bR2.readLine());
        }
        bR.close();
        fIS.close();
        iSR.close();
        bR2.close();
    }
}