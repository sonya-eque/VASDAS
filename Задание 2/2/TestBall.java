public class TestBall {
    public static void main(String[] args) {
        Ball football = new Ball(0, 0);
        System.out.println(football.toString());
        football.setY(67.06);
        football.setX(-9.70);
        System.out.println(football.toString());
    }

}