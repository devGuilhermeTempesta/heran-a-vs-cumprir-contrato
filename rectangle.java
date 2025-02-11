package passo12_herança_polimorfismo_abstrato.atividade4;

public class rectangle extends shape{

    private double weigth;
    private double height;

    public rectangle(){
        super();
    }

    public rectangle(color color, double weigth, double height) {
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
