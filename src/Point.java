/*Code created using ChatGPT AI. Code from this linked conversation: https://chat.openai.com/share/08e87ec1-5e51-4535-bc4b-01833b752cfc


I started using the code from this link conversation, but ended up ditching it all: https://chat.openai.com/share/9ae9e848-9ab3-4b60-8631-176cc3133676
After having it produce code that wasn't getting the correct output, I decided to start over with a new conversation and change the starting message.
It seemed to be really struggling getting the X correct under Shfited.

After starting over, I got the AI to produce code that has the correct output. I threw in the given driver which seemed to have helped it.

Message Used to generate the code: (I'm unsure how the links work so this is here just in case.)


------------------------------------------------------------------------------------------------
Generator java code based on the following parameters.
Write a class that represents a point on a cartesian plane.
 The UML is: "C Point | f x double, f y double | m Point(), m Point(double, double) | m distance(Point) double, m getX() double, m setX(double) void, m getY() double, m setY(double) void, m setPoint( double, double) void, m shiftX(double) void, m shiftY(double) void, m rotate(double) void, m toString() String |".
  | in represents the different sections of the UML. Complete the following programming assignment:

    Design & implement a class called Point that represents a location in the Cartesian plane.
    Include (at a minimum) the following methods:
        setX(double x), setY(double y), setPoint(double x, double y) - set the coordinates of the point.
        shiftX(double n), shiftY(double n) - shift a point by a given amount along one of the axes.
        distance(Point p2) - finds the distance to point p2.
        rotate(double angle) - rotates the point by a specified angle around the origin. The formula for rotation is as follows:
        x' = x cos (θ) - y sin (θ)
        y' = x sin(θ) - y cos(θ)

        The output should look like this, "Project 1 : Point Tester

        Point 1: Point{x=3.0, y=1.0}
        Point 2: Point{x=6.0, y=5.0}

        Distance: 5.0

        Rotated a 1.5707963267948966: Point{x=-0.9999999999999998, y=3.0}
        Shifted b 4.47213595499958 away from original position: Point{x=10.0, y=3.0}"

        This is the given code already; "public class Project1 {

        public static void main(String[] args) {

        System.out.println("Project 1 : Point Tester\n");

        Point a = new Point(3.0, 1.0);
        Point b = new Point();
        b.setPoint(6.0, 5.0);

        System.out.println("Point 1: " + a);
        System.out.println("Point 2: " + b);

        System.out.println("\nDistance: " + a.distance(b));

        double rotation = Math.PI / 2.0;
        a.rotate(rotation);
        System.out.println("\nRotated a " + rotation + ": " + a);

        Point b2 = new Point(b.getX(), b.getY());
        b.shiftX(4);
        b.shiftY(-2);
        System.out.println("Shifted b " + b.distance(b2) + " away from original position: " + b);

    }
}"
------------------------------------------------------------------------------------------------
*  */

public class Point {
    private double x;
    private double y;

    // Constructors
    public Point() {
        this(0.0, 0.0);
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getters and setters
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Calculate the distance between two points
    public double distance(Point p2) {
        double dx = this.x - p2.x;
        double dy = this.y - p2.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Shift the point along the X and Y axes
    public void shiftX(double n) {
        this.x += n;
    }

    public void shiftY(double n) {
        this.y += n;
    }

    // Rotate the point around the origin by a specified angle
    public void rotate(double angle) {
        double newX = this.x * Math.cos(angle) - this.y * Math.sin(angle);
        double newY = this.x * Math.sin(angle) + this.y * Math.cos(angle);
        this.x = newX;
        this.y = newY;
    }

    @Override
    public String toString() {
        return "Point{x=" + x + ", y=" + y + "}";
    }
}
