package passo12_herança_polimorfismo_abstrato.atividade4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<shape> list = new ArrayList<>();
        System.out.print("enter the number of shapes: ");
        int n = sc.nextInt();
        for(int i = 1; i<n+1; i++){
            System.out.println("Shape #"+i+"data: ");
            System.out.print("Rectangle or circle (r/c): ");
            char ch = sc.next().charAt(0);
            System.out.print("color (Blue/Red/Black): ");
            color color = passo12_herança_polimorfismo_abstrato.atividade4.color.valueOf(sc.next());

            if(ch =='r'){
                System.out.print("width: ");
                double width = sc.nextDouble();
                System.out.print("height: ");
                double height = sc.nextDouble();
                shape sh = new rectangle(color,width,height);
                list.add(sh);
            }else{
                System.out.print("radius: ");
                double radius = sc.nextDouble();
                shape sh = new circle(color,radius);
                list.add(sh);
            }
        }

        System.out.println();
        System.out.println("shape areas: ");
        for(shape sh: list){
            System.out.printf("shape: %.2f - color: %s%n",sh.area(),sh.getColor());
        }
    }
}
