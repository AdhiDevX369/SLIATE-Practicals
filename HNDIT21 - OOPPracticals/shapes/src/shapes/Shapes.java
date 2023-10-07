
package shapes;

public class Shapes {

 
    public static void main(String[] args) {
        Circle c1=new Circle(7,"pink");
        Cylinder cy1=new Cylinder(10,c1.getRadius(),c1.getColor());
        System.out.println("circle circum:"+c1.Circum());
        System.out.println("circle area :"+c1.area());
        System.out.println("cylinedr area:"+cy1.area());
        System.out.println("cylinder volume:"+cy1.volume());
    }
    
}
