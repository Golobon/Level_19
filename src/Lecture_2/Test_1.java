package Lecture_2;

class Dad {
    private static final String me = "dad";
    protected String getMe() {
        return me;
    }
    public void printMe() {
        System.out.println(getMe());
    }
}
class Son extends Dad {
    private static final String me = "son";
    @Override
    protected String getMe() {
        return me;
    }
}
public class Test_1 {
    public static void main(String[] args) {
        Dad dad = new Son();
        dad.printMe();
    }
}
