package Lecture_2;

public class Solution_7 {
    public static void main(String[] args) throws Exception {
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }

    class StringObject implements SimpleObject<String>//допишите здесь ваш код
    {

        public SimpleObject<String> getInstance(){
            return null;
        }

    }
}
