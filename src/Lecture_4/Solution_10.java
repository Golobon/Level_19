package Lecture_4;

public class Solution_10 {
    public static void main(String[] args) throws Exception {
        SimpleObject<String> stringObject = new StringObject();
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }

    static class StringObject implements SimpleObject {
        public SimpleObject<String> getInstance(){
            return this;
        }
    }
}
