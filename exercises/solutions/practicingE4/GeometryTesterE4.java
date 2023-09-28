public class GeometryTesterE4 {

    public static void main (String[]args){

        RectangleE4 rectangle = new RectangleE4(2, 2);

        //rectangle.perimeter(2, 2);
        System.out.println("perimeter of rectangle= "+rectangle.perimeter(2, 2));


        CircleE4 circle = new CircleE4();
        System.out.println("circumference of circle= "+circle.circumference(3));

    }
    
}
