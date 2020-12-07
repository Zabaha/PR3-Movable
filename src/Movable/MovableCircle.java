package Movable;

public class MovableCircle implements Movable{
    private final MovablePoint center;
    int radius;
    MovableCircle(MovablePoint center, int radius){
        this.center = center;
        this.radius = radius;
    }

    public String toString() {
        return this.center.toString() + "; radius: " + this.radius;
    }

    public void moveUp() {
        this.center.moveUp();
    }

    public void moveDown() {
        this.center.moveDown();
    }

    public void moveLeft() {
        this.center.moveLeft();
    }

    public void moveRight() {
        this.center.moveRight();
    }
}
