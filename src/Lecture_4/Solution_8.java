package Lecture_4;

import java.io.*;
import java.util.Scanner;

public class Solution_8 {
    public static void main(String[] args) throws IOException {
        StringBuilder sB = new StringBuilder();
        while (true) {
            String str = new BufferedReader(new InputStreamReader(System.in)).readLine();
            if (str.equals("exit")){
                sB.append(str).append("\n");
                break;
            }
            sB.append(str).append("\n");
        }
        FileWriter fW = new FileWriter("Cool");
        BufferedWriter bW = new BufferedWriter(fW);
        bW.write(String.valueOf(sB));
    }
}
