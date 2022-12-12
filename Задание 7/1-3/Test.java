public class Test{
    public static void main(String[] args) {
        MovableRectangle rectangle = new MovableRectangle(0, 3, 4, 7);
        System.out.println("Location now: " + rectangle.toString());
        rectangle.moveDown(13);
        System.out.println("Location after moving down to 13: " + rectangle.toString());
    }
}