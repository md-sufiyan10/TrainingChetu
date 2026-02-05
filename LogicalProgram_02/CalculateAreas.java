package TrainigChetu.LogicalProgram_02;

class SurfaceArea{
    double area(double r , double h){
        double l, a;
        l=Math.sqrt(r*r+h*h);
        a=(22.0/7)*r*l;
        return a;
    }
}
class VolumeArea{
    public double volume(double r, double h){
        double v=3.14 * r * r * h;
        return v;
    }
}
 public class CalculateAreas
 {
    static void main() {
        SurfaceArea sr=new SurfaceArea();
        System.out.println("Cone Surface Area: "+sr.area(7,24));

        VolumeArea va=new VolumeArea();
        System.out.println("Volume Area :"+va.volume(3,4));

    }
}
