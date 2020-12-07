package Movable;

public class MovablePoint implements Movable{
    private int x;
    private int y;
    private final int xSpeed;
    private final int ySpeed;
    MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public String toString() {
        return "coordinates( " + this.x + ", " + this.y + "); speed: x = " + this.xSpeed + ", y = " + this.ySpeed;
    }

    public int get_xSpeed() {
        return xSpeed;
    }

    public int get_ySpeed() {
        return ySpeed;
    }

    public void moveUp() {
        this.y += ySpeed;
    }

    public void moveDown() {
        this.y -= ySpeed;
    }

    public void moveLeft() {
        this.x -= xSpeed;
    }

    public void moveRight() {
        this.x += xSpeed;
    }
}
