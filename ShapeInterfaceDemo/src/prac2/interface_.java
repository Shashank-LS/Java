package prac2;

public class interface_ {

    public static void main(String[] args)
    {
        double length=2.0;
        double breadth =3.0;
        Rectangle r = new Rectangle(length,breadth);
        System.out.println("area -r "+r.area());
        System.out.println("perimeter -r "+r.perimeter());

        double radius=2.0;
        Circle c = new Circle(radius);
        System.out.println("area -c "+c.area());
        System.out.println("perimeter -c "+c.perimeter());
    }
}