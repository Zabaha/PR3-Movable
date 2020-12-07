package Movable;

public class MovableRectangle implements Movable{
    MovablePoint topLeft;
    MovablePoint bottomRight;
    MovableRectangle(MovablePoint topLeft, MovablePoint bottomRight){
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    @Override
    public String toString() {
        return this.topLeft.toString() + "\n" + this.bottomRight.toString();
    }

    public boolean sameSpeed(MovablePoint topLeft, MovablePoint bottomRight){
        return topLeft.get_xSpeed() == bottomRight.get_xSpeed() && topLeft.get_ySpeed() == bottomRight.get_ySpeed();
    }

    public void moveUp() {
        if(sameSpeed(topLeft, bottomRight)) {
            topLeft.moveUp();
            bottomRight.moveUp();
        }
        else{
            System.out.println("error");
        }
    }

    public void moveDown() {
        if(sameSpeed(topLeft, bottomRight)) {
            topLeft.moveDown();
            bottomRight.moveDown();
        }
        else{
            System.out.println("error");
        }
    }

    public void moveLeft() {
        if(sameSpeed(topLeft, bottomRight)) {
            topLeft.moveLeft();
            bottomRight.moveLeft();
        }
        else{
            System.out.println("error");
        }
    }

    public void moveRight() {
        if(sameSpeed(topLeft, bottomRight)) {
        topLeft.moveRight();
        bottomRight.moveRight();
        }
        else{
            System.out.println("error");
        }
    }
}
