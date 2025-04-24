import java.Math.*;
abstract class shape3D
{
    abstract double calculateVolume();
    abstract double calculateSurfaceArea();
}
class sphere extends shape3D
{
    
     public double calculateVolume(double r)
     {
         return (4/3)*Math.PI*Math.pow(r,3);
     }
     public double calculateSurfaceArea(double r)
     {
         return 4*Math.PI*Math.pow(r,2);
     }
}
class cube extends shape3D
{
    public double calculateVolume(double r)
    {
        return Math.pow(r,3);
    }
    public double calculateSurfaceArea(double r)

    {
          return 6*Math.pow(r,2);
    }
}
class abstraction2
{
    public static void main(String args[])
    {
       sphere s = new sphere();
       s.calculateVolume(4);
       s.calculateSurfaceArea(3);
      cube c = new cube();
       c.calculateVolume(4);
       c.calculateSurfaceArea(3);
     }
}


      