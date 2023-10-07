
package point;


public class Point {

    
    public static void main(String[] args) {
      Point2D p2=new Point2D(10,10);
      Point3D p3=new Point3D(15,p2.getX(),p2.getY());
      
    
        System.out.println(p3.toString());
    }
    
}
//