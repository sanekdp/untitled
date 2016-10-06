package home300916.vector;

public class Vector {

    public final Point point1;
    public final Point point2;

    public Vector(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public double getLengthVector(){
        int lengthX = Math.abs(point1.x - point2.x);
        int lengthY = Math.abs(point1.y - point2.y);
        return Math.sqrt(lengthX * lengthX + lengthY * lengthY);
    }
}
