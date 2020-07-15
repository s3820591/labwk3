class Rectangle {
    private double height;
    private double width;
    public Rectangle(){
        height = 1;
        width = 1;
    }
    public Rectangle(double high, double wide){
         height = high;
         width = wide;
    }
    public double getHeight(){
        return height;
    }
    public double getWidth(){
        return width;
    }
    public double getArea(){
        return height*width;
    }
    public double getPerimeter(){
        return 2*(height + width);
    }
}
public class testRectangle{
    public static void main(String[] args) {
        Rectangle Rectangle0 = new Rectangle();
        Rectangle Rectangle1 = new Rectangle(4,40);
        Rectangle Rectangle2 = new Rectangle(3.5,35.9);
        System.out.println(Rectangle0.getWidth() + " " + Rectangle0.getHeight() + " " + Rectangle0.getArea() + " " + Rectangle0.getPerimeter());
        System.out.println(Rectangle1.getWidth() + " " + Rectangle1.getHeight() + " " + Rectangle1.getArea() + " " + Rectangle1.getPerimeter());
        System.out.println(Rectangle2.getWidth() + " " + Rectangle2.getHeight() + " " + Rectangle2.getArea() + " " + Rectangle2.getPerimeter());
    }
}
