public class Point {
    private double x, y;

    //akcesor (getter)
    public double getX() {
        return x;
    }
    //mutator (setter)
    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + this.x + ", " + y + ")";
    }

    public String toSvg() {
        return "<circle r=\"2\" cx=\"" + x + "\" cy=\"" + y + "\" fill=\"black\" /> ";
    }

    public void translate(double dx, double dy) {
        x += dx;
        this.y += dy;
    }

    public Point translated(double dx, double dy) {
        Point newPoint = new Point();
        newPoint.x = this.x + dx;
        newPoint.y = this.y + dy;

        return newPoint;
    }
}