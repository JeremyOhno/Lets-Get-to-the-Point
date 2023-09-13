/*Code created using ChatGPT AI. Code from this linked conversation: https://chat.openai.com/share/08e87ec1-5e51-4535-bc4b-01833b752cfc

    Message at the top of the Point class.

*  */

/**
 * Driver class used to test Point implementation for Project 1.
 *
 * @author Ray Hedgecock
 * @version 1.1
 */

public class Project1 {

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
        System.out.println("Shifted b " + b.distance(b2) + " away from the original position: " + b);

    }
}
