package U1T7;

public class RectangleRunner {
    public static void main(String[] args) {
        Rectangle plot1 = new Rectangle(150, 200);
        Rectangle plot2 = new Rectangle(125);
        Rectangle plot3 = new Rectangle();
        

        plot1.setWidth(75);
        plot2.setWidth(75);
        plot3.setWidth(75);
        plot2.setLength(75);
        
        int area = plot1.getWidth() * plot1.getLength() + plot2.getWidth() * plot2.getLength() + plot3.getWidth() * plot3.getLength();
        System.out.println("These three plots requires " + area + " square feet of seed");
    }
}
/*   System.out.println("plot 1 length: " + plot1.getLength());
        System.out.println("plot 1 width: " + plot1.getWidth());
        System.out.println("plot 1 area: " + plot1.getWidth() * plot1.getLength() );
        System.out.println("");
        System.out.println("plot 2 length: " + plot2.getLength());
        System.out.println("plot 2 width: " + plot2.getWidth());
        System.out.println("plot 2 area: " + plot2.getWidth() * plot2.getLength() );
        System.out.println("");
        System.out.println("plot 3 length: " + plot3.getLength());
        System.out.println("plot 3 width: " + plot3.getWidth());
        System.out.println("plot 3 area: " + plot3.getWidth() * plot3.getLength() );  */ 