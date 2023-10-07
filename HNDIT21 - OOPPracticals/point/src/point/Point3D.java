
package point;

public class Point3D extends Point2D {
    private int z=0;
    public Point3D(int z,int x,int y){
        super(x,y);
        this.z=z;
    }
    
      public int getZ(){
        return z;
    }
    public void setZ(int z){
        this.z=z;
        System.out.println("new x value:"+z);
    }
    public String toString(){
        return super.toString()+"\n"+"Z value:"+z;
    }
}
