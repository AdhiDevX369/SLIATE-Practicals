
package shapes;
   
public class Cylinder extends Circle{
      private double height;
      
    public Cylinder(double height,double radius,String color){
        super(radius,color);
          this.height=height;
      }
    
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height=height;
        System.out.println("new height:"+height);
    }
    public double area(){
        double area=2*super.area()*height;
        return area;
    }
    
     public double volume(){
        double volume=super.area()*height;
        return volume;
    }
}
