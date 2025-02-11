package passo12_herança_polimorfismo_abstrato.atividade4;

public class circle extends shape{

    private double radius;

    public circle(){
        super();
    }

    public circle(color color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public double area() {
        return Math.PI * Math.pow(radius,2);
    }
}
