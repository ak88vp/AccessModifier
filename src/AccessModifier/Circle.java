package AccessModifier;

public class Circle {
    final double PI=3.14;
       private  double radius=1.0;
      private  String color="red";
       public Circle(){
        }
        public Circle(double radius){

        }
          double getRadius(){
           return this.radius;

        }
        public void setRadius(double radius){
           this.radius=radius;

        }
        public double getArea(){
           return this.radius*this.radius*PI;
        }

}

