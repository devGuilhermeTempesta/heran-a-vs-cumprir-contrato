package passo12_herança_polimorfismo_abstrato.atividade4.model_entities;

import passo12_herança_polimorfismo_abstrato.atividade4.model_enums.color;

public abstract class abstract_shape implements shape {
    private passo12_herança_polimorfismo_abstrato.atividade4.model_enums.color color;

    public abstract_shape(color color) {
        this.color = color;
    }

    public color getColor() {
        return color;
    }

    public void setColor(color color) {
        this.color = color;
    }


}
