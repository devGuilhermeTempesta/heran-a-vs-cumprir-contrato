package passo12_herança_polimorfismo_abstrato.atividade4.model_entities;

public class circle extends abstract_shape {

    private double radius;

    public circle(passo12_herança_polimorfismo_abstrato.atividade4.model_enums.color color, double radius) {
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
