package passo12_herança_polimorfismo_abstrato.atividade4.model_entities;

public class rectangle extends abstract_shape {

    private double weigth;
    private double height;


    public rectangle(passo12_herança_polimorfismo_abstrato.atividade4.model_enums.color color, double weigth, double height) {
        super(color);
        this.weigth = weigth;
        this.height = height;
    }

    public double getWeigth() {
        return weigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double area() {
        return weigth * height;
    }
}
