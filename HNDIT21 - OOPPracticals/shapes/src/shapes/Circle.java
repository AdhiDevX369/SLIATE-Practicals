

package shapes;


public class Circle {
    private double radius;
    private String color;
    
    public Circle(double radius,String color){
        this.radius=radius;
        this.color=color;
        
    }
    
    public double getRadius(){
        return radius;
    }
    
    public void setRadius(double radius){
        this.radius=radius;
        System.out.println("new radius:"+radius);
    }
    
    
      public String getColor(){
        return color;
    }
    
    public void setColor(String color){
        this.color=color;
        System.out.println("new color:"+color);
    }
    
    public double area(){
        double area=Math.PI*radius*radius;
        return area;
    }
    
    public double Circum(){
        double peri=2*Math.PI*radius;
        return peri;
    }
    
    
}
