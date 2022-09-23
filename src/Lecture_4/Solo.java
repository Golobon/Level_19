package Lecture_4;

import java.io.FileWriter;
import java.io.IOException;

public class Solo {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("C:\\Users\\Home2020\\Desktop\\2.txt");
        String x = "Hi, Bob";
        writer.write(x);
        writer.close();
    }
}
