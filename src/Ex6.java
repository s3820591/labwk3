public class Ex6 {
}
class LinearEquation{
    private double a, b, c, d, e, f;
    public double x = ((e*d)-(b*f))/((a*d)-(b*c));
    public double y = ((a*f)-(e*c))/((a*d)-(b*c));
    public LinearEquation(double a0, double b0, double c0, double d0, double e0, double f0){
        a = a0;
        b = b0;
        c = c0;
        d = d0;
        e = e0;
        f = f0;
    }
    public double getA(){
        return a
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }
    public static boolean isSolve(double a, double b, double c, double d){
        if(((a*d)-(b*c)) != 0)
            return true;
        else return false
    }
    public double getX(){
        return x;
    }

    public double getY() {
        return y;
    }
}
