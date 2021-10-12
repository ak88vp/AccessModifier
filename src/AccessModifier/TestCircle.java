package AccessModifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle=new Circle();
        double area=circle.getArea();
        System.out.println(area);
        System.out.println(circle.getRadius());

    }
}
