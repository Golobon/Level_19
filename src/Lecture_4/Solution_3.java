package Lecture_4;


import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class Solution_3 {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = null;
        BufferedInputStream buffer = null;

        try {

            inputStream = new FileInputStream("C:\\Users\\Home2020\\Desktop\\1.txt");

            buffer = new BufferedInputStream(inputStream);

            while(buffer.available()>0) {

                char c = (char)buffer.read();

                System.out.print("" + c);
            }
        } catch(Exception e) {

            e.printStackTrace();

        } finally {

            inputStream.close();
            buffer.close();
        }
    }
}
