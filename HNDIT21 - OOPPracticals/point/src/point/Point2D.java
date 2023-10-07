
package point;


public class Point2D {
    private int x=0;
    private int y=0;
    
    public Point2D(int x,int y){
        this.x=x;
        this.y=y;
        
    }
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x=x;
        System.out.println("new x value:"+x);
    }
    
     public int getY(){
        return y;
    }
    public void setY(int y){
        this.y=y;
        System.out.println("new x value:"+y);
    }
  
    public String toString(){
        return "x value:"+x+"\n"+"Y value:"+y;
    }
}
