public class Circle{
    public static double calculateCircle (double radius) {
        radius*=radius;
        radius*=Math.PI;
        return radius;
    }
    public static void main(String[] args) {
        System.out.println(calculateCircle(7.5));
    
    }
}