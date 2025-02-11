package passo12_herança_polimorfismo_abstrato.atividade4.aplication;

import passo12_herança_polimorfismo_abstrato.atividade4.model_entities.abstract_shape;
import passo12_herança_polimorfismo_abstrato.atividade4.model_entities.circle;
import passo12_herança_polimorfismo_abstrato.atividade4.model_enums.color;
import passo12_herança_polimorfismo_abstrato.atividade4.model_entities.rectangle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<abstract_shape> list = new ArrayList<>();
        System.out.print("enter the number of shapes: ");
        int n = sc.nextInt();
        for(int i = 1; i<n+1; i++){
            System.out.println("Shape #"+i+"data: ");
            System.out.print("Rectangle or circle (r/c): ");
            char ch = sc.next().charAt(0);
            System.out.print("color (Blue/Red/Black): ");
            color color = passo12_herança_polimorfismo_abstrato.atividade4.model_enums.color.valueOf(sc.next());

            if(ch =='r'){
                System.out.print("width: ");
                double width = sc.nextDouble();
                System.out.print("height: ");
                double height = sc.nextDouble();
                abstract_shape sh = new rectangle(color,width,height);
                list.add(sh);
            }else{
                System.out.print("radius: ");
                double radius = sc.nextDouble();
                abstract_shape sh = new circle(color,radius);
                list.add(sh);
            }
        }

        System.out.println();
        System.out.println("shape areas: ");
        for(abstract_shape sh: list){
            System.out.printf("shape: %.2f - color: %s%n",sh.area(),sh.getColor());
        }
    }
}
