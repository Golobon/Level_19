package Lecture_4;

import java.io.*;
import java.util.*;

/*
Сортировка четных чисел из файла
*/

public class Solution_12 {
    public static void main(String[] args) throws IOException {
        FileInputStream path = new FileInputStream(new Scanner(System.in).nextLine());
        Scanner scanner = new Scanner(path);
        List<Integer> list = new ArrayList<>();
        while (scanner.hasNextInt()) {
            int res = scanner.nextInt();
            if (res%2==0){
                list.add(res);
            }
        }
        path.close();
        scanner.close();
        Collections.sort(list);
        list.forEach(System.out::println);
    }
}