package labs_examples.datatypes_operators.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {

        // write code here
        //A=2πrh+2πr^2

        double pi = 3.14;
        double piSquared = pi*pi;
        double radius = pi;
        double height = 5.0;
        //area = 2*pi*radius*height+2*pi*piSquared
        double area = 2*pi*radius*height+2*pi*piSquared;
        System.out.println(area);
        float area1 = (float)area;
        long area2 = (long)area1;
        int theArea = (int)area2;
        System.out.println(theArea);



    }
}