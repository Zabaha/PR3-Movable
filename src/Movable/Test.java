package Movable;

public class Test {

    public static void main(String[] args) {
        Movable pointCi = new MovablePoint(0, 0, 3, 1);
        MovablePoint center = (MovablePoint) pointCi;
        Movable circle = new MovableCircle(center, 4);
        System.out.println(circle);
        circle.moveUp();
        circle.moveLeft();
        System.out.println(circle);
        MovablePoint point1 = new MovablePoint(1,2,2,1);
        MovablePoint point2 = new MovablePoint(3,5,1,4);
        MovablePoint point3 = new MovablePoint(0,7,2,1);
        MovableRectangle r1 = new MovableRectangle(point1, point2);
        System.out.println(r1);
        r1.moveDown();
        MovableRectangle r2 = new MovableRectangle(point1, point3);
        System.out.println(r2);
        r2.moveDown();
        r2.moveRight();
        System.out.println(r2);
    }
}
