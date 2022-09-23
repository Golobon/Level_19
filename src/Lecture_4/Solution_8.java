package Lecture_4;


import java.io.*;
import java.io.IOException;

public class Solution_8 {
    public static void main(String[] args) throws IOException {
        String path = new BufferedReader(new InputStreamReader(System.in)).readLine();
        BufferedWriter bW = new BufferedWriter(new FileWriter(path));
        while (true) {
            String str = new BufferedReader(new InputStreamReader(System.in)).readLine();
            if (str.equals("exit")){
                bW.write(str);
                break;
            }
            bW.write(str + "\n");
        }
        bW.close();
    }
}
