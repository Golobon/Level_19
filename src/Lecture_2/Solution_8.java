package Lecture_2;

public class Solution_8 {
    public static void main(String[] args) throws Exception {
    }

    interface CanMove  {
        Double speed();
    }

    interface CanFly  extends CanMove {
        Double speed(CanFly cF);
    }
}
