package Lecture_4;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Solution_7 {
    public static void main(String[] args) throws IOException {
        try (FileInputStream fIS = new FileInputStream(new Scanner(System.in).nextLine())){
            for (byte x : fIS.readAllBytes()) {
                System.out.print((char) x);
            }
        }
    }
}
