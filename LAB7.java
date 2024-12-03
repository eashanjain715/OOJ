import java.util.Scanner;
interface Polygon {
    void area(float a);
    default void perimeter(int n, float l) {
        System.out.println("Perimeter of shape = " + (n * l));
    }
}

class Square implements Polygon {
    public void area(float a) {
        System.out.println("Area of square = " + (a * a));
    }
}

class Triangle implements Polygon {
    public void area(float a) {       
	System.out.println("Area of triangle = " + ((1.72 / 4) * (a * a)));
    }
}

public class ip {
    public static void main(String[] args) {
	Scanner cin = new Scanner(System.in);
        Square s = new Square();
        Triangle t = new Triangle();
	System.out.println("Enter side of square");
	float ss = cin.nextFloat();
	System.out.println("Enter side of triangle");
	float st = cin.nextFloat();
        s.area(ss);                  
	t.area(st);          
        s.perimeter(4, ss);  
        t.perimeter(3, st);  
    }
}
